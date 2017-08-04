package com.hoau.hoauapp.business;

import java.util.List;

import com.hoau.hoauapp.vo.ResBaseVo;
import com.hoau.hoauapp.vo.ServiceEvaluateVo;

public interface IEvaluateService {
	public ResBaseVo insertEvaluate(ServiceEvaluateVo vo);
	
	public ResBaseVo insertSendMeEvaluate(ServiceEvaluateVo vo);
	
	public List<ServiceEvaluateVo> selectEvaluate(String userid,String evaluatetype);
}
