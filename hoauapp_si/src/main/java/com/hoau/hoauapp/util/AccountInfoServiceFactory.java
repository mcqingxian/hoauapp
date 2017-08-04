package com.hoau.hoauapp.util;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import com.hoau.hoauapp.constant.PropertyConstant;
import com.hoau.hoauapp.si.bank.BaseAccountInfoServices;
import com.hoau.hoauapp.si.bank.BaseAccountInfoServices_Service;

/**
 * 创建开户行查询Service的工厂类
 * @author 田育林
 */
public class AccountInfoServiceFactory {
	private static final QName SERVICE_NAME = new QName("http://10.39.251.150:8080/services/BaseAccountInfoServices", "BaseAccountInfoServices");
	private static BaseAccountInfoServices_Service accountInfoServices;
	static {
		try {
			accountInfoServices = new BaseAccountInfoServices_Service(new URL(PropertyConstant.BANK_INFO_SERVICE),SERVICE_NAME);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
	public static BaseAccountInfoServices getAccountInfoService() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return accountInfoServices.getBaseAccountInfoServicesPort();
	}
}
