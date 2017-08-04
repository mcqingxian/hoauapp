package com.hoau.hoauapp.facade;

import java.util.List;

import javax.annotation.Resource;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.springframework.stereotype.Service;

import com.hoau.hoauapp.business.INearDeptsService;
import com.hoau.hoauapp.constant.HttpConstant;
import com.hoau.hoauapp.util.AppUtil;
import com.hoau.hoauapp.vo.CompanyVo;
import com.hoau.hoauapp.vo.DistrictInfo;
import com.hoau.hoauapp.vo.NearDeptsVo;

/** 
* @ClassName: LocationFacade 
* @Description: 位置服务
* @author xujun jun.xu@hoau.net
* @date 2015年1月12日 下午3:12:08 
*  
*/
@Service
@Path("/location")
@Consumes(HttpConstant.DATATYPE)
@Produces(HttpConstant.DATATYPE)
public class LocationFacade {
	@Resource
	private INearDeptsService nearDeptsService;
	@GET
	@Path("near/{lng}/{lat}")
	public NearDeptsVo queryNearDepts(@PathParam("lng")double lng,@PathParam("lat")double lat){
		NearDeptsVo res = new NearDeptsVo();
		try {
			List<CompanyVo> companys = nearDeptsService.queryNearDeptsByLnglat(lng,lat);
			res.setCompanys(companys);
			res.setErrcode(AppUtil.EXCEPTION_STATUS_SUCCESS);
		} catch (Exception e) {
			res.setErrcode(AppUtil.EXCEPTION_STATUS_SYSTEM_ERROR);
			res.setErrmsg(e.getMessage());
		}
		return res;
	}
}
