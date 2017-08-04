package com.hoau.hoauapp.facade;

import javax.annotation.Resource;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.springframework.stereotype.Service;

import com.hoau.hoauapp.business.IEvaluateService;
import com.hoau.hoauapp.business.ISendMeOrderService;
import com.hoau.hoauapp.constant.HttpConstant;
import com.hoau.hoauapp.vo.ResBaseVo;
import com.hoau.hoauapp.vo.SendMeOrderVO;
import com.hoau.hoauapp.vo.ServiceEvaluateVo;

@SuppressWarnings("restriction")
@Service
@Path("/sendmeorder")
@Consumes(HttpConstant.DATATYPE)
@Produces(HttpConstant.DATATYPE)
public class SendMeOrderFacade {
	@Resource
	ISendMeOrderService iOrderService;
	@Resource
	IEvaluateService evaluateService;
//	@Resource
//	private IOMSOrderservice oMSOrderService;
	
	@GET
	@Path("querybyuserid/{userid}")
	public ResBaseVo queryOrderByuserid(@PathParam("userid")String userid){
		
		return iOrderService.querySendMeOrderList(userid);
	}
	
	@POST
	@Path("querydetails")
	public ResBaseVo queryOrderByuserid(SendMeOrderVO vo){
		return iOrderService.querySendMeOrderDetail(vo);
	}
	
	@POST
	@Path("insertEvaluate")
	public ResBaseVo insertEvaluate(ServiceEvaluateVo vo){
		return evaluateService.insertSendMeEvaluate(vo);
	}
//	
//	@POST
//	@Path("add")
//	public ResBaseVo addOrder(OrderVo order){
//		return oMSOrderService.addOrder(order);
//	}
//	@POST
//	@Path("update")
//	public ResBaseVo updateOrder(OrderVo order){
//		return oMSOrderService.updateOrder(order);
//	}
//	
//	@POST
//	@Path("cancel")
//	public ResBaseVo cancelOrder(OrderVo order){
//		return oMSOrderService.cancelOrder(order);
//	}
}
