package com.hoau.hoauapp.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.hoau.hoauapp.service.ICouponClippingService;
import com.hoau.hoauapp.si.dc.couponclipping.VoucherInfo;
import com.hoau.hoauapp.vo.UserCouponClippingVo;

/**
 * DC优惠券
 * 
 * @author 277610
 * @Date 2015-04-28
 */
@Service
public class CouponClippingService implements ICouponClippingService {
	
	/**
	 * 系统编码
	 */
	private static String SYSTEM_CODE = "HOAUAPP";

	/**
	 * 生成优惠券序号
	 */
	public UserCouponClippingVo createCCNum(UserCouponClippingVo userCC)
			throws Exception {
		// 时间格式化
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		// 调用接口
		VoucherInfo oucherInfo = outerVocherServices.getNewVoucher(SYSTEM_CODE,
				userCC.getAmount());
		if (oucherInfo != null && oucherInfo.getErrcode() == null
				&& oucherInfo.getVoucherCode() != null
				&& !oucherInfo.getVoucherCode().equals("")) {
			// 订单号
			userCC.setCcOrder(oucherInfo.getVoucherCode());
			// 过期时间
			userCC.setDeadLine(df.parse(df.format(new Date(oucherInfo.getDeadline()))));
		} else {
			return null;
		}
		return userCC;
	}

	/**
	 * 获取优惠券状态
	 */
	public List<String> queryCCStatus(String startDate,
			String endDate) {
		List<String> vList = outerVocherServices.getUsedVouchers(SYSTEM_CODE, startDate, endDate);
		return vList;
	}
}
