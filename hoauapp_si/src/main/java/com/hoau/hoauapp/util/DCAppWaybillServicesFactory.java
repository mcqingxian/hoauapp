package com.hoau.hoauapp.util;

import java.net.MalformedURLException;
import java.net.URL;

import com.hoau.hoauapp.constant.PropertyConstant;
import com.hoau.hoauapp.si.dc.sendme.AppWaybillServices;
import com.hoau.hoauapp.si.dc.sendme.AppWaybillServices_Service;

public class DCAppWaybillServicesFactory {
	private static AppWaybillServices appWaybillServices;
	static {
		AppWaybillServices_Service appWaybillServices_Service = null;
		try {
			//"http://10.39.251.3:8080/hoaunew/services/AppWaybillServices?wsdl"
			appWaybillServices_Service = new AppWaybillServices_Service(new URL(PropertyConstant.DC_SENDME_URL));
			appWaybillServices = appWaybillServices_Service.getAppWaybillServicesPort();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
	public static AppWaybillServices getAppWaybillServices() {
		return appWaybillServices;
	}
}
