package com.hoau.hoauapp.business.impl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import com.hoau.hoauapp.business.IDcPriceTimeService;
import com.hoau.hoauapp.constant.PropertyConstant;
import com.hoau.hoauapp.vo.ResBaseVo;

import net.hoau.services.howpriceandtimequeryservices.HowPriceAndTimeQueryServices;
import net.hoau.services.howpriceandtimequeryservices.HowPriceAndTimeQueryServices_Service;
import net.hoau.services.howpriceandtimequeryservices.PriceQueryResult;
import net.hoau.services.howpriceandtimequeryservices.PriceQueryResultListVo;
import net.hoau.services.howpriceandtimequeryservices.PriceQueryVo;

/**
 * 到DC查询价格时效
 * @author zhangchao
 *
 */
public class DcPriceTimeService implements IDcPriceTimeService{
	private HowPriceAndTimeQueryServices port;
	
	@Override
	public PriceQueryResultListVo queryPrice(PriceQueryVo vo) {
	      String priceUrl = PropertyConstant.DC_PRICETIME_URL;
	      HowPriceAndTimeQueryServices_Service ss;
		try {
			ss = new HowPriceAndTimeQueryServices_Service(new URL(priceUrl));
			port = ss.getHowPriceAndTimeQueryServicesPort();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     List<PriceQueryResult> queryPriceAndTime = port.queryPriceAndTime(vo);
	     PriceQueryResultListVo listVo= new PriceQueryResultListVo();
	     listVo.setList(queryPriceAndTime);
	     return listVo;
	}
}
