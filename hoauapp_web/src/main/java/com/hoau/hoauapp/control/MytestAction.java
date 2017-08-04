package com.hoau.hoauapp.control;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.hoau.hoauapp.business.IDisService;
import com.hoau.hoauapp.business.IUserService;
import com.hoau.hoauapp.entity.User;
import com.hoau.hoauapp.vo.DepartmentListVO;
import com.hoau.hoauapp.vo.IntegralInfoVo;
import com.hoau.hoauapp.vo.RegisterVo;
import com.opensymphony.xwork2.ActionSupport;

@Controller
@Scope("prototype")
public class MytestAction extends ActionSupport {
	private static final long serialVersionUID = 355720151770691971L;
	@Resource
	private IUserService userService;
	@Resource
	private IDisService disService;
	/**
	 * 用于存放传过来的参数
	 */
	private IntegralInfoVo integralInfoVo;
	
	/**
	 * 用于存放传过来注册的参数
	 */
	private RegisterVo registerVo;
	/**
	 * 用于存放返回注册后的数据
	 */
	private User user;
	/**
	 * 用于存放返回受理网点的数据
	 */
	List<DepartmentListVO> list;
	
	private String province;
	private String city;
	private String county;
	private String lon;
	private String lat;
	private String lim;
	
	//新增用户积分
	public String addIntegral(){
		
		integralInfoVo = userService.addIntegral(integralInfoVo);
		return SUCCESS;
	}
	
	//手机注册送优惠券
	public String register() {
		user = userService.register(registerVo);
		return SUCCESS;
	}
	
	public String queryDeptByDistrict(){
		
		list=disService.queryDeptByDistrict(province, city, county, lon, lat, lim);
		return SUCCESS;
	}
	
	public IntegralInfoVo getIntegralInfoVo() {
		return integralInfoVo;
	}
	public void setIntegralInfoVo(IntegralInfoVo integralInfoVo) {
		this.integralInfoVo = integralInfoVo;
	}

	public RegisterVo getRegisterVo() {
		return registerVo;
	}

	public void setRegisterVo(RegisterVo registerVo) {
		this.registerVo = registerVo;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getLon() {
		return lon;
	}

	public void setLon(String lon) {
		this.lon = lon;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLim() {
		return lim;
	}

	public void setLim(String lim) {
		this.lim = lim;
	}

	public List<DepartmentListVO> getList() {
		return list;
	}

	public void setList(List<DepartmentListVO> list) {
		this.list = list;
	}
	
}
