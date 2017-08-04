package com.hoau.hoauapp.service;

import com.hoau.hoauapp.vo.GoodsQueryHistoryVo;
import com.hoau.hoauapp.vo.GoodsTraceResponse;
import com.hoau.hoauapp.vo.PriceAndTimeResponse;

public interface IGoodsTraceService {
	public GoodsTraceResponse goodsTrace(String waybill);
	
	public PriceAndTimeResponse queryPriceAndTime(String waybill);
	
	public GoodsQueryHistoryVo goodsQueryHistoryVo(String userid);
}
