package com.hoau.hoauapp.util;

import com.hoau.hoauapp.si.ol.DistrictService;
import com.hoau.hoauapp.si.ol.DistrictService_Service;

public class DisServiceFactory {
	public static DistrictService getDistrictServiceHttpPort() {
		return new DistrictService_Service().getDistrictServiceImplPort();
	}
}
