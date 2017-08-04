package com.hoau.hoauapp.business;

import com.hoau.hoauapp.vo.OrderListVo;
import com.hoau.hoauapp.vo.OrderVo;

public interface IOrderService {
	
	public OrderListVo queryOrder(String userid) ;
	
	public OrderVo queryOrder(OrderVo vo);
}
