/**
 * 
 */
package com.hoau.hoauapp.util;

import java.net.MalformedURLException;
import java.net.URL;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.hoau.hoauapp.constant.PropertyConstant;
import com.hoau.hoauapp.si.dc.couponclipping.ObjectFactory;
import com.hoau.hoauapp.si.dc.couponclipping.OuterVocherServices;
import com.hoau.hoauapp.si.dc.couponclipping.OuterVocherServices_Service;

/**
 * @author 277610
 * @Date 2015-04-28
 */
@Component
public class DCCouponClippingFactory {

	private static Logger log = Logger.getLogger(DCCouponClippingFactory.class);

	private static OuterVocherServices_Service outerVocherServices_Service;

	private static ObjectFactory objectFactory;

	static {
		try {
			outerVocherServices_Service = new OuterVocherServices_Service(new URL(PropertyConstant.DC_URL));
			log.info("DC_CC_URL:" + PropertyConstant.DC_URL);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		objectFactory = new ObjectFactory();
	}

	private DCCouponClippingFactory() {

	}
	
	public static ObjectFactory getObjectFactory() {
		return objectFactory;
	}

	public static OuterVocherServices getOuterVocherServices_Service() {
		return outerVocherServices_Service.getOuterVocherServicesPort();
	}
}
