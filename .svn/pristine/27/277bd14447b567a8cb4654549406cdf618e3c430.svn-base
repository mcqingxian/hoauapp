package com.hoau.hoauapp.util;

import java.util.Date;

import com.baidu.yun.channel.auth.ChannelKeyPair;
import com.baidu.yun.channel.client.BaiduChannelClient;
import com.baidu.yun.channel.exception.ChannelClientException;
import com.baidu.yun.channel.exception.ChannelServerException;
import com.baidu.yun.channel.model.PushBroadcastMessageRequest;
import com.baidu.yun.channel.model.PushBroadcastMessageResponse;
import com.baidu.yun.channel.model.PushUnicastMessageRequest;
import com.baidu.yun.channel.model.PushUnicastMessageResponse;
import com.baidu.yun.core.log.YunLogEvent;
import com.baidu.yun.core.log.YunLogHandler;
import com.hoau.hoauapp.entity.PushMessageEntity;
import com.hoau.hoauapp.vo.MessageInfoVo;


public class PushUtil {

//	public static String APIKEY = "MV8joaCkrybvFQvTSwZqTf3l";
//	public static  String SECRETKEY = "OhGCF1IPtb84BiwYZnTCvzmIg65kyEhU";
//	public static String TITLEMSG = "货物消息";
//	public static String APIKEY_IOS = "jbKYgXGtfAjCR6BSx5mHvlzx";
//	public static  String SECRETKEY_IOS = "tyP9G4YrGnhSpV5YCLBymFmAt2MwmDAV";
//	

