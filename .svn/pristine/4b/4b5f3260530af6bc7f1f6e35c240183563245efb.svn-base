package com.hoau.hoauapp.facade;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.stereotype.Service;

import com.hoau.hoauapp.business.IDCAndTTQPriceTimeService;
import com.hoau.hoauapp.business.IDcPriceTimeService;
import com.hoau.hoauapp.business.IPriceTimeService;
import com.hoau.hoauapp.business.impl.DCAndTTQPriceTimeService;
import com.hoau.hoauapp.business.impl.DcPriceTimeService;
import com.hoau.hoauapp.business.impl.PriceTimeService;
import com.hoau.hoauapp.constant.HttpConstant;
import com.hoau.hoauapp.entity.PriceQueryEntity;
import com.hoau.hoauapp.vo.ResBaseVo;

import net.hoau.services.howpriceandtimequeryservices.PriceQueryVo;

/**
 * 
 * @ClassName: PriceQueryFacade 
 * @Description: TODO(价格时效查询服务) 
 * @author liudeyun deyun.liu@hoau.net 
 * @date 2015年1月14日 下午3:26:51
 */
@Service
@Path("/price")
@Consumes(HttpConstant.DATATYPE)
@Produces(HttpConstant.DATATYPE)
public class PriceQueryFacade {
	
	@POST
	@Path("query")
	public ResBaseVo queryPrice(PriceQueryEntity entity){
		IPriceTimeService iPriceTimeService = new PriceTimeService();
		return iPriceTimeService.queryPrice(entity);
	}
	@POST
	@Path("queryDc")
	public ResBaseVo queryPriceDc(PriceQueryVo vo){
		IDcPriceTimeService iDcPriceTimeService = new DcPriceTimeService();	
		return iDcPriceTimeService.queryPrice(vo);
	}
	
	@POST
	@Path("queryTTQ")
	public ResBaseVo queryPriceTTQ(PriceQueryVo vo){
		IPriceTimeService iPriceTimeService = new PriceTimeService();
		return iPriceTimeService.queryPrice(vo);
	}
	@POST
	@Path("queryTime")
	public ResBaseVo queryTime(PriceQueryVo vo){
		IDCAndTTQPriceTimeService dcAndTTQPriceTimeService = new DCAndTTQPriceTimeService();
		return dcAndTTQPriceTimeService.queryPrice(vo);
	}
	
	@POST
	@Path("calcPrice")
	public ResBaseVo calcPrice(PriceQueryVo vo){
		IDCAndTTQPriceTimeService dcAndTTQPriceTimeService = new DCAndTTQPriceTimeService();
		return dcAndTTQPriceTimeService.calcPrice(vo);
	}
}
