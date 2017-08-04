package com.hoau.hoauapp.facade;

import java.util.Date;
import java.util.List;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.ObjectMessage;
import javax.jms.Session;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import com.baidu.yun.channel.auth.ChannelKeyPair;
import com.baidu.yun.channel.client.BaiduChannelClient;
import com.baidu.yun.channel.exception.ChannelClientException;
import com.baidu.yun.channel.exception.ChannelServerException;
import com.baidu.yun.channel.model.BindInfo;
import com.baidu.yun.channel.model.PushBroadcastMessageRequest;
import com.baidu.yun.channel.model.PushBroadcastMessageResponse;
import com.baidu.yun.channel.model.PushUnicastMessageRequest;
import com.baidu.yun.channel.model.PushUnicastMessageResponse;
import com.baidu.yun.channel.model.QueryBindListRequest;
import com.baidu.yun.channel.model.QueryBindListResponse;
import com.baidu.yun.core.log.YunLogEvent;
import com.baidu.yun.core.log.YunLogHandler;
import com.hoau.hoauapp.si.dc.mq.entity.WaybillStatusEntity;
import com.hoau.hoauapp.si.dc.mq.message.ResponseMsg;
import com.hoau.hoauapp.util.JsonUtils;


public class PushTest {
    
	public static String apiKey = "GllBgbwDGAj7CA3llI592CVY";
	public static  String secretKey = "16Qiq8QTNfSHwCfpTZG5wEUm1pnADFne";
	
	public static void main(String[] args) {
//		t1();
//		t2();
//		t3("675744416865981558");
//		System.out.println("=============================");
//		t4();
		
		//String s="12345678901";
		//System.out.println(s.substring(0,3)+"++"+s.substring(7));
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("mq-send-spring.xml");
        JmsTemplate template = (JmsTemplate) applicationContext.getBean("jmsTemplate");
        Destination destination = (Destination) applicationContext.getBean("destination");
        template.send(destination, new MessageCreator() {
            public Message createMessage(Session session) throws JMSException {
            	ObjectMessage message = session.createObjectMessage(); 
            	WaybillStatusEntity waybill = new WaybillStatusEntity();
            	waybill.setConsigneeName("5AAAA");
            	waybill.setOperateDate(new Date());
            	waybill.setOrderNo("NO2015031363150");
            	waybill.setShipperMobile("15026899723");
            	waybill.setWaybillNo("A4886101");
            	ResponseMsg msg = new ResponseMsg();
            	msg.setMethod("0");
            	msg.setBody(JsonUtils.toJson(waybill));
            	message.setObject(JsonUtils.toJson(msg));
                return message;
            }
        });
        System.out.println("成功发送了一条JMS消息");
		
		
		
		
		
	}
	
	public static void t4(){
		 // 1. 设置developer平台的ApiKey/SecretKey
//        String apiKey = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
//        String secretKey = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        ChannelKeyPair pair = new ChannelKeyPair(apiKey, secretKey);

        // 2. 创建BaiduChannelClient对象实例
        BaiduChannelClient channelClient = new BaiduChannelClient(pair);

        // 3. 若要了解交互细节，请注册YunLogHandler类
        channelClient.setChannelLogHandler(new YunLogHandler() {
           
            public void onHandle(YunLogEvent event) {
                // TODO Auto-generated method stub
                System.out.println(event.getMessage());
            }
        });

        try {
            // 4. 创建请求类对象
            // 手机端的UserId， 先用1111111111111代替，用户需替换为自己的
            QueryBindListRequest request = new QueryBindListRequest();
            request.setUserId("675744416865981558");

            // 5. 调用queryBindList接口
            QueryBindListResponse response = channelClient
                    .queryBindList(request);

            // 6. 对返回的结果对象进行操作
            List<BindInfo> bindInfos = response.getBinds();
            for (BindInfo bindInfo : bindInfos) {
                long channelId = bindInfo.getChannelId();
                String userId = bindInfo.getUserId();
                int status = bindInfo.getBindStatus();
                System.out.println("channel_id:" + channelId + ", user_id: "
                        + userId + ", status: " + status);

                String bindName = bindInfo.getBindName();
                long bindTime = bindInfo.getBindTime();
                String deviceId = bindInfo.getDeviceId();
                int deviceType = bindInfo.getDeviceType();
                long timestamp = bindInfo.getOnlineTimestamp();
                long expire = bindInfo.getOnlineExpires();

                System.out.println("bind_name:" + bindName + "\t"
                        + "bind_time:" + bindTime);
                System.out.println("device_type:" + deviceType + "\tdeviceId"
                        + deviceId);
                System.out.println(String.format("timestamp: %d, expire: %d",
                        timestamp, expire));
            }

        } catch (ChannelClientException e) {
            // 处理客户端错误异常
            e.printStackTrace();
        } catch (ChannelServerException e) {
            // 处理服务端错误异常
            System.out.println(String.format(
                    "request_id: %d, error_code: %d, error_message: %s",
                    e.getRequestId(), e.getErrorCode(), e.getErrorMsg()));
        }

	}
	
