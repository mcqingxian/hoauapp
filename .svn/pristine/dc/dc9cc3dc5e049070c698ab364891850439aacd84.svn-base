package com.hoau.hoauapp.business.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hoau.hoauapp.business.IEvaluateService;
import com.hoau.hoauapp.business.IUserService;
import com.hoau.hoauapp.mapper.ServiceEvaluateMapper;
import com.hoau.hoauapp.util.AppUtil;
import com.hoau.hoauapp.vo.IntegralInfoVo;
import com.hoau.hoauapp.vo.ResBaseVo;
import com.hoau.hoauapp.vo.ServiceEvaluateVo;
@Service
public class EvaluateService implements IEvaluateService {
	@Resource
	private ServiceEvaluateMapper serviceEvaluateMapper;
	
	@Resource
	private IUserService userService;
	
	/**
	 * 插入用户评价数据
	 */
	public ResBaseVo insertEvaluate(ServiceEvaluateVo vo) {
		ResBaseVo resBaseVo = new ResBaseVo();
		@SuppressWarnings("unchecked")
		Map<String,String> map =  vo.getServiceMap();
		map.put("advise", vo.getAdvise());
		map.put("orderno", vo.getOrderVo().getOrderNo());
		map.put("userid", vo.getOrderVo().getUserId());
		map.put("evaluatetype", vo.getEvaluatetype());
		try{
			serviceEvaluateMapper.insertEvaluate(map);
			//评价增加积分
			IntegralInfoVo integralInfoVo = new IntegralInfoVo();
			integralInfoVo.setUserId(vo.getOrderVo().getUserId());
			integralInfoVo.setType(AppUtil.USER_INTEGRAL_EVALUATION);
			integralInfoVo.setDesc("订单评价");
			userService.addIntegral(integralInfoVo);
			//返回
			resBaseVo.setErrcode(AppUtil.EXCEPTION_STATUS_SUCCESS);
		}catch(Exception e){
			resBaseVo.setErrcode(AppUtil.EXCEPTION_STATUS_SYSTEM_ERROR);
			resBaseVo.setErrmsg(e.getMessage());
		}
		return resBaseVo;
	}
	/**
	 * 查询用户评价数据
	 */
	public List<ServiceEvaluateVo> selectEvaluate(String userid,String evaluatetype) {
		return serviceEvaluateMapper.selectEvaluate(userid,evaluatetype);
	}
	
	/**
	 * 发给我的运单评价插入
	 * */
	public ResBaseVo insertSendMeEvaluate(ServiceEvaluateVo vo) {
		ResBaseVo resBaseVo = new ResBaseVo();
		@SuppressWarnings("unchecked")
		Map<String,String> map =  vo.getServiceMap();
		map.put("advise", vo.getAdvise());
		map.put("orderno", vo.getSendMeOrderVO().getTransNo());
		map.put("userid", vo.getSendMeOrderVO().getUserId());
		map.put("evaluatetype", vo.getEvaluatetype());
		try{
			serviceEvaluateMapper.insertEvaluate(map);
			resBaseVo.setErrcode(AppUtil.EXCEPTION_STATUS_SUCCESS);
		}catch(Exception e){
			resBaseVo.setErrcode(AppUtil.EXCEPTION_STATUS_SYSTEM_ERROR);
			resBaseVo.setErrmsg(e.getMessage());
		}
		return resBaseVo;
	}

}
