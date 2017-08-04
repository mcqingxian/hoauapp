package com.hoau.hoauapp.facade;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import org.springframework.stereotype.Service;
import com.hoau.hoauapp.business.IClaimService;
import com.hoau.hoauapp.constant.HttpConstant;
import com.hoau.hoauapp.util.AppUtil;
import com.hoau.hoauapp.vo.AccidentType;
import com.hoau.hoauapp.vo.AccidentTypeVo;
import com.hoau.hoauapp.vo.AccountBankInfoVo;
import com.hoau.hoauapp.vo.BankInfoListVo;
import com.hoau.hoauapp.vo.CargoNameType;
import com.hoau.hoauapp.vo.CargoNameVo;
import com.hoau.hoauapp.vo.ClaimInfoVo;
import com.hoau.hoauapp.vo.ClaimListVo;
import com.hoau.hoauapp.vo.ResBaseVo;

@Service
@Path("/claim")
@Consumes(HttpConstant.DATATYPE)
@Produces(HttpConstant.DATATYPE)
public class ClaimFacade {
	@Resource
	private IClaimService claimService;
	/**
	 * 
	 * addClaim 新增理赔信息
	 * 
	 * @param claimInfoVo
	 * @return
	 * @throws IOException
	 *             ResBaseVo
	 * @exception
	 * @since 1.0.0
	 */
	@POST
	@Path("add")
	public ResBaseVo addClaim(ClaimInfoVo claimInfoVo) throws IOException {
		ResBaseVo res = new ResBaseVo();
		claimService.addClaim(claimInfoVo);
		res.setErrcode(AppUtil.EXCEPTION_STATUS_SUCCESS);
		return res;
	}

	/**
	 * updateClaim (更新理赔信息)
	 * 
	 * @param claimInfoVo
	 * @return
	 * @throws IOException
	 *             ResBaseVo
	 * @exception
	 * @since 1.0.0
	 */
	@POST
	@Path("update")
	public ResBaseVo updateClaim(ClaimInfoVo claimInfoVo) throws IOException {
		ResBaseVo res = new ResBaseVo();
		claimService.updateClaim(claimInfoVo);
		res.setErrcode(AppUtil.EXCEPTION_STATUS_SUCCESS);
		return res;
	}

	/**
	 * checkClaim(校验手机号) (校验手机号)
	 * 
	 * @param waybill
	 * @param mobile
	 * @return
	 * @throws IOException
	 *             ResBaseVo
	 * @exception
	 * @since 1.0.0
	 */
	@GET
	@Path("check/{waybill}/{mobile}/{cityName}")
	public ResBaseVo checkClaim(@PathParam("waybill") String waybill,
			@PathParam("mobile") String mobile, @PathParam("cityName") String cityName) throws IOException {
		ResBaseVo res = new ResBaseVo();
		claimService.checkMobile(waybill, mobile, cityName);
		res.setErrcode(AppUtil.EXCEPTION_STATUS_SUCCESS);
		return res;
	}

	/**
	 * 
	 * queryClaims 查询理赔信息
	 * 
	 * @param userId
	 * @exception
	 * @since 1.0.0
	 */
	@GET
	@Path("list/{userId}")
	public ClaimListVo queryClaims(@PathParam("userId") String userId) {
		ClaimListVo res = new ClaimListVo();
		List<ClaimInfoVo> l = claimService.queryClaimsByUser(userId);
		res.setClaims(l);
		res.setErrcode(AppUtil.EXCEPTION_STATUS_SUCCESS);
		return res;
	}

	/**
	 * 
	 * queryClaimByBillCode(这里用一句话描述这个方法的作用) 根据单号查询理赔信息
	 * 
	 * @param billCode
	 * @return ClaimInfoVo
	 * @exception
	 * @since 1.0.0
	 */
	@GET
	@Path("query/{billCode}/{userId}")
	public ClaimInfoVo queryClaimByBillCode(
			@PathParam("billCode") String billCode,
			@PathParam("userId") String userId) {
		ClaimInfoVo  claimInfo = claimService.queryClaimByBillCode(billCode, userId);
		claimInfo.setErrcode(AppUtil.EXCEPTION_STATUS_SUCCESS);
		return claimInfo;
	}


	/**
	 * 
	 * confirmApplyMoney (理赔金额确认)
	 * 
	 * @param billCode
	 * @param applyMoney
	 * @return ResBaseVo
	 * @exception
	 * @since 1.0.0
	 */
	@POST
	@Path("money/{billCode}/{applyMoney}")
	public ResBaseVo confirmApplyMoney(@PathParam("billCode") String billCode,
			@PathParam("applyMoney") double applyMoney) {
		ResBaseVo res = new ResBaseVo();
		claimService.confirmApplyMoney(billCode);
		res.setErrcode(AppUtil.EXCEPTION_STATUS_SUCCESS);
		return res;
	}
	
