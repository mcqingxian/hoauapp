package com.hoau.hoauapp.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.springframework.stereotype.Service;

import com.hoau.hoauapp.service.IDCMeOrderservice;
import com.hoau.hoauapp.si.dc.sendme.WaybillInfo;
import com.hoau.hoauapp.si.dc.sendme.WaybillInfoVector;
import com.hoau.hoauapp.util.AppUtil;
import com.hoau.hoauapp.util.DCAppWaybillServicesFactory;
import com.hoau.hoauapp.vo.SendMeOrderListVO;
import com.hoau.hoauapp.vo.SendMeOrderVO;
/**
 * 
 * @ClassName: DCMeOrderService 
 * @Description: 发给我的订单后台服务 
 * @author 275636
 * @date 2015-04-08
 */
@Service
public class DCMeOrderService implements IDCMeOrderservice {

	/**
	 * 查询订单
	 */
	@SuppressWarnings("restriction")
	public SendMeOrderListVO queryOrder(String userid) {
		WaybillInfoVector infoVector = DCAppWaybillServicesFactory.getAppWaybillServices().queryWBlist(userid);
		SendMeOrderListVO listVo = new SendMeOrderListVO();
		if( null == infoVector.getErrcode() || "".equals(infoVector.getErrcode())){
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/mm/dd hh:mm");
			ArrayList<SendMeOrderVO> orderList = new ArrayList<SendMeOrderVO>();
			for(int index = 0,len = infoVector.getWaybillInfo().size();index<len;index++){
				WaybillInfo info = infoVector.getWaybillInfo().get(index);
				SendMeOrderVO vo = new SendMeOrderVO();
				//发货信息
				vo.setShipperName(info.getTYRLXR());
				vo.setShipperMobile(info.getTYRSJ());
				vo.setShipperProvince(info.getTYRDZ());
				vo.setShipperCity(info.getTYRDZ());
				vo.setShipperArea(info.getTYRDZ());
				vo.setShipperAddress(info.getTYRDZ());
				try {
					vo.setSenddate(sdf.parse(info.getKDSJ()));
				} catch (ParseException e) {
					e.printStackTrace();
				}
				//收货人
				vo.setConsigneeName(info.getSHRLXR());
				vo.setConsigneeProvince(info.getSHRDZ());
				vo.setConsigneeCity(info.getSHRDZ());
				vo.setConsigneeArea(info.getSHRDZ());
				vo.setConsigneeAddress(info.getSHRDZ());
				vo.setConsigneeMobile(info.getSHRSJ());
				
				//货物信息
				vo.setCargoName(info.getHWMC());
				vo.setCargoWeight(info.getZL());
				vo.setTransNo(info.getYDBH());
				vo.setUserId(userid);
				
				//件数
				vo.setCargoPiece(info.getJS());
				if(info.getYDZT().equals("7") || info.getYDZT().equals("2")){//已签收
					vo.setOrderStatus("DELIVER");
				}else{
					vo.setOrderStatus("SENDFAIL");
				}
				
				vo.setRemarks(info.getQTYD());
				vo.setErrcode(AppUtil.EXCEPTION_STATUS_SUCCESS);
				//运输类型
				/**
				 * @Fields CYRQZ: 运输类型
				 * 10000000000000000001:定日达
				 * 20000000000000000001:整车
				 * 30000000000000000001:普通零担
				 * 40000000000000000001:经济快运
				 * 50000000000000000001:偏线
				 */
				if(info.getCYRQZ().equals("10000000000000000001"))
					vo.setYslx("定日达");
				else if(info.getCYRQZ().equals("20000000000000000001"))
					vo.setYslx("整车");
				else if(info.getCYRQZ().equals("30000000000000000001"))
					vo.setYslx("普通零担");
				else if(info.getCYRQZ().equals("40000000000000000001"))
					vo.setYslx("经济快运");
				else if(info.getCYRQZ().equals("50000000000000000001"))
					vo.setYslx("偏线");
				/**
				 * @Fields SOHFS: 送货方式
				 * 0客户自提、1送货上门
				 */
				if(info.getSOHFS().equals("0"))
					vo.setShfs("客户自提");
				else
					vo.setShfs("送货上门");
				//代收货款
				vo.setDshk(info.getDSHKE()+"");
				//总费用
				vo.setZfy(info.getHJJE()+"");
				/**
				 * @Fields FKFS: 付款方式
				 * 0 付清应收金额
				 * 1 定期结算应收金额
				 * 2 收货人付款应收金额
				 * 3 收货人结算应收
				 * 4 第三方支付应收
				 */
				if(info.getFKFS().equals("0"))
					vo.setFkfs("付清应收金额");
				else if(info.getFKFS().equals("1"))
					vo.setFkfs("定期结算应收金额");
				else if(info.getFKFS().equals("2"))
					vo.setFkfs("收货人付款应收金额");
				else if(info.getFKFS().equals("3"))
					vo.setFkfs("收货人结算应收");
				else if(info.getFKFS().equals("4"))
					vo.setFkfs("第三方支付应收");
				vo.setQtyd(info.getQTYD());
				orderList.add(vo);
			}
			listVo.setList(orderList);
			listVo.setErrcode(AppUtil.EXCEPTION_STATUS_SUCCESS);
		}else{
			listVo.setErrcode(AppUtil.EXCEPTION_STATUS_BUSINESS_ERROR);
			listVo.setErrmsg(infoVector.getErrmsg());
		}
		return listVo;
	}
	/**根据用户编号和订单编号查询订单详情
	 * 
	 */
	@SuppressWarnings("restriction")
	public SendMeOrderVO queryOrder(SendMeOrderVO vo) {
		vo.setShipperName("张三");
		vo.setShipperMobile("1234567");
		vo.setShipperProvince("上海");
		vo.setShipperCity("上海");
		vo.setShipperArea("上海");
		vo.setShipperAddress("上海");
		vo.setSenddate(new Date());
		
		//收货人信息
		vo.setConsigneeName("李四");
		vo.setConsigneeMobile("北京");
		vo.setConsigneeProvince("北京");
		vo.setConsigneeCity("北京");
		vo.setConsigneeArea("北京");
		vo.setConsigneeAddress("北京");
		//货物信息
		vo.setCargoName("北京");
		vo.setCargoWeight(11);
		vo.setTransNo("F7654321");
		
		//件数
		vo.setCargoPiece(1);
		vo.setOrderStatus("DELIVER");
		vo.setCargoPiece(12);
		vo.setRemarks("北京");
		vo.setErrcode(AppUtil.EXCEPTION_STATUS_SUCCESS);
		return vo;
	}
	
}

