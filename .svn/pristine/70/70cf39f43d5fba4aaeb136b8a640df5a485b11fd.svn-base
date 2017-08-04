package com.hoau.hoauapp.business.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hoau.hoauapp.business.IEvaluateService;
import com.hoau.hoauapp.business.IOrderService;
import com.hoau.hoauapp.service.IOMSOrderservice;
import com.hoau.hoauapp.util.AppUtil;
import com.hoau.hoauapp.vo.OrderListVo;
import com.hoau.hoauapp.vo.OrderVo;
import com.hoau.hoauapp.vo.ServiceEvaluateVo;
@Service
public class OrderService implements IOrderService {
	@Resource
	IOMSOrderservice OMSOrderService;
	@Resource
	IEvaluateService evaluateService;
	
	public OrderListVo queryOrder(String userid) {
		OrderListVo orderListVo = OMSOrderService.queryOrder(userid);
		if(orderListVo.getList() == null ){
			return orderListVo;
		}
		List<ServiceEvaluateVo> serviceEvaluateVoList =null;
		Map<String,String> map = new HashMap<String,String>();
		try{
			serviceEvaluateVoList= evaluateService.selectEvaluate(userid,"ORDERVO");
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
		for(OrderVo orderVo :orderListVo.getList()){
			//根据订单号匹配评分
			orderVo.setEvaluate(map.get(orderVo.getOrderNo()));
		}
		return orderListVo;
	}

	public OrderVo queryOrder(OrderVo vo) {
		return OMSOrderService.queryOrder(vo);
	}

}