	//推送单播通知
	public static void t3(String userid){
		
		 /*
         * @brief 推送单播通知(Android Push SDK拦截并解析) message_type = 1 (默认为0)
         */

        // 1. 设置developer平台的ApiKey/SecretKey
//        String apiKey = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
//        String secretKey = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        ChannelKeyPair pair = new ChannelKeyPair(apiKey, secretKey);

        // 2. 创建BaiduChannelClient对象实例
        BaiduChannelClient channelClient = new BaiduChannelClient(pair);

        // 3. 若要了解交互细节，请注册YunLogHandler类
        channelClient.setChannelLogHandler(new YunLogHandler() {
            
            public void onHandle(YunLogEvent event) {
                System.out.println(event.getMessage());
            }
        });

        try {

            // 4. 创建请求类对象
            // 手机端的ChannelId， 手机端的UserId， 先用1111111111111代替，用户需替换为自己的
            PushUnicastMessageRequest request = new PushUnicastMessageRequest();
            request.setDeviceType(3); // device_type => 1: web 2: pc 3:android
                                      // 4:ios 5:wp
           // request.setChannelId(11111111111L);
            request.setUserId(userid);

            request.setMessageType(1);
           // request.setMessage("{\"title\":\"推送单播通知\",\"description\":\"通知通知通知通知\"}");
	         request.setMessage("{\"title\":\"推送单播通知\",\"description\":\"推送单播通知 url\",'open_type': 1,'user_confirm': 0,'url': 'http://www.hoau.net'}");

            // 5. 调用pushMessage接口
            PushUnicastMessageResponse response = channelClient
                    .pushUnicastMessage(request);

            // 6. 认证推送成功
            System.out.println("push amount : " + response.getSuccessAmount());

        } catch (ChannelClientException e) {
            // 处理客户端错误异常
            e.printStackTrace();
        } catch (ChannelServerException e) {
            // 处理服务端错误异常
            System.out.println(String.format(
                    "request_id: %d, error_code: %d, error_message: %s",
                    e.getRequestId(), e.getErrorCode(), e.getErrorMsg()));
        }

	}
	
	//推送单播消息
	public static void t2(){
		 /*
         * @brief 推送单播消息(消息类型为透传，由开发方应用自己来解析消息内容) message_type = 0 (默认为0)
         */

        // 1. 设置developer平台的ApiKey/SecretKey
//        String apiKey = "GllBgbwDGAj7CA3llI592CVY";
//        String secretKey = "16Qiq8QTNfSHwCfpTZG5wEUm1pnADFne";
        ChannelKeyPair pair = new ChannelKeyPair(apiKey, secretKey);

        // 2. 创建BaiduChannelClient对象实例
        BaiduChannelClient channelClient = new BaiduChannelClient(pair);

        // 3. 若要了解交互细节，请注册YunLogHandler类
        channelClient.setChannelLogHandler(new YunLogHandler() {
            
            public void onHandle(YunLogEvent event) {
                System.out.println(event.getMessage());
            }
        });

        try {

            // 4. 创建请求类对象
            // 手机端的ChannelId， 手机端的UserId， 先用1111111111111代替，用户需替换为自己的
            PushUnicastMessageRequest request = new PushUnicastMessageRequest();
            request.setDeviceType(3); // device_type => 1: web 2: pc 3:android
                                      // 4:ios 5:wp
           // request.setChannelId(11111111111L);
            request.setUserId("675744416865981558");

            request.setMessage("Hello Channel  推送单播消息(消息类型为透传，由开发方应用自己来解析消息内容)");

            // 5. 调用pushMessage接口
            PushUnicastMessageResponse response = channelClient
                    .pushUnicastMessage(request);

            // 6. 认证推送成功
            System.out.println("push amount : " + response.getSuccessAmount());

        } catch (ChannelClientException e) {
            // 处理客户端错误异常
            e.printStackTrace();
        } catch (ChannelServerException e) {
            // 处理服务端错误异常
            System.out.println(String.format(
                    "request_id: %d, error_code: %d, error_message: %s",
                    e.getRequestId(), e.getErrorCode(), e.getErrorMsg()));
        }

	}
	
	//推送广播消息
	public static void t1(){
		/*
	     * @brief 推送广播消息(消息类型为透传，由开发方应用自己来解析消息内容) message_type = 0 (默认为0)
	     */

	    // 1. 设置developer平台的ApiKey/SecretKey
//	    String apiKey = "GllBgbwDGAj7CA3llI592CVY";
//	    String secretKey = "16Qiq8QTNfSHwCfpTZG5wEUm1pnADFne";
	    ChannelKeyPair pair = new ChannelKeyPair(apiKey, secretKey);

	    // 2. 创建BaiduChannelClient对象实例
	    BaiduChannelClient channelClient = new BaiduChannelClient(pair);

	    // 3. 若要了解交互细节，请注册YunLogHandler类
	    channelClient.setChannelLogHandler(new YunLogHandler() {
	        public void onHandle(YunLogEvent event) {
	            System.out.println(event.getMessage());
	        }
	    });

	    try {

	        // 4. 创建请求类对象
	        PushBroadcastMessageRequest request = new PushBroadcastMessageRequest();
	        request.setDeviceType(3); // device_type => 1: web 2: pc 3:android
	                                  // 4:ios 5:wp

	        
//	        request.setMessage("Hello 推送广播消息 我的消息 我来了");
	        // 若要通知，
	         request.setMessageType(1);
	         request.setMessage("{\"title\":\"通知\",\"description\":\"通知 HOAUAPP\"}");
	        // 5. 调用pushMessage接口
	        PushBroadcastMessageResponse response = channelClient
	                .pushBroadcastMessage(request);

	        // 6. 认证推送成功
	        System.out.println("-------push amount : " + response.getSuccessAmount());

	    } catch (ChannelClientException e) {
	        // 处理客户端错误异常
	        e.printStackTrace();
	    } catch (ChannelServerException e) {
	        // 处理服务端错误异常
	        System.out.println(String.format(
	                "request_id: %d, error_code: %d, error_message: %s",
	                e.getRequestId(), e.getErrorCode(), e.getErrorMsg()));
	    }
		
	}
	
	
	
}
