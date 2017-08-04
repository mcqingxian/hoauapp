package com.hoau.hoauapp;

import java.util.Date;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.ObjectMessage;
import javax.jms.Session;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import com.hoau.hoauapp.si.dc.mq.entity.WaybillStatusEntity;
import com.hoau.hoauapp.si.dc.mq.message.ResponseMsg;
import com.hoau.hoauapp.util.JsonUtils;

public class DCMqTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("mq-send-spring.xml");
        JmsTemplate template = (JmsTemplate) applicationContext.getBean("jmsTemplate");
        Destination destination = (Destination) applicationContext.getBean("destination");
        template.send(destination, new MessageCreator() {
            public Message createMessage(Session session) throws JMSException {
            	ObjectMessage message = session.createObjectMessage(); 
            	WaybillStatusEntity waybill = new WaybillStatusEntity();
            	waybill.setConsigneeName("AAA");
            	waybill.setOperateDate(new Date());
            	waybill.setOrderNo("NO201503096639");
            	waybill.setShipperMobile("15026899723");
            	waybill.setWaybillNo("YF123456");
            	ResponseMsg msg = new ResponseMsg();
            	msg.setMethod("0");
            	msg.setBody(JsonUtils.toJson(waybill));
            	message.setObject(JsonUtils.toJson(msg));
                return message;
            }
        });
        System.out.println("成功发送了一条JMS消息");
	}
}
