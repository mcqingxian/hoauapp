package com.hoau.hoauapp.si.dc.mq.listener;

import java.util.HashMap;
import java.util.Map;

import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;

import org.apache.log4j.Logger;

import com.hoau.hoauapp.si.dc.mq.entity.WaybillStatusEntity;
import com.hoau.hoauapp.si.dc.mq.message.ResponseMsg;
import com.hoau.hoauapp.si.dc.mq.service.IDcMqService;
import com.hoau.hoauapp.si.dc.mq.util.MqServiceBeanFactory;
import com.hoau.hoauapp.util.JsonUtils;
import com.hoau.hoauapp.util.StringUtil;
/**
 * 迪辰MQ Listener
 * @author 271755
 */
public class DcMqMessageListener implements MessageListener{
	private Logger log = Logger.getLogger(getClass());
	private static Map<String,String> waybillStatusMap = new HashMap<String,String>();
	public void onMessage(Message arg0) {
		try {
			ObjectMessage message = (ObjectMessage)arg0;
			String json = (String)message.getObject();
			log.info("json:"+json);
			ResponseMsg responsMsg = JsonUtils.toObject(json, ResponseMsg.class);
			if(!StringUtil.isEmpty(responsMsg.getMethod())){
				String method = responsMsg.getMethod();
				String operType = "";
				if("0".equals(method)||"1".equals(method)||"2".equals(method)){
					operType = "WAYBILL_STATUS";
				}
				IDcMqService service = (IDcMqService)MqServiceBeanFactory.getBeanByName(MqServiceBeanFactory.beanMap.get(operType));
				if(service!= null){
					Object param = service.toObject(responsMsg.getBody());
					if("0".equals(method)||"1".equals(method)||"2".equals(method)){
						WaybillStatusEntity waybillStatus = (WaybillStatusEntity)param;
						waybillStatus.setWaybillStatus(method);
						service.service(waybillStatus);
					}else{
						service.service(param);
					}
				}else{
					log.info("无对应method");
				}
			}else{
				log.info("method为空");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
