package com.hoau.hoauapp.service.impl;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import com.hoau.hoauapp.entity.PriceQueryEntity;
import com.hoau.hoauapp.service.IPriceTimeService;
import com.hoau.hoauapp.util.AppUtil;
import com.hoau.hoauapp.util.HttpClientUtil;
import com.hoau.hoauapp.util.JsonUtils;
import com.hoau.hoauapp.util.StringUtil;
import com.hoau.hoauapp.vo.PriceTimeList;
import com.hoau.hoauapp.vo.PriceTimeVo;

public class PriceTimeService implements IPriceTimeService {

	private String url = "http://ttq.hoau.net:9080/PriceQuery?ebProductTypeId=&";
	/**
	 * 
	 * @Method: getTTQPrice 
	 * @Description: 调用TTQ 价格时效接口
	 * @author liudeyun deyun.liu@hoau.net 
	 * @date 2015年1月15日 上午9:32:55
	 */
	public PriceTimeList getTTQPrice(PriceQueryEntity entity) {
		try {
			if (StringUtil.isNotEmpty(entity.getRecCity())) {
				
				url = url + "conCity=" + URLEncoder.encode(URLEncoder.encode(entity.getRecCity(), "utf-8"),"utf-8");
			}
			if (StringUtil.isNotEmpty(entity.getRecCounty())) {
				url = url + "&conCounty=" + URLEncoder.encode(URLEncoder.encode(entity.getRecCounty(), "utf-8"),"utf-8");
			}
			if (StringUtil.isNotEmpty(entity.getShipperCity())) {
				url = url + "&shipperCity=" + URLEncoder.encode(URLEncoder.encode(entity.getShipperCity(), "utf-8"),"utf-8");
			}
			if (StringUtil.isNotEmpty(entity.getShipperCounty())) {
				url = url + "&shipperCounty=" + URLEncoder.encode(URLEncoder.encode(entity.getShipperCounty(), "utf-8"),"utf-8");
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		String response ;
		PriceTimeList priceTimeList = new PriceTimeList();
		try{
			response = HttpClientUtil.sendGet(url);
			priceTimeList.setList(JsonUtils.toList(response,PriceTimeVo.class));
			priceTimeList.setErrcode(AppUtil.EXCEPTION_STATUS_SUCCESS);
		}catch(Exception e){
			priceTimeList.setErrcode(AppUtil.CALL_INTERFACE_EXCEPTION);
		}
		return priceTimeList;
	}
}
