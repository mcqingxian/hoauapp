package com.hoau.hoauapp.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.springframework.stereotype.Service;

import com.hoau.hoauapp.exception.BusinessException;
import com.hoau.hoauapp.service.IOMSOrderservice;
import com.hoau.hoauapp.si.newoms.ArrayOfOrderModel;
import com.hoau.hoauapp.si.newoms.ModifyOrderResModel;
import com.hoau.hoauapp.si.newoms.OrderModel;
import com.hoau.hoauapp.si.newoms.PhoneOrderResModel;
import com.hoau.hoauapp.si.newoms.QueryAppOrdersResModel;
import com.hoau.hoauapp.si.newoms.QueryOrdersReqModel;
import com.hoau.hoauapp.si.oms.CancelOrderReqModel;
import com.hoau.hoauapp.si.oms.CancelOrderResModel;
import com.hoau.hoauapp.si.oms.GetPhoneOrderReqModel;
import com.hoau.hoauapp.si.oms.GetPhoneOrderResModel;
import com.hoau.hoauapp.si.oms.PhoneOrderReqModel;
import com.hoau.hoauapp.util.AppUtil;
import com.hoau.hoauapp.util.StringUtil;
import com.hoau.hoauapp.vo.OrderListVo;
import com.hoau.hoauapp.vo.OrderVo;
import com.hoau.hoauapp.vo.ResBaseVo;
/**
 * 
 * @ClassName: OMSOrderService 
 * @Description: 订单后台服务 
 * @author liudeyun deyun.liu@hoau.net 
 * @date 2015年1月22日 上午10:43:21
 */
@Service
public class OMSOrderService implements IOMSOrderservice {

