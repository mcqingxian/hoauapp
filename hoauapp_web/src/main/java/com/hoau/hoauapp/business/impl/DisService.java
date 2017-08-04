package com.hoau.hoauapp.business.impl;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;

import org.codehaus.jackson.JsonNode;
import org.springframework.stereotype.Service;

import com.hoau.hoauapp.business.IDisService;
import com.hoau.hoauapp.constant.PropertyConstant;
import com.hoau.hoauapp.mapper.DistrictMapper;
import com.hoau.hoauapp.util.AppUtil;
import com.hoau.hoauapp.util.DisServiceFactory;
import com.hoau.hoauapp.util.HttpUtil;
import com.hoau.hoauapp.util.JsonHelper;
import com.hoau.hoauapp.util.JsonUtils;
import com.hoau.hoauapp.vo.DepartmentListVO;
import com.hoau.hoauapp.vo.DistrictInfo;
import com.hoau.hoauapp.vo.HotCityInfo;
import com.hoau.hoauapp.vo.HotCityResVo;
import com.hoau.hoauapp.vo.MDMDistrictInfo;

@Service
public class DisService implements IDisService{
	
	@Resource
	private DistrictMapper districtMapper;
	
	public List<DistrictInfo> queryProvince() {
		// TODO Auto-generated method stub
		return districtMapper.queryProvince();
	}

	public List<DistrictInfo> queryCityByProvince(String province) {
		// TODO Auto-generated method stub
		return districtMapper.queryCityByProvince(province);
	}

	public List<DistrictInfo> queryDistrictByCity(String city) {
		// TODO Auto-generated method stub
		return districtMapper.queryDistrictByCity(city);
	}

	public HotCityResVo queryHotCities() {
		HotCityResVo res = new HotCityResVo();
		try {
			List<HotCityInfo> districts = districtMapper.queryHotCityInfo();
			res.setDistrictInfos(districts);
			res.setErrcode(AppUtil.EXCEPTION_STATUS_SUCCESS);
		} catch (Exception e) {
			res.setErrcode(AppUtil.EXCEPTION_STATUS_SYSTEM_ERROR);
			res.setErrmsg(e.getMessage());
		}
		return res;
	}

	public List<DepartmentListVO> queryDeptByDistrict(String province, String city,String county, String lon, String lat, String lim) {
			List<DepartmentListVO> list;
			String s=DisServiceFactory.getDistrictServiceHttpPort().queryDeptByDistrict(province, city, county, lon, lat, lim);
			list=JsonUtils.toList(s, DepartmentListVO.class);
			return list;
	}

	@Override
	public List<MDMDistrictInfo> queryDistrictFromMDM(String districtCode) throws IOException {
		List<MDMDistrictInfo> list;
		 String MDMurl = PropertyConstant.MDM_DISTRICT_URL+districtCode;
		String httpGetString = HttpUtil.httpGet(MDMurl);
		JsonNode jsonNode = JsonHelper.toJsonNode(httpGetString).get("districts");
		list = JsonHelper.toList(jsonNode, MDMDistrictInfo.class);
		return list;
	}

	
}
