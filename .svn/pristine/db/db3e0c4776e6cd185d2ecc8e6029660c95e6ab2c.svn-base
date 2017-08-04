package com.hoau.hoauapp.facade;

import java.util.List;

import javax.annotation.Resource;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.springframework.stereotype.Service;

import com.hoau.hoauapp.business.IDisService;
import com.hoau.hoauapp.constant.HttpConstant;
import com.hoau.hoauapp.util.AppUtil;
import com.hoau.hoauapp.vo.DepartmentListVO;
import com.hoau.hoauapp.vo.DepartmentRestVO;
import com.hoau.hoauapp.vo.DistrictInfo;
import com.hoau.hoauapp.vo.DistrictResVo;
import com.hoau.hoauapp.vo.HotCityResVo;
import com.hoau.hoauapp.vo.MDMDistrictInfo;
import com.hoau.hoauapp.vo.MDMDistrictResVo;


/**
 * 
 * @author 271755
 * 省市区接口
 */
@Service
@Path("/district")
@Consumes(HttpConstant.DATATYPE)
@Produces(HttpConstant.DATATYPE)
public class DistrictFacade {
	@Resource
	IDisService districtService;
	@GET
	@Path("province")
	public DistrictResVo queryProvince(){
		DistrictResVo res = new DistrictResVo();
		try {
			List<DistrictInfo> provinces = districtService.queryProvince();
			res.setDistrictInfos(provinces);
			res.setErrcode(AppUtil.EXCEPTION_STATUS_SUCCESS);
		} catch (Exception e) {
			res.setErrcode(AppUtil.EXCEPTION_STATUS_SYSTEM_ERROR);
			res.setErrmsg(e.getMessage());
		}
		return res;
	}
	
	@GET
	@Path("deptByDistrict/{province}/{city}/{county}/{lon}/{lat}/{lim}")
	public DepartmentRestVO queryDeptByDistrict(@PathParam("province")String province,
			@PathParam("city")String city,
			@PathParam("county")String county,
			@PathParam("lon")String lon,
			@PathParam("lat")String lat,
			@PathParam("lim")String lim){
		DepartmentRestVO res=new DepartmentRestVO();
		try {
			List<DepartmentListVO> lists=districtService.queryDeptByDistrict(province, city, county, lon, lat, lim);
			res.setDepartmentListVOs(lists);
			res.setErrcode(AppUtil.EXCEPTION_STATUS_SUCCESS);
		} catch (Exception e) {
			res.setErrcode(AppUtil.EXCEPTION_STATUS_SYSTEM_ERROR);
			res.setErrmsg(e.getMessage());
		}
		return res;
	}
	
	@GET
	@Path("city/{province}")
	public DistrictResVo queryCityByProvince(@PathParam("province")String province){
		DistrictResVo res = new DistrictResVo();
		try {
			List<DistrictInfo> citys = districtService.queryCityByProvince(province);
			res.setDistrictInfos(citys);
			res.setErrcode(AppUtil.EXCEPTION_STATUS_SUCCESS);
		} catch (Exception e) {
			res.setErrcode(AppUtil.EXCEPTION_STATUS_SYSTEM_ERROR);
			res.setErrmsg(e.getMessage());
		}
		return res;
	}
	
	@GET
	@Path("district/{city}")
	public DistrictResVo queryDistrict(@PathParam("city")String city){
		DistrictResVo res = new DistrictResVo();
		try {
			List<DistrictInfo> districts = districtService.queryDistrictByCity(city);
			res.setDistrictInfos(districts);
			res.setErrcode(AppUtil.EXCEPTION_STATUS_SUCCESS);
		} catch (Exception e) {
			res.setErrcode(AppUtil.EXCEPTION_STATUS_SYSTEM_ERROR);
			res.setErrmsg(e.getMessage());
		}
		return res;
	}
	
	@GET
	@Path("hotcity")
	public HotCityResVo getHotCities(){
		return districtService.queryHotCities();
	}
	/**
	 * @author zhangchao 2016.5.5
	 * @param province
	 * 省市区的新接口。数据来源MDM
	 */
	@GET
	@Path("mdmdistrict/{districtcode}")
	public MDMDistrictResVo queryDistrictFromMDM(@PathParam("districtcode")String districtcode){
		MDMDistrictResVo res = new MDMDistrictResVo();
		try {
			List<MDMDistrictInfo> districtFromMDM = districtService.queryDistrictFromMDM(districtcode);
			res.setDistrictInfos(districtFromMDM);
			res.setErrcode(AppUtil.EXCEPTION_STATUS_SUCCESS);
		} catch (Exception e) {
			res.setErrcode(AppUtil.EXCEPTION_STATUS_SYSTEM_ERROR);
			res.setErrmsg(e.getMessage());
		}
		return res;
	}
}
