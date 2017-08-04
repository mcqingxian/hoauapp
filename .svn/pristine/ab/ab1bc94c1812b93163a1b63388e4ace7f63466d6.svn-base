package com.hoau.hoauapp.business.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hoau.hoauapp.business.IEvaluateService;
import com.hoau.hoauapp.business.ISendMeOrderService;
import com.hoau.hoauapp.service.IDCMeOrderservice;
import com.hoau.hoauapp.util.AppUtil;
import com.hoau.hoauapp.vo.OrderListVo;
import com.hoau.hoauapp.vo.OrderVo;
import com.hoau.hoauapp.vo.SendMeOrderListVO;
import com.hoau.hoauapp.vo.SendMeOrderVO;
import com.hoau.hoauapp.vo.ServiceEvaluateVo;

@Service
public class SendMeOrderService implements ISendMeOrderService {
	
	@Resource
	IDCMeOrderservice idcMeOrderservice;
	@Resource
	IEvaluateService evaluateService;
	

	@Override
	public SendMeOrderListVO querySendMeOrderList(String userid) {
		SendMeOrderListVO orderListVo = idcMeOrderservice.queryOrder(userid);
		if(orderListVo.getList() == null ){
			return orderListVo;
		}
		List<ServiceEvaluateVo> serviceEvaluateVoList =null;
		Map<String,String> map = new HashMap<String,String>();
		try{
			serviceEvaluateVoList= evaluateService.selectEvaluate(userid,"SENDMEVO");
			if(serviceEvaluateVoList == null){
				return orderListVo;
			}
			for(ServiceEvaluateVo serviceEvaluateVo:serviceEvaluateVoList){
				map.put(serviceEvaluateVo.getOrderno(),serviceEvaluateVo.getAllserviceevaluat());
			}
			
		}catch(Exception e){
			orderListVo.setErrcode(AppUtil.EXCEPTION_STATUS_SYSTEM_ERROR);
			orderListVo.setErrmsg(e.getMessage());
		}
		for(SendMeOrderVO orderVo :orderListVo.getList()){
			//根据订单号匹配评分
			orderVo.setEvaluate(map.get(orderVo.getTransNo()));
		}
		return orderListVo;
	}

	@Override
	public SendMeOrderVO querySendMeOrderDetail(SendMeOrderVO vo) {
		return idcMeOrderservice.queryOrder(vo);
	}

}
