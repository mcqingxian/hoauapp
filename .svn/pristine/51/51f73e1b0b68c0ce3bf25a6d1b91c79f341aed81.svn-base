package com.hoau.hoauapp.business;

import java.io.IOException;
import java.util.List;

import com.hoau.hoauapp.vo.DepartmentListVO;
import com.hoau.hoauapp.vo.DistrictInfo;
import com.hoau.hoauapp.vo.HotCityResVo;
import com.hoau.hoauapp.vo.MDMDistrictInfo;

/**
 * 
 * @author 271755
 *
 */
public interface IDisService {

	List<DistrictInfo> queryProvince();

	List<DistrictInfo> queryCityByProvince(String province);

	List<DistrictInfo> queryDistrictByCity(String city);

	HotCityResVo queryHotCities();

	List<DepartmentListVO> queryDeptByDistrict(String province,String city,String county,String lon,String lat,String lim);
	
	/**
	 * @throws IOException 
	 * @zhangchao  2016.5.5日    新接口省市区统一调用MDM的接口数据，以前是从自己的数据库拿数据
	 */
	List<MDMDistrictInfo> queryDistrictFromMDM(String districtCode) throws IOException;

}
