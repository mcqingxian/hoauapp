package com.hoau.hoauapp.facade;

import javax.annotation.Resource;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.springframework.stereotype.Service;

import com.hoau.hoauapp.constant.HttpConstant;
import com.hoau.hoauapp.service.IGoodsTraceService;
import com.hoau.hoauapp.vo.GoodsQueryHistoryVo;
import com.hoau.hoauapp.vo.GoodsTraceResponse;
import com.hoau.hoauapp.vo.PriceAndTimeResponse;

/** 
* @ClassName: GoodsFacade 
* @Description: 货物服务
* @author xujun jun.xu@hoau.net
* @date 2015年1月12日 下午3:12:18 
*  
*/
@Service
@Path("/goods")
@Consumes(HttpConstant.DATATYPE)
@Produces(HttpConstant.DATATYPE)
public class GoodsFacade {
	
	@Resource
	private IGoodsTraceService goodsTraceService;
	
	@GET
	@Path("trace/{waybill}")
	public GoodsTraceResponse goodsTrace(@PathParam("waybill")String waybill){
		return goodsTraceService.goodsTrace(waybill);
	}
	
	
	@POST
	@Path("price_and_time")
	public PriceAndTimeResponse queryPriceAndTime(){
		return goodsTraceService.queryPriceAndTime("");
	}
	
	@GET
	@Path("queryhis/{userid}")
	public GoodsQueryHistoryVo goodsQueryHistoryVo(@PathParam("userid")String userid){
		return goodsTraceService.goodsQueryHistoryVo(userid);
	}
}
