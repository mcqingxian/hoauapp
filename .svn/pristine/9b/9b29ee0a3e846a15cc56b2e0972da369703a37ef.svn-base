package com.hoau.hoauapp.business.impl;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.hoau.hoauapp.business.IPriceTimeService;
import com.hoau.hoauapp.entity.PriceQueryEntity;
import com.hoau.hoauapp.util.HttpUtil;
import com.hoau.hoauapp.util.JsonUtils;
import com.hoau.hoauapp.util.StringUtil;
import com.hoau.hoauapp.vo.PriceTimeList;
import com.hoau.hoauapp.vo.PriceTimeVo;

import net.hoau.services.howpriceandtimequeryservices.PriceQueryResult;
import net.hoau.services.howpriceandtimequeryservices.PriceQueryResultListVo;
import net.hoau.services.howpriceandtimequeryservices.PriceQueryVo;

/**
 * 
 * @ClassName: PriceTimeService 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author liudeyun deyun.liu@hoau.net 
 * @date 2015年1月14日 下午8:25:58
 */
public class PriceTimeService implements IPriceTimeService{
	private String url = "http://ttq.hoau.net:9080/PriceQuery?ebProductTypeId=&";
	
	public PriceTimeList queryPrice(PriceQueryEntity entity) {
		com.hoau.hoauapp.service.IPriceTimeService priceTimeService = 
				new com.hoau.hoauapp.service.impl.PriceTimeService();
		return priceTimeService.getTTQPrice(entity);
	}
/**
 * TTQ接口查询价格时效
 */
	@Override
	public PriceQueryResultListVo queryPrice(PriceQueryVo vo) {
		PriceQueryResultListVo priceQueryResultListVo = new PriceQueryResultListVo();
		List<PriceQueryResult> priceList = new ArrayList<PriceQueryResult>();
		String pickTime = "";
		String deliveryTime = "";
		try {
			if (StringUtil.isNotEmpty(vo.getConCity())) {
				
				url = url + "conCity=" + URLEncoder.encode(URLEncoder.encode(vo.getConCity(), "utf-8"),"utf-8");
			}
			if (StringUtil.isNotEmpty(vo.getConCounty())) {
				url = url + "&conCounty=" + URLEncoder.encode(URLEncoder.encode(vo.getConCounty(), "utf-8"),"utf-8");
			}
			if (StringUtil.isNotEmpty(vo.getShipperCity())) {
				url = url + "&shipperCity=" + URLEncoder.encode(URLEncoder.encode(vo.getShipperCity(), "utf-8"),"utf-8");
			}
			if (StringUtil.isNotEmpty(vo.getShipperCounty())) {
				url = url + "&shipperCounty=" + URLEncoder.encode(URLEncoder.encode(vo.getShipperCounty(), "utf-8"),"utf-8");
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		String response;
		List<PriceTimeVo> prices = new ArrayList<PriceTimeVo>();
		try {
			response = HttpUtil.httpGet(url);
			prices = JsonUtils.toList(response, PriceTimeVo.class);
			priceList = toPriceResult(prices);
			priceQueryResultListVo.setList(priceList);
			if(priceQueryResultListVo != null && priceQueryResultListVo.getList().size() != 0){
				for (int i = 0; i < priceQueryResultListVo.getList().size(); i++) {
					PriceQueryResult rs = priceQueryResultListVo.getList().get(i);
					pickTime = rs.getPickTime();
					deliveryTime = rs.getDeliveryTime();
					rs.setPickTime(deliveryTime);
					rs.setDeliveryTime(pickTime);
				}
			}
		} catch (Exception e) {
		}
		return priceQueryResultListVo;
	}
	/**
	 * 转换TTQ的返回对象和DC对象
	 * @param prices
	 * @return
	 */
	public List<PriceQueryResult> toPriceResult(List<PriceTimeVo> prices) {
		List<PriceQueryResult> results = new ArrayList<PriceQueryResult>();
		for (PriceTimeVo price : prices) {
			PriceQueryResult result = new PriceQueryResult();

			result.setDeliveryTime(getNumbers(price.getEbpdDeliveryHour()));
			result.setPickTime(getNumbers(price.getEbpdSendHour()));

			result.setHeavyPrice(price.getEbpdHeavyCargo());
			result.setHeveryDiscount(price.getEbdiHeavyGoods());
			result.setLightPrice(price.getEbpdLightCargo());
			result.setLightDiscount(price.getEbdiLightGoods());
			if ("定日达".equals(price.getEbptNameCn())) {
				result.setTransportType("ONTIME");
			} else if ("普通零担".equals(price.getEbptNameCn())) {
				result.setTransportType("LESSLOADED");
			} 

			result.setStartPrice(price.getEbpdStartPrice());

			result.setInsuredRate(4D);
			result.setMinInsuredFee(8D);

			result.setIssusingFee(2D);

			result.setMessageFee(1D);

			result.setSurcharge(10D);

			results.add(result);
		}
		return results;
	}

	// 截取数字
	public static String getNumbers(String content) {
		List<String> result = new ArrayList<String>();
		try {
			Pattern pattern = Pattern.compile("\\d+");
			Matcher matcher = pattern.matcher(content);
			while (matcher.find()) {
				if (!"".equals(matcher.group())) {
					result.add(matcher.group());
				}
			}
			String rtn = "";
			for (String str : result) {
				rtn = rtn + str + "-";
			}
			return rtn.substring(0, rtn.length() - 1);
		} catch (Exception e) {
		}
		return null;
	}

}
