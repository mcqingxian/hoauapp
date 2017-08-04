package com.hoau.hoauapp.service;

import com.hoau.hoauapp.entity.User;
import com.hoau.hoauapp.si.newoms.QueryUserResModel;
import com.hoau.hoauapp.vo.LoginVo;
import com.hoau.hoauapp.vo.RegisterVo;


/**
 * 用户模块接口，访问OMS系统
 * @author 277610
 * @Date 2015-01-13
 */
public interface IUserInfoService extends IOMSInterfaceService,INOMSInterfaceService{
	
	/**
	 * 登录验证
	 * @param loginVo
	 * @return
	 */
	public User login(LoginVo loginVo);

	/**
	 * 注册
	 * @param loginVo
	 * @return
	 */
	public User register(RegisterVo registerVo);
	
	/**
	 * 修改用户信息
	 * @param loginVo
	 * @return
	 */
	public User resetPwd(RegisterVo registerVo);
	
	/**
	 * 查询用户是否存在
	 * @param registerVo
	 * @return
	 */
	public QueryUserResModel queryUserInfo(String phone);
	
}