	/**
	 * 查询订单
	 */
	@SuppressWarnings("restriction")
	public OrderListVo queryOrder(String userid) {
		//userid = "40079";
		OrderListVo listVo = new OrderListVo();
//		QueryOrdersReqModel queryOrdersReqModel = new QueryOrdersReqModel();
//		queryOrdersReqModel.setCustomerID(nomsObjectFactory.createQueryOrdersReqModelCustomerID(userid));
		
		QueryOrdersReqModel queryOrdersReqModel = nomsObjectFactory.createQueryOrdersReqModel();
		queryOrdersReqModel.setCustomerID(userid);
				
		Date date = new Date();
		GregorianCalendar start = new GregorianCalendar();
		start.setTime(date);
		GregorianCalendar end = new GregorianCalendar();
		end.setTime(date);
		/*
		 * 设置只能查看订单时间 gc.add(1,-1)表示年份减一. gc.add(2,-1)表示月份减一. gc.add(3.-1)表示周减一.
		 * gc.add(5,-1)表示天减一. 以此类推应该可以精确的毫秒
		 */
		start.add(1, -2);
		XMLGregorianCalendar startTime = null;
		XMLGregorianCalendar endTime = null;
		try {
			startTime = DatatypeFactory.newInstance().newXMLGregorianCalendar(
					start);
			endTime = DatatypeFactory.newInstance()
					.newXMLGregorianCalendar(end);
		} catch (DatatypeConfigurationException e) {
			e.printStackTrace();
		}
		queryOrdersReqModel.setStartTime(startTime);
		queryOrdersReqModel.setEndTime(endTime);
		QueryAppOrdersResModel queryAppOrdersResModel = nomsPortType.queryOrder(queryOrdersReqModel);
		
		if (queryAppOrdersResModel.isResult()) {
//			ArrayOfOrderModel arrayOfQueryOrderModel = queryAppOrdersResModel.getQueryOrderModel();
			List<OrderModel> queryOrderModelList = queryAppOrdersResModel.getQueryOrderModel();
			ArrayList<OrderVo> orderList = convertToOrderVo(queryOrderModelList,userid);
			listVo.setList(orderList);
			listVo.setErrcode(AppUtil.EXCEPTION_STATUS_SUCCESS);
		} else {
			listVo.setErrcode(AppUtil.EXCEPTION_STATUS_BUSINESS_ERROR);
			listVo.setErrmsg(queryAppOrdersResModel.getResultInfo());
		}
//		if (queryAppOrdersResModel.getResult().getValue()) {
//			ArrayOfOrderModel arrayOfQueryOrderModel = queryAppOrdersResModel
//					.getQueryOrderModel().getValue();
//			List<OrderModel> queryOrderModelList = arrayOfQueryOrderModel
//					.getOrderModel();
//			ArrayList<OrderVo> orderList = convertToOrderVo(queryOrderModelList,userid);
//			listVo.setList(orderList);
//			listVo.setErrcode(AppUtil.EXCEPTION_STATUS_SUCCESS);
//		} else {
//			listVo.setErrcode(AppUtil.EXCEPTION_STATUS_BUSINESS_ERROR);
//			listVo.setErrmsg(queryAppOrdersResModel.getResultInfo().getValue());
//		}
		return listVo;
	}
	/**
	 * @Method: convertToOrderVo 
	 * @Description: 将返回信息转换为订单实体
	 * @author liudeyun deyun.liu@hoau.net 
	 * @date 2015年2月2日 下午8:13:00
	 */
	@SuppressWarnings("restriction")
	private ArrayList<OrderVo> convertToOrderVo(
			List<OrderModel> queryOrderModelList,String userid) {
		ArrayList<OrderVo> orderList = new ArrayList<OrderVo>();
		for (OrderModel orderModel : queryOrderModelList) {
			OrderVo orderVo = new OrderVo();
			orderVo.setUserId(userid);
			if(orderModel.getOrderStatus()!=null){
				//订单状态
				orderVo.setOrderStatus(orderModel.getOrderStatus());
			}
			if(orderModel.getOrderNo()!=null){
				//订单编号	
				orderVo.setOrderNo(orderModel.getOrderNo());
			}
			if(orderModel.getTransNo()!=null){
				//运单编号
				orderVo.setTransNo(orderModel.getTransNo());
			}
			
			if(orderModel.getSenddate()!=null){
				//发货时间
				orderVo.setSenddate(orderModel.getSenddate()
						.toGregorianCalendar().getTime());
			}
			if(orderModel.getShipperName()!=null){
				//发货人姓名
				orderVo.setShipperName(orderModel.getShipperName());
			}
			if(orderModel.getShipperMobile()!=null){
				//发货人手机号
				orderVo.setShipperMobile(orderModel.getShipperMobile());
			}
			if(orderModel.getShipperProvince()!=null){
				//发货人省份
				orderVo.setShipperProvince(orderModel.getShipperProvince());
			}
			if(orderModel.getShipperCity()!=null){
				//发货城市
				orderVo.setShipperCity(orderModel.getShipperCity());
			}
			if(orderModel.getShipperArea()!=null){
				//发货区域
				orderVo.setShipperArea(orderModel.getShipperArea());
			}
			if(orderModel.getShipperAddress()!=null){
				//发货地址
				orderVo.setShipperAddress(orderModel.getShipperAddress());
			}
			if(orderModel.getConsigneeName()!=null){
				//收货人姓名
				orderVo.setConsigneeName(orderModel.getConsigneeName());
			}
			if(orderModel.getConsigneeMobile()!=null){
				//收货人手机
				orderVo.setConsigneeMobile(orderModel.getConsigneeMobile());
			}
			if(orderModel.getConsigneeProvince()!=null){
				//收货省份
				orderVo.setConsigneeProvince(orderModel.getConsigneeProvince());
			}
			if(orderModel.getConsigneeCity()!=null){
				//收货城市
				orderVo.setConsigneeCity(orderModel.getConsigneeCity());
			}
			if(orderModel.getConsigneeArea()!=null){
				//收货区域
				orderVo.setConsigneeArea(orderModel.getConsigneeArea());
			}
			if(orderModel.getConsigneeAddress()!=null){
				//收货地址
				orderVo.setConsigneeAddress(orderModel.getConsigneeAddress());
			}
			if(orderModel.getCargoName()!=null){
				//货物名称
				orderVo.setCargoName(orderModel.getCargoName());
			}
			if(orderModel.getCargoVolume()!=0){
				//货物体积
				orderVo.setCargoVolume(orderModel.getCargoVolume());
			}
			if(orderModel.getCargoWeight()!=0){
				//货物重量
				orderVo.setCargoWeight(orderModel.getCargoWeight());
			}
			if(orderModel.getCargoWeight()!=0){
				//件数
				orderVo.setCargoPiece(orderModel.getCargoPiece());
			}
			if(orderModel.getRemarks()!=null){
				//件数
				orderVo.setRemarks(orderModel.getRemarks());
			}
			if(orderModel.getProductTypeName()!=null){
				//产品名称
				orderVo.setProductTypeName(orderModel.getProductTypeName());
			}
			
//			if(orderModel.getOrderStatus()!=null){
//				//订单状态
//				orderVo.setOrderStatus(orderModel.getOrderStatus().getValue());
//			}
//			if(orderModel.getOrderNo()!=null){
//				//订单编号	
//				orderVo.setOrderNo(orderModel.getOrderNo().getValue());
//			}
//			if(orderModel.getTransNo()!=null){
//				//运单编号
//				orderVo.setTransNo(orderModel.getTransNo().getValue());
//			}
//			
//			if(orderModel.getSenddate()!=null){
//				//发货时间
//				orderVo.setSenddate(orderModel.getSenddate()
//						.toGregorianCalendar().getTime());
//			}
//			if(orderModel.getShipperName()!=null){
//				//发货人姓名
//				orderVo.setShipperName(orderModel.getShipperName().getValue());
//			}
//			if(orderModel.getShipperMobile()!=null){
//				//发货人手机号
//				orderVo.setShipperMobile(orderModel.getShipperMobile().getValue());
//			}
//			if(orderModel.getShipperProvince()!=null){
//				//发货人省份
//				orderVo.setShipperProvince(orderModel.getShipperProvince().getValue());
//			}
//			if(orderModel.getShipperCity()!=null){
//				//发货城市
//				orderVo.setShipperCity(orderModel.getShipperCity().getValue());
//			}
//			if(orderModel.getShipperArea()!=null){
//				//发货区域
//				orderVo.setShipperArea(orderModel.getShipperArea().getValue());
//			}
//			if(orderModel.getShipperAddress()!=null){
//				//发货地址
//				orderVo.setShipperAddress(orderModel.getShipperAddress().getValue());
//			}
//			if(orderModel.getConsigneeName()!=null){
//				//收货人姓名
//				orderVo.setConsigneeName(orderModel.getConsigneeName()
//						.getValue());
//			}
//			if(orderModel.getConsigneeMobile()!=null){
//				//收货人手机
//				orderVo.setConsigneeMobile(orderModel.getConsigneeMobile().getValue());
//			}
//			if(orderModel.getConsigneeProvince()!=null){
//				//收货省份
//				orderVo.setConsigneeProvince(orderModel.getConsigneeProvince().getValue());
//			}
//			if(orderModel.getConsigneeCity()!=null){
//				//收货城市
//				orderVo.setConsigneeCity(orderModel.getConsigneeCity().getValue());
//			}
//			if(orderModel.getConsigneeArea()!=null){
//				//收货区域
//				orderVo.setConsigneeArea(orderModel.getConsigneeArea().getValue());
//			}
//			if(orderModel.getConsigneeAddress()!=null){
//				//收货地址
//				orderVo.setConsigneeAddress(orderModel.getConsigneeAddress().getValue());
//			}
//			if(orderModel.getCargoName()!=null){
//				//货物名称
//				orderVo.setCargoName(orderModel.getCargoName().getValue());
//			}
//			if(orderModel.getCargoVolume()!=null){
//				//货物体积
//				orderVo.setCargoVolume(orderModel.getCargoVolume());
//			}
//			if(orderModel.getCargoWeight()!=null){
//				//货物重量
//				orderVo.setCargoWeight(orderModel.getCargoWeight());
//			}
//			if(orderModel.getCargoWeight()!=null){
//				//件数
//				orderVo.setCargoPiece(orderModel.getCargoPiece());
//			}
//			if(orderModel.getRemarks()!=null){
//				//件数
//				orderVo.setRemarks(orderModel.getRemarks().getValue());
//			}
//			if(orderModel.getProductTypeName()!=null){
//				//产品名称
//				orderVo.setProductTypeName(orderModel.getProductTypeName().getValue());
//			}
			
			orderList.add(orderVo);
		}
		return orderList;
	}
	/**根据用户编号和订单编号查询订单详情
	 * 
	 */
	@SuppressWarnings("restriction")
	public OrderVo queryOrder(OrderVo vo) {
		if(StringUtil.isEmpty(vo.getOrderNo())){
			vo.setErrcode(AppUtil.CALL_INTERFACE_EXCEPTION);
			vo.setErrmsg("订单号不能为空");
			return vo;
		}
//		GetPhoneOrderReqModel getPhoneOrderReqModel = new GetPhoneOrderReqModel();
		GetPhoneOrderReqModel getPhoneOrderReqModel = objectFactory.createGetPhoneOrderReqModel();
//		getPhoneOrderReqModel.setOrderNo(objectFactory.createGetPhoneOrderReqModelOrderNo(vo.getOrderNo()));
//		getPhoneOrderReqModel.setUserid(objectFactory.createGetPhoneOrderReqModelUserid(vo.getUserId()));
		getPhoneOrderReqModel.setOrderNo(vo.getOrderNo());
		getPhoneOrderReqModel.setUserid(vo.getUserId());
		GetPhoneOrderResModel getPhoneOrderResModel;
		try{
			getPhoneOrderResModel = portType.queryOrderDetail(getPhoneOrderReqModel);
		}catch(Exception e){
			vo.setErrcode(AppUtil.CALL_INTERFACE_EXCEPTION);
			vo.setErrmsg(e.getMessage());
			return vo;
		}
		PhoneOrderReqModel phoneOrderReqModel= getPhoneOrderResModel.getQueryOrder();
		if(getPhoneOrderResModel.isResult()){
			
			//发货人信息
			vo.setShipperName(phoneOrderReqModel.getShipperName());
			vo.setShipperMobile(phoneOrderReqModel.getShipperMobile());
			vo.setShipperProvince(phoneOrderReqModel.getShipperProv());
			vo.setShipperCity(phoneOrderReqModel.getShipperCity());
			vo.setShipperArea(phoneOrderReqModel.getShipperAreaCode());
			vo.setShipperAddress(phoneOrderReqModel.getShipperAddress());
			
			//收货人信息
			vo.setConsigneeName(phoneOrderReqModel.getConsigneeName());
			vo.setConsigneeMobile(phoneOrderReqModel.getConsigneeMobile());
			vo.setConsigneeProvince(phoneOrderReqModel.getConsigneeProv());
			vo.setConsigneeCity(phoneOrderReqModel.getConsigneeCity());
			vo.setConsigneeArea(phoneOrderReqModel.getConsigneeAreaCode());
			vo.setConsigneeAddress(phoneOrderReqModel.getConsigneeAddress());
			//货物信息
			vo.setCargoName(phoneOrderReqModel.getCargoName());
			if(phoneOrderReqModel.getCargoVolume() !=null){
				vo.setCargoVolume(phoneOrderReqModel.getCargoVolume());
			}
			if(phoneOrderReqModel.getCargoWeight() !=null){
				vo.setCargoWeight(phoneOrderReqModel.getCargoWeight());
			}
			
			//件数
			vo.setCargoPiece(1);
	//		vo.setCargoPiece((int)phoneOrderReqModel.getCargoNumber().getValue());
			vo.setRemarks(phoneOrderReqModel.getRemark());
			vo.setErrcode(AppUtil.EXCEPTION_STATUS_SUCCESS);
		}else{
			vo.setErrcode(AppUtil.CALL_INTERFACE_EXCEPTION);
			return vo;
		}
//		PhoneOrderReqModel phoneOrderReqModel= getPhoneOrderResModel.getQueryOrder().getValue();
//		if(getPhoneOrderResModel.getResult().getValue()){
//			
//			//发货人信息
//			vo.setShipperName(phoneOrderReqModel.getShipperName().getValue());
//			vo.setShipperMobile(phoneOrderReqModel.getShipperMobile().getValue());
//			vo.setShipperProvince(phoneOrderReqModel.getShipperProv().getValue());
//			vo.setShipperCity(phoneOrderReqModel.getShipperCity().getValue());
//			vo.setShipperArea(phoneOrderReqModel.getShipperAreaCode().getValue());
//			vo.setShipperAddress(phoneOrderReqModel.getShipperAddress().getValue());
//			
//			//收货人信息
//			vo.setConsigneeName(phoneOrderReqModel.getConsigneeName().getValue());
//			vo.setConsigneeMobile(phoneOrderReqModel.getConsigneeMobile().getValue());
//			vo.setConsigneeProvince(phoneOrderReqModel.getConsigneeProv().getValue());
//			vo.setConsigneeCity(phoneOrderReqModel.getConsigneeCity().getValue());
//			vo.setConsigneeArea(phoneOrderReqModel.getConsigneeAreaCode().getValue());
//			vo.setConsigneeAddress(phoneOrderReqModel.getConsigneeAddress().getValue());
//			//货物信息
//			vo.setCargoName(phoneOrderReqModel.getCargoName().getValue());
//			if(phoneOrderReqModel.getCargoVolume().getValue() !=null){
//				vo.setCargoVolume(phoneOrderReqModel.getCargoVolume().getValue());
//			}
//			if(phoneOrderReqModel.getCargoWeight().getValue() !=null){
//				vo.setCargoWeight(phoneOrderReqModel.getCargoWeight().getValue());
//			}
//			
//			//件数
//			vo.setCargoPiece(1);
////			vo.setCargoPiece((int)phoneOrderReqModel.getCargoNumber().getValue());
//			vo.setRemarks(phoneOrderReqModel.getRemark().getValue());
//			vo.setErrcode(AppUtil.EXCEPTION_STATUS_SUCCESS);
//		}else{
//			vo.setErrcode(AppUtil.CALL_INTERFACE_EXCEPTION);
//			return vo;
//		}
		return vo;
	}
	
	
	public ResBaseVo addOrder(OrderVo order) {
		ResBaseVo res = new ResBaseVo();
		order.setOrderOrigin("APP");
//		OrderModel reqOrderModel = new OrderModel();
		OrderModel reqOrderModel = nomsObjectFactory.createOrderModel();
//		reqOrderModel.setOrderNo(nomsObjectFactory.createOrderModelOrderNo(order.getOrderNo()));
//		reqOrderModel.setOrderId(nomsObjectFactory.createOrderModelOrderId(order.getOrderId()));
//		reqOrderModel.setUserId(nomsObjectFactory.createOrderModelUserId(order.getUserId()));
//		reqOrderModel.setCargoName(nomsObjectFactory.createOrderModelCargoName(order.getCargoName()));
		reqOrderModel.setOrderNo(order.getOrderNo());
		reqOrderModel.setOrderId(order.getOrderId());
		reqOrderModel.setUserId(order.getUserId());
		reqOrderModel.setCargoName(order.getCargoName());
		reqOrderModel.setCargoPiece(order.getCargoPiece());
		reqOrderModel.setCargoVolume(order.getCargoVolume());
		reqOrderModel.setCargoWeight(order.getCargoWeight());
		
		reqOrderModel.setConsigneeAddress(order.getConsigneeAddress());
		reqOrderModel.setConsigneeArea(order.getConsigneeArea());
		reqOrderModel.setConsigneeCity(order.getConsigneeCity());
		reqOrderModel.setConsigneeMobile(order.getConsigneeMobile());
		reqOrderModel.setConsigneeName(order.getConsigneeName());
		reqOrderModel.setConsigneeProvince(order.getConsigneeProvince());
		reqOrderModel.setOrderOrigin(order.getOrderOrigin());
		reqOrderModel.setRemarks(order.getRemarks());
		reqOrderModel.setShipDept(order.getShipDept());
		reqOrderModel.setShipperAddress(order.getShipperAddress());
		reqOrderModel.setShipperArea(order.getShipperArea());
		reqOrderModel.setShipperCity(order.getShipperCity());
		reqOrderModel.setShipperMobile(order.getShipperMobile());
		reqOrderModel.setShipperName(order.getShipperName());
		reqOrderModel.setShipperProvince(order.getShipperProvince());
		reqOrderModel.setProductTypeName(order.getProductTypeName());
		reqOrderModel.setEscoSecondCode(order.getEinoEscoSecondCode()); 
		reqOrderModel.setEscoSecondName(order.getEinoEscoSecondName());
		
//		reqOrderModel.setConsigneeAddress(nomsObjectFactory.createOrderModelConsigneeAddress(order.getConsigneeAddress()));
//		reqOrderModel.setConsigneeArea(nomsObjectFactory.createOrderModelConsigneeArea(order.getConsigneeArea()));
//		reqOrderModel.setConsigneeCity(nomsObjectFactory.createOrderModelConsigneeCity(order.getConsigneeCity()));
//		reqOrderModel.setConsigneeMobile(nomsObjectFactory.createOrderModelConsigneeMobile(order.getConsigneeMobile()));
//		reqOrderModel.setConsigneeName(nomsObjectFactory.createOrderModelConsigneeName(order.getConsigneeName()));
//		reqOrderModel.setConsigneeProvince(nomsObjectFactory.createOrderModelConsigneeProvince(order.getConsigneeProvince()));
//		reqOrderModel.setOrderOrigin(nomsObjectFactory.createOrderModelOrderOrigin(order.getOrderOrigin()));
//		reqOrderModel.setRemarks(nomsObjectFactory.createOrderModelRemarks(order.getRemarks()));
//		reqOrderModel.setShipDept(nomsObjectFactory.createOrderModelShipDept(order.getShipDept()));
//		reqOrderModel.setShipperAddress(nomsObjectFactory.createOrderModelShipperAddress(order.getShipperAddress()));
//		reqOrderModel.setShipperArea(nomsObjectFactory.createOrderModelShipperArea(order.getShipperArea()));
//		reqOrderModel.setShipperCity(nomsObjectFactory.createOrderModelShipperCity(order.getShipperCity()));
//		reqOrderModel.setShipperMobile(nomsObjectFactory.createOrderModelShipperMobile(order.getShipperMobile()));
//		reqOrderModel.setShipperName(nomsObjectFactory.createOrderModelShipperName(order.getShipperName()));
//		reqOrderModel.setShipperProvince(nomsObjectFactory.createOrderModelShipperProvince(order.getShipperProvince()));
//		reqOrderModel.setProductTypeName(nomsObjectFactory.createOrderModelProductTypeName(order.getProductTypeName()));
//		reqOrderModel.setEscoSecondCode(nomsObjectFactory.createOrderModelEscoSecondCode(order.getEinoEscoSecondCode())); 
//		reqOrderModel.setEscoSecondName(nomsObjectFactory.createOrderModelEscoSecondName(order.getEinoEscoSecondName()));
		PhoneOrderResModel  phoneOrderResModel = nomsPortType.createOrder(reqOrderModel);
		if(phoneOrderResModel.isResult()){
			res.setErrcode(AppUtil.EXCEPTION_STATUS_SUCCESS);
		}else{
			throw new BusinessException(phoneOrderResModel.getResultInfo());
		}
//		if(phoneOrderResModel.getResult().getValue()){
//			res.setErrcode(AppUtil.EXCEPTION_STATUS_SUCCESS);
//		}else{
//			throw new BusinessException(phoneOrderResModel.getResultInfo().getValue());
//		}
		return res;
	}
	public ResBaseVo updateOrder(OrderVo order) {
		ResBaseVo res = new ResBaseVo();
		res.setErrcode(AppUtil.EXCEPTION_STATUS_SUCCESS);
		order.setOrderOrigin("APP");
		OrderModel reqOrderModel = nomsObjectFactory.createOrderModel();
		reqOrderModel.setOrderNo(order.getOrderNo());
		reqOrderModel.setOrderId(order.getOrderId());
		reqOrderModel.setUserId(order.getUserId());
		reqOrderModel.setCargoName(order.getCargoName());
		
//		OrderModel reqOrderModel = new OrderModel();
//		reqOrderModel.setOrderNo(nomsObjectFactory.createOrderModelOrderNo(order.getOrderNo()));
//		reqOrderModel.setOrderId(nomsObjectFactory.createOrderModelOrderId(order.getOrderId()));
//		reqOrderModel.setUserId(nomsObjectFactory.createOrderModelUserId(order.getUserId()));
//		reqOrderModel.setCargoName(nomsObjectFactory.createOrderModelCargoName(order.getCargoName()));
		reqOrderModel.setCargoPiece(order.getCargoPiece());
		reqOrderModel.setCargoVolume(order.getCargoVolume());
		reqOrderModel.setCargoWeight(order.getCargoWeight());
		
		reqOrderModel.setConsigneeAddress(order.getConsigneeAddress());
		reqOrderModel.setConsigneeArea(order.getConsigneeArea());
		reqOrderModel.setConsigneeCity(order.getConsigneeCity());
		reqOrderModel.setConsigneeMobile(order.getConsigneeMobile());
		reqOrderModel.setConsigneeName(order.getConsigneeName());
		reqOrderModel.setConsigneeProvince(order.getConsigneeProvince());
		reqOrderModel.setOrderOrigin(order.getOrderOrigin());
		reqOrderModel.setRemarks(order.getRemarks());
		reqOrderModel.setShipDept(order.getShipDept());
		reqOrderModel.setShipperAddress(order.getShipperAddress());
		reqOrderModel.setShipperArea(order.getShipperArea());
		reqOrderModel.setShipperCity(order.getShipperCity());
		reqOrderModel.setShipperMobile(order.getShipperMobile());
		reqOrderModel.setShipperName(order.getShipperName());
		reqOrderModel.setShipperProvince(order.getShipperProvince());
		reqOrderModel.setProductTypeName(order.getProductTypeName());
		reqOrderModel.setShipDept(order.getEinoEscoSecondCode());
		
//		reqOrderModel.setConsigneeAddress(nomsObjectFactory.createOrderModelConsigneeAddress(order.getConsigneeAddress()));
//		reqOrderModel.setConsigneeArea(nomsObjectFactory.createOrderModelConsigneeArea(order.getConsigneeArea()));
//		reqOrderModel.setConsigneeCity(nomsObjectFactory.createOrderModelConsigneeCity(order.getConsigneeCity()));
//		reqOrderModel.setConsigneeMobile(nomsObjectFactory.createOrderModelConsigneeMobile(order.getConsigneeMobile()));
//		reqOrderModel.setConsigneeName(nomsObjectFactory.createOrderModelConsigneeName(order.getConsigneeName()));
//		reqOrderModel.setConsigneeProvince(nomsObjectFactory.createOrderModelConsigneeProvince(order.getConsigneeProvince()));
//		reqOrderModel.setOrderOrigin(nomsObjectFactory.createOrderModelOrderOrigin(order.getOrderOrigin()));
//		reqOrderModel.setRemarks(nomsObjectFactory.createOrderModelRemarks(order.getRemarks()));
//		reqOrderModel.setShipDept(nomsObjectFactory.createOrderModelShipDept(order.getShipDept()));
//		reqOrderModel.setShipperAddress(nomsObjectFactory.createOrderModelShipperAddress(order.getShipperAddress()));
//		reqOrderModel.setShipperArea(nomsObjectFactory.createOrderModelShipperArea(order.getShipperArea()));
//		reqOrderModel.setShipperCity(nomsObjectFactory.createOrderModelShipperCity(order.getShipperCity()));
//		reqOrderModel.setShipperMobile(nomsObjectFactory.createOrderModelShipperMobile(order.getShipperMobile()));
//		reqOrderModel.setShipperName(nomsObjectFactory.createOrderModelShipperName(order.getShipperName()));
//		reqOrderModel.setShipperProvince(nomsObjectFactory.createOrderModelShipperProvince(order.getShipperProvince()));
//		reqOrderModel.setProductTypeName(nomsObjectFactory.createOrderModelProductTypeName(order.getProductTypeName()));
//		reqOrderModel.setShipDept(nomsObjectFactory.createOrderModelShipDept(order.getEinoEscoSecondCode()));
		ModifyOrderResModel phoneOrderResModel = nomsPortType.modifyOrder(reqOrderModel);
		if(phoneOrderResModel.isResult()){
			res.setErrcode(AppUtil.EXCEPTION_STATUS_SUCCESS);
		}else{
			throw new BusinessException(phoneOrderResModel.getResultInfo());
		}
//		if(phoneOrderResModel.getResult().getValue()){
//			res.setErrcode(AppUtil.EXCEPTION_STATUS_SUCCESS);
//		}else{
//			throw new BusinessException(phoneOrderResModel.getResultInfo().getValue());
//		}
		return res;
		
	}
	/**
	 * 取消订单
	 */
	public ResBaseVo cancelOrder(OrderVo order) {
		ResBaseVo res = new ResBaseVo();
		if(order==null || order .getOrderNo()==null){
			res.setErrcode(AppUtil.EXCEPTION_STATUS_BUSINESS_ERROR);
			res.setErrmsg("订单号不能为空");
			return res;
		}
		CancelOrderReqModel cancelOrderReqModel =objectFactory.createCancelOrderReqModel();
		cancelOrderReqModel.setUserid(order.getUserId());
		cancelOrderReqModel.setOrderNo(order.getOrderNo());
		CancelOrderResModel cancelOrderResModel = portType.cancelPhoneOrde(cancelOrderReqModel);
		if(cancelOrderResModel.isResult()){
			res.setErrcode(AppUtil.EXCEPTION_STATUS_SUCCESS);
		}else{
			res.setErrcode(AppUtil.EXCEPTION_STATUS_BUSINESS_ERROR);
			res.setErrmsg(cancelOrderResModel.getResultInfo());
		}
//		CancelOrderReqModel cancelOrderReqModel = new CancelOrderReqModel();
//		cancelOrderReqModel.setUserid(objectFactory.createCancelOrderReqModelUserid(order.getUserId()));
//		cancelOrderReqModel.setOrderNo(objectFactory.createCancelOrderReqModelOrderNo(order.getOrderNo()));
//		CancelOrderResModel cancelOrderResModel = portType.cancelPhoneOrde(cancelOrderReqModel);
//		if(cancelOrderResModel.getResult().getValue()){
//			res.setErrcode(AppUtil.EXCEPTION_STATUS_SUCCESS);
//		}else{
//			res.setErrcode(AppUtil.EXCEPTION_STATUS_BUSINESS_ERROR);
//			res.setErrmsg(cancelOrderResModel.getResultInfo().getValue());
//		}
		return res;
	}
	
	
}

