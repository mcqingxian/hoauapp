package com.hoau.hoauapp.facade;

import java.security.SignatureException;

import javax.annotation.Resource;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.springframework.stereotype.Service;

import com.hoau.hoauapp.business.IEvaluateService;
import com.hoau.hoauapp.business.IOrderService;
import com.hoau.hoauapp.common.Signature;
import com.hoau.hoauapp.constant.HttpConstant;
import com.hoau.hoauapp.service.IOMSOrderservice;
import com.hoau.hoauapp.util.AppUtil;
import com.hoau.hoauapp.vo.OrderVo;
import com.hoau.hoauapp.vo.ResBaseVo;
import com.hoau.hoauapp.vo.ServiceEvaluateVo;

@SuppressWarnings("restriction")
@Service
@Path("/order")
@Consumes(HttpConstant.DATATYPE)
@Produces(HttpConstant.DATATYPE)
public class OrderFacade {
	@Resource
	IOrderService iOrderService;
	@Resource
	IEvaluateService evaluateService;
	@Resource
	private IOMSOrderservice oMSOrderService;
	
	@GET
	@Path("querybyuserid/{userid}")
	public ResBaseVo queryOrderByuserid(@PathParam("userid")String userid){
		return iOrderService.queryOrder(userid);
	}
	
	/*
	 * added by liji 2016-01-08
	 * start
	 */
	@GET
	@Path("querybyuserid/{userid}/{time}/{key}")
	public ResBaseVo queryOrderByuseridWithKey(@PathParam("userid")String userid,
			@PathParam("time")String time, @PathParam("key")String key){
		String sign = null;
		try {
			sign = Signature.calculateRFC2104HMAC((userid + time), AppUtil.AUTHENTICATION_KEY);
		} catch (SignatureException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(!sign.equals(key)){
			ResBaseVo r = new ResBaseVo();
			r.setErrcode(AppUtil.EXCEPTION_STATUS_AUTHENTICATION_ERROR);
			r.setErrmsg(AppUtil.EXCEPTION_STATUS_AUTHENTICATION_MESSAGE);
			return r;
		}else{
			return iOrderService.queryOrder(userid);
		}
	}
	/*
	 * end
	 */
	
	@POST
	@Path("querydetails")
	public ResBaseVo queryOrderByuserid(OrderVo vo){
		return iOrderService.queryOrder(vo);
	}
	
	@POST
	@Path("insertEvaluate")
	public ResBaseVo insertEvaluate(ServiceEvaluateVo vo){
		return evaluateService.insertEvaluate(vo);
	}
	
	@POST
	@Path("add")
	public ResBaseVo addOrder(OrderVo order){
		return oMSOrderService.addOrder(order);
	}
	@POST
	@Path("update")
	public ResBaseVo updateOrder(OrderVo order){
		return oMSOrderService.updateOrder(order);
	}
	
	@POST
	@Path("cancel")
	public ResBaseVo cancelOrder(OrderVo order){
		return oMSOrderService.cancelOrder(order);
	}
}
