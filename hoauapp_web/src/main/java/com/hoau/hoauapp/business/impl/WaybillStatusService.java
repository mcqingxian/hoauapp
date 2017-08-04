package com.hoau.hoauapp.business.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hoau.hoauapp.business.IUserService;
import com.hoau.hoauapp.si.dc.mq.entity.WaybillStatusEntity;
import com.hoau.hoauapp.si.dc.mq.service.IDcMqService;
import com.hoau.hoauapp.util.JsonUtils;
/**
 * 
 * @author 271755
 * 迪辰MQ 返回货物状态处理service
 */
@Service
public class WaybillStatusService implements IDcMqService<WaybillStatusEntity>{
	@Resource
	private IUserService userService;
	
	public String getMethod() {
		return "WAYBILL_STATUS";
	}

	public void service(WaybillStatusEntity entity) {
		if("0".equals(entity.getWaybillStatus())){
			entity.setWaybillStatus("已发货");
		}
		if("1".equals(entity.getWaybillStatus())){
			entity.setWaybillStatus("已到达目的地");
		}
		if("2".equals(entity.getWaybillStatus())){
			entity.setWaybillStatus("已签收");
		}
		userService.goodsMsg(entity);
	}

	public WaybillStatusEntity toObject(String json) {
		return JsonUtils.toObject(json,WaybillStatusEntity.class);
	}
}