	@GET
	@Path("accidentType")
	public ResBaseVo getAccidentType() {
		AccidentTypeVo res = new AccidentTypeVo();
		List<AccidentType> l = new ArrayList<AccidentType>();
		AccidentType a1 = new AccidentType();
		a1.setAccidentTypeName("丢失");
		a1.setAccidentTypeValue("1");
		l.add(a1);
		AccidentType a2 = new AccidentType();
		a2.setAccidentTypeName("火灾");
		a2.setAccidentTypeValue("3");
		l.add(a2);
		AccidentType a3 = new AccidentType();
		a3.setAccidentTypeName("交通肇事");
		a3.setAccidentTypeValue("4");
		l.add(a3);
		AccidentType a4 = new AccidentType();
		a4.setAccidentTypeName("破损");
		a4.setAccidentTypeValue("2");
		l.add(a4);
		AccidentType a5 = new AccidentType();
		a5.setAccidentTypeName("其他");
		a5.setAccidentTypeValue("6");
		l.add(a5);
		res.setAccidentTypes(l);
		res.setErrcode(AppUtil.EXCEPTION_STATUS_SUCCESS);
		return res;
	} 
	
	@GET
	@Path("cargoName")
	public ResBaseVo getCargoName() {
		CargoNameVo res = new CargoNameVo();
		List<CargoNameType> l = new ArrayList<CargoNameType>();
		CargoNameType c1 = new CargoNameType();
		c1.setCargoName("药品");
		c1.setCargoNameValue("1");
		l.add(c1);
		CargoNameType c2 = new CargoNameType();
		c2.setCargoName("服装");
		c2.setCargoNameValue("2");
		l.add(c2);
		CargoNameType c3 = new CargoNameType();
		c3.setCargoName("电脑");
		c3.setCargoNameValue("3");
		l.add(c3);
		CargoNameType c4 = new CargoNameType();
		c4.setCargoName("厨具");
		c4.setCargoNameValue("4");
		l.add(c4);
		CargoNameType c5 = new CargoNameType();
		c5.setCargoName("工具");
		c5.setCargoNameValue("5");
		l.add(c5);
		CargoNameType c6 = new CargoNameType();
		c6.setCargoName("配件");
		c6.setCargoNameValue("6");
		l.add(c6);
		CargoNameType c7 = new CargoNameType();
		c7.setCargoName("电器");
		c7.setCargoNameValue("7");
		l.add(c7);
		CargoNameType c8 = new CargoNameType();
		c8.setCargoName("家具");
		c8.setCargoNameValue("8");
		l.add(c8);
		CargoNameType c9 = new CargoNameType();
		c9.setCargoName("刀具");
		c9.setCargoNameValue("9");
		l.add(c3);
		CargoNameType c10 = new CargoNameType();
		c10.setCargoName("灯具");
		c10.setCargoNameValue("10");
		l.add(c10);
		CargoNameType c11 = new CargoNameType();
		c11.setCargoName("乐器");
		c11.setCargoNameValue("11");
		l.add(c11);
		CargoNameType c12 = new CargoNameType();
		c12.setCargoName("日用品");
		c12.setCargoNameValue("12");
		l.add(c12);
		CargoNameType c13 = new CargoNameType();
		c13.setCargoName("食品");
		c13.setCargoNameValue("13");
		l.add(c13);
		CargoNameType c14 = new CargoNameType();
		c14.setCargoName("书");
		c14.setCargoNameValue("14");
		l.add(c14);
		CargoNameType c15 = new CargoNameType();
		c15.setCargoName("行李");
		c15.setCargoNameValue("15");
		l.add(c15);
		CargoNameType c16 = new CargoNameType();
		c16.setCargoName("其他");
		c16.setCargoNameValue("16");
		l.add(c16);
		res.setCargoNames(l);
		res.setErrcode(AppUtil.EXCEPTION_STATUS_SUCCESS);
		return res;
	} 
	
	/**
	 * queryBankInfo 根据关键字查询银行信息
	 * @param bankKey
	 * @return BankInfoListVo
	 * @exception
	 * @since 1.0.0
	 */
	@GET
	@Path("queryBank/{bankKey}")
	public BankInfoListVo queryBankInfo(@PathParam("bankKey") String bankKey) {
		List<AccountBankInfoVo>  banks = claimService.queryBankInfo(bankKey);
		BankInfoListVo vo = new BankInfoListVo();
		vo.setBankInfos(banks);
		vo.setErrcode(AppUtil.EXCEPTION_STATUS_SUCCESS);
		return vo;
	}
}
