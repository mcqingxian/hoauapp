package com.hoau.hoauapp.service;

import com.hoau.hoauapp.vo.OrderListVo;
import com.hoau.hoauapp.vo.OrderVo;
import com.hoau.hoauapp.vo.ResBaseVo;


public interface IOMSOrderservice extends IOMSInterfaceService,INOMSInterfaceService {
	public OrderListVo queryOrder(String userid) ;
	
	public OrderVo queryOrder(OrderVo vo);

	public ResBaseVo addOrder(OrderVo order);

	public ResBaseVo updateOrder(OrderVo order);
	
	public ResBaseVo cancelOrder(OrderVo order);
}
