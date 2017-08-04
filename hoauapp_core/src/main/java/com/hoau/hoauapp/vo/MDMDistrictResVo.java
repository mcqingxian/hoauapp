package com.hoau.hoauapp.vo;

import java.util.List;

@SuppressWarnings("serial")
public class MDMDistrictResVo extends ResBaseVo{
	List<MDMDistrictInfo> districtInfos;

	public List<MDMDistrictInfo> getDistrictInfos() {
		return districtInfos;
	}

	public void setDistrictInfos(List<MDMDistrictInfo> districtInfos) {
		this.districtInfos = districtInfos;
	}

}
