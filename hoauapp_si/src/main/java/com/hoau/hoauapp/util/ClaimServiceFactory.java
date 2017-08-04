package com.hoau.hoauapp.util;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;

import com.hoau.hoauapp.constant.PropertyConstant;
import com.hoau.hoauapp.si.claim.ClaimsWSService;
import com.hoau.hoauapp.si.claim.ClaimsWSServiceImplService;

public class ClaimServiceFactory {
	private static final QName SERVICE_NAME = new QName("http://hoauapp.ws.erry.com/", "ClaimsWSServiceImplService");
	private static ClaimsWSServiceImplService ss;
	static {
		try {
			ss = new ClaimsWSServiceImplService(
					new URL(
							PropertyConstant.CLAIM_URL),SERVICE_NAME);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
	public static ClaimsWSService getClaimsWSService() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ss.getClaimsWSServiceImplPort();
	}
}