	/**
	 *  推送广播消息或通知 （对具体用户发送）
	 *  
	 * @param apiKey developer平台的ApiKey
	 * @param secretKey developer平台的SecretKey
	 * @param message_type 推送广播类型： 0 消息，1通知
	 * @param msg 通知或消息 具体内容 
	 * @param userid 具体用应用端userid
	 * @param devicetype 设备类型     3:android  4:ios 
	 * @param deploy_status 部署状态。指定应用当前的部署状态，可取值：1：开发状态2：生产状态  若不指定，则默认设置为生产状态。特别提醒：该功能只支持ios设备类型。
	 */
	public static void pushUnicastMessage(String apiKey,String secretKey,int message_type,String msg,String userid,int devicetype,int deploy_status){
		    // 1. 设置developer平台的ApiKey/SecretKey
		    ChannelKeyPair pair = new ChannelKeyPair(apiKey, secretKey);
		    // 2. 创建BaiduChannelClient对象实例
		    BaiduChannelClient channelClient = new BaiduChannelClient(pair);
		    // 3. 若要了解交互细节，请注册YunLogHandler类
		    channelClient.setChannelLogHandler(new YunLogHandler() {
		        public void onHandle(YunLogEvent event) {
//		            System.out.println(event.getMessage());
		        }
		    });
		    try {

		        // 4. 创建请求类对象
		    	PushUnicastMessageRequest request = new PushUnicastMessageRequest();
		        //设备类型
		    	request.setDeviceType(devicetype); // device_type => 1: web 2: pc 3:android  4:ios 5:wp
		    	if(devicetype==4){
		    		//应用部署状态
		    		request.setDeployStatus(deploy_status);
		    	}
		    	if(message_type==0){
		        	//推送广播消息(消息类型为透传，由开发方应用自己来解析消息内容) message_type = 0 (默认为0)
		        	request.setMessageType(0);
		        	request.setMessage(msg);
		        }else if(message_type==1){
		        	// 若要通知，
			         request.setMessageType(1);
			         request.setMessage(msg);

			         
		        }
//		    	System.out.println("msg:"+msg);
		        request.setUserId(userid);
		        // 5. 调用pushMessage接口
		        PushUnicastMessageResponse response = channelClient.pushUnicastMessage(request);
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
	
	

	
	/**
	 *  推送广播消息或通知 （对所有人发送）
	 *  
	 *     ******** 广播发送有频率限制 一分钟最多推送一条 *******
	 *     
	 * @param apiKey developer平台的ApiKey
	 * @param secretKey developer平台的SecretKey
	 * @param message_type 推送广播类型： 0 消息，1通知
	 * @param msg 通知或消息 具体内容
	 * @param devicetype 设备类型     3:android  4:ios 
	 * @param deploy_status 部署状态。指定应用当前的部署状态，可取值：1：开发状态2：生产状态  若不指定，则默认设置为生产状态。特别提醒：该功能只支持ios设备类型。
	 * 
	 */
	public static void pushBroadcastMessage(String apiKey,String secretKey,int message_type,String msg,int devicetype,int deploy_status){
			
		    // 1. 设置developer平台的ApiKey/SecretKey
		    ChannelKeyPair pair = new ChannelKeyPair(apiKey, secretKey);

		    // 2. 创建BaiduChannelClient对象实例
		    BaiduChannelClient channelClient = new BaiduChannelClient(pair);

		    // 3. 若要了解交互细节，请注册YunLogHandler类
		    channelClient.setChannelLogHandler(new YunLogHandler() {
		        public void onHandle(YunLogEvent event) {
		          //  System.out.println(event.getMessage());
		        }
		    });

		    try {

		        // 4. 创建请求类对象
		        PushBroadcastMessageRequest request = new PushBroadcastMessageRequest();
		        request.setDeviceType(devicetype); // device_type => 1: web 2: pc 3:android // 4:ios 5:wp
		        if(devicetype==4){
		        	request.setDeployStatus(deploy_status);
		        }
		        if(message_type==0){
		        	//推送广播消息(消息类型为透传，由开发方应用自己来解析消息内容) message_type = 0 (默认为0)
		        	request.setMessageType(0);
		        	request.setMessage(msg);
		        }else if(message_type==1){
		        	// 若要通知，
			         request.setMessageType(1);
			         //request.setMessage("{\"title\":\""+title+"\",\"description\":\""+msg+"\"}");
			         request.setMessage(msg);
		        }

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
	
	
	public static void main(String[] args) {

		  String msg="通知消息内容： 1个团队 ，2大转变 ，3大创新， 4大产品。。。";
		  String title="HOAU通知";
	
		  PushMessageEntity pe = new PushMessageEntity();
		  pe.setTitle("我的消息");
		  pe.setDescription("消息内容简介");
		  pe.setNotification_builder_id(0);
		//5：响铃 3:振动   1:无声音无振动  7:响铃加振动
		  pe.setNotification_basic_style(1);
		  MessageInfoVo mvo = new MessageInfoVo();
		  mvo.setId(11111);
		  mvo.setUserid("40084");
		  mvo.setStatus("货物已签收");
		  mvo.setOrdernum("小强");
		  mvo.setOperationdate(new Date());
		  pe.setCustom_content(mvo);
		  
		  
		 String st = JsonUtils.toJson(pe);
		  
		 System.out.println("--------->>>>>>>>>>>:"+st);
			
//		 pushUnicastMessage(APIKEY_IOS,SECRETKEY_IOS,1,st,"894854402940593792",4,1);
		 
		 
		 
		 
//		 pushUnicastMessage(APIKEY,SECRETKEY,1,st,"663643055895669110",3,0);
//		 pushUnicastMessage(APIKEY,SECRETKEY,1,st,"663643055895669110",3,0);
//		 pushUnicastMessage(APIKEY,SECRETKEY,1,st,"663643055895669110",3,0);
			
		// pushBroadcastMessage(APIKEY,SECRETKEY,1,st);
//         request.setMessage("{\"title\":\"test\",\"description\":\"123456\",\"notification_basic_style\":\"3\",\"aps\": {\"alert\":\"华宇ios\",\"sound\":\"msg.wav\",\"badge\":1} }");
         
//         \"aps\": {\"alert\":\"Message From Baidu Push\",\"sound\":\"msg.wav\",\"badge\":1}
	 	
	 	
	}
	
	
	
		
}
