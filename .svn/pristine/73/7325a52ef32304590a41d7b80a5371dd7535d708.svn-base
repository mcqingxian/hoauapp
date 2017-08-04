/**
 * 
 */
package com.hoau.hoauapp.util;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.ws.WebServiceFeature;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.hoau.hoauapp.constant.PropertyConstant;
import com.hoau.hoauapp.si.newoms.AppService;
import com.hoau.hoauapp.si.newoms.AppServicePortType;
import com.hoau.hoauapp.si.newoms.AppService_Service;
import com.hoau.hoauapp.si.oms.MobileService;
import com.hoau.hoauapp.si.oms.MobileServicePortType;
import com.hoau.hoauapp.si.oms.MobileService_Service;
import com.hoau.hoauapp.si.oms.ObjectFactory;



/**
 * @author gaojia
 *
 */
@Component
public class OMSMobileFactory{

	private static Logger log = Logger.getLogger(OMSMobileFactory.class);
//	private static MobileService mobileService;
	private static MobileService_Service mobileService;
	
	private static AppService_Service nomsAppService;
	
	private static ObjectFactory objectFactory;
	
	private static com.hoau.hoauapp.si.newoms.ObjectFactory nObjectFactory;
	static{
		try {
			mobileService = new MobileService_Service(new URL(PropertyConstant.OMS_URL));
			nomsAppService = new AppService_Service(new URL(PropertyConstant.NEW_OMS_URL));
			log.info("OMS_URL:"+PropertyConstant.OMS_URL);
			log.info("OMS_URL_NEW:"+PropertyConstant.NEW_OMS_URL);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		objectFactory = new ObjectFactory();
		nObjectFactory = new com.hoau.hoauapp.si.newoms.ObjectFactory();
	}
	private OMSMobileFactory(){
		
	}
	public static ObjectFactory getObjectFactory(){
		return objectFactory;
	}
//	public static MobileServicePortType getMobileServicePortType(){
//		return mobileService.getMobileServiceHttpPort();
//	}
	
	public static MobileService getMobileServicePortType(){
	return mobileService.getMobileServiceImplPort();
	}
	
//	public  static MobileServicePortType getMobileServicePortType(WebServiceFeature... features){
//		return mobileService.getMobileServiceHttpPort(features);
//	}
	
	public  static MobileService getMobileServicePortType(WebServiceFeature... features){
		return mobileService.getMobileServiceImplPort(features);
	}
		
	public static com.hoau.hoauapp.si.newoms.ObjectFactory getObjectNomsFactory(){
		return nObjectFactory;
	}
	public static AppService getAppServiceHttpPortType(){
		return nomsAppService.getAppServiceImplPort();
	}
	
	public  static AppService getAppServiceHttpPortType(WebServiceFeature... features){
		return nomsAppService.getAppServiceImplPort(features);
	}
//	public static AppServicePortType getAppServiceHttpPortType(){
//		return nomsAppService.getAppServiceHttpPort();
//	}
//	
//	public  static AppServicePortType getAppServiceHttpPortType(WebServiceFeature... features){
//		return nomsAppService.getAppServiceHttpPort(features);
//	}
}
