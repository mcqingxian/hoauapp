package com.hoau.hoauapp.si.dc.mq.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import com.hoau.hoauapp.si.dc.mq.service.IDcMqService;

/**
 * @author 271755
 * MQ service 工厂类
 */
@Component
public class MqServiceBeanFactory implements ApplicationContextAware{
	public static ApplicationContext appContext;
	public static Map<String,String> beanMap = new HashMap<String,String>();
	
	public static Object getBeanByName(String beanName){
		return appContext.getBean(beanName);
	}
	
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		appContext = applicationContext;
		Map<String, IDcMqService> map = appContext.getBeansOfType(IDcMqService.class);
	    Iterator<String> it = map.keySet().iterator();
	    while (it.hasNext())
	    {
	      String beanName = (String)it.next();
	      IDcMqService service = (IDcMqService)map.get(beanName);
	      beanMap.put(service.getMethod(), beanName);
	    }
	}
	
}
