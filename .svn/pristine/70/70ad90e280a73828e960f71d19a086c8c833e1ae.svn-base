package com.hoau.hoauapp.business.impl;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import com.hoau.hoauapp.business.IDCAndTTQPriceTimeService;
import com.hoau.hoauapp.business.IDcPriceTimeService;
import com.hoau.hoauapp.business.IPriceTimeService;
import com.hoau.hoauapp.util.AppUtil;
import com.hoau.hoauapp.util.StringUtils;
import com.hoau.hoauapp.vo.PriceCalcRespListVo;
import com.hoau.hoauapp.vo.PriceCalcRespVo;
import com.hoau.hoauapp.vo.PriceTimeList;
import com.hoau.hoauapp.vo.PriceTimeVo;

import net.hoau.services.howpriceandtimequeryservices.PriceQueryResult;
import net.hoau.services.howpriceandtimequeryservices.PriceQueryResultListVo;
import net.hoau.services.howpriceandtimequeryservices.PriceQueryVo;

/**
 * 到DC和TTQ接口查询价格时效
 * 
 * @author zhangchao
 * 田育林 修改 2016-07-14
 *
 */
public class DCAndTTQPriceTimeService implements IDCAndTTQPriceTimeService {
	IPriceTimeService iPriceTimeService = new PriceTimeService();
	IDcPriceTimeService iDcPriceTimeService = new DcPriceTimeService();
	protected static DecimalFormat df = new DecimalFormat("#");

	@Override
	public PriceTimeList queryPrice(PriceQueryVo vo) {
		PriceTimeList ptl = new PriceTimeList();
		try {
			PriceQueryResultListVo queryPrice = new PriceQueryResultListVo();
			queryPrice = iDcPriceTimeService.queryPrice(vo);
			if (queryPrice.getList().size() == 0){
				queryPrice = iPriceTimeService.queryPrice(vo);
			}
			for (int i = 0; i < queryPrice.getList().size(); i++) {
				PriceQueryResult priceQueryResult = queryPrice.getList().get(i);
				priceQueryResult.setPickTime(StringUtils.timeMinusOne(priceQueryResult.getPickTime()));
				priceQueryResult.setDeliveryTime(StringUtils.timeMinusOne(priceQueryResult.getDeliveryTime()));
			}
			ptl.setList(toPriceTimeList(queryPrice.getList()));
			ptl.setErrcode(AppUtil.EXCEPTION_STATUS_SUCCESS);
		} catch (Exception e) {
			ptl.setErrcode(AppUtil.CALL_INTERFACE_EXCEPTION);
		}
		return ptl;
	}

	@Override
	public PriceCalcRespListVo calcPrice(PriceQueryVo vo) {
		PriceCalcRespListVo priceCalcRespListVo = new PriceCalcRespListVo();
		PriceQueryResultListVo queryPrice = null;
		// 普通零担 LESSLOADED
		// 定日达 ONTIME
		try {
			List<PriceCalcRespVo> list = new ArrayList<PriceCalcRespVo>();
			queryPrice = iDcPriceTimeService.queryPrice(vo);
			if (queryPrice.getList().size() == 0)
				queryPrice = iPriceTimeService.queryPrice(vo);
			for (PriceQueryResult priceQueryResult : queryPrice.getList()) {
				PriceCalcRespVo priceCalcVo = new PriceCalcRespVo();
				// 重货
				Double heavy = vo.getWeight() * priceQueryResult.getHeavyPrice();
				// 轻货
				Double light = vo.getVolumn() * priceQueryResult.getLightPrice();
				if (heavy > light) {
					// 设置货物类型
					priceCalcVo.setGoodsType("重货");
				} else {
					priceCalcVo.setGoodsType("轻货");
				}

				// 起步价
				Double startprice = priceQueryResult.getStartPrice();
				// 计算轻货重货
				if (heavy > light && heavy > startprice) {
					startprice = heavy;
				} else if (light > heavy && light > startprice) {
					startprice = light;
					priceCalcVo.setGoodsType("轻货");
				} else if (light == heavy && light > startprice) {
					startprice = light;
				}
				// 设置运费
				priceCalcVo.setTransCost(df.format(Math.ceil(startprice)));
				// 设置运输时效
				priceCalcVo.setTransAging("第" + StringUtils.timeMinusOne(priceQueryResult.getDeliveryTime()) + "天");
				// 运输类型
				priceCalcVo.setTransType(priceQueryResult.getTransportType());
				// 燃油费
				priceCalcVo.setFuelCost(doubleUpCeilFormat(priceQueryResult.getSurcharge()));
				// 信息费
				priceCalcVo.setMessageCost(doubleUpCeilFormat((priceQueryResult.getMessageFee())));
				// 工本费
				priceCalcVo.setLaborCost(doubleUpCeilFormat((priceQueryResult.getIssusingFee())));
				// 保价费
				Double insuredRate = priceQueryResult.getInsuredRate();
				Double minInsuredFee = priceQueryResult.getMinInsuredFee();
				Double insurance = (vo.getInsurance() * insuredRate) / 1000;
				if (insurance > 0 && insurance < minInsuredFee) {
					insurance = minInsuredFee;
				}
				// 设置保价费
				priceCalcVo.setInsuredCost(doubleUpCeilFormat(insurance));
				// 代收货款费
				Double charge = vo.getCollDeliveryAmount();
				if (charge > 20000) {
					charge = charge * 0.008;
				} else if (charge > 0 && charge <= 20000) {
					charge = charge * 0.01;
					charge = charge < 20 ? 20 : charge;
				}

				// 代收货款手续费最大值100，
				if (charge > 100) {
					charge = 100D;
				}

				// 设置代收货款费
				priceCalcVo.setCollProceCost(doubleUpCeilFormat(charge));

				// 设置费用合计
				Double chargeTotal = Double.parseDouble(priceCalcVo.getCollProceCost()) + // 代收货款费
						Double.parseDouble(priceCalcVo.getFuelCost()) + // 燃油
						Double.parseDouble(priceCalcVo.getInsuredCost()) + // 保价
						Double.parseDouble(priceCalcVo.getLaborCost()) + // 工本费
						Double.parseDouble(priceCalcVo.getMessageCost()) + // 信息费
						Double.parseDouble(priceCalcVo.getTransCost()); // 交通运输费
				// 设置费用合计
				priceCalcVo.setTotalCost(doubleUpCeilFormat(chargeTotal));
				list.add(priceCalcVo);

			}
			priceCalcRespListVo.setList(list);
			priceCalcRespListVo.setErrcode(AppUtil.EXCEPTION_STATUS_SUCCESS);
		} catch (Exception e) {
			priceCalcRespListVo.setErrcode(AppUtil.CALL_INTERFACE_EXCEPTION);
		}
		return priceCalcRespListVo;
	}

	private static String doubleUpCeilFormat(double data) {
		return df.format(Math.ceil(data));
	}

	/**
	 * 转换TTQ的返回对象和DC对象
	 * @param prices
	 * 田育林，2016-07-14
	 */
	public List<PriceTimeVo> toPriceTimeList(List<PriceQueryResult> prices) {
		List<PriceTimeVo> priceTimeVos = new ArrayList<PriceTimeVo>();
		if(prices!=null && prices.size()>0){
			for(int i=0; i<prices.size(); i++){
				PriceTimeVo priceTimeVo = new PriceTimeVo();
				PriceQueryResult priceQueryResult = prices.get(i);
				//运输类型，ONTIME 定日达，LESSLOADED 普通零担
				if("ONTIME".equals(priceQueryResult.getTransportType())){
					priceTimeVo.setEbptNameCn("定日达");
				}else if("LESSLOADED".equals(priceQueryResult.getTransportType())){
					priceTimeVo.setEbptNameCn("普通零担");
				}
				priceTimeVo.setEbpdDeliveryHour("第"+priceQueryResult.getPickTime()+"天"); //客户自提时间
				priceTimeVo.setEbpdHeavyCargo(priceQueryResult.getHeavyPrice()); //重货单价，元/千克
				priceTimeVo.setEbpdLightCargo(priceQueryResult.getLightPrice()); //轻货单价，元/立方米
				priceTimeVo.setEbpdStartPrice(priceQueryResult.getStartPrice()); //起步价，元/票*
				priceTimeVo.setEbdiHeavyGoods(priceQueryResult.getHeveryDiscount()); //重货折扣率
				priceTimeVo.setEbdiLightGoods(priceQueryResult.getLightDiscount()); //轻货折扣率
				priceTimeVo.setEbpdSendHour("第"+priceQueryResult.getDeliveryTime()+"天"); //送货上门时间
				priceTimeVo.setSunxu("3");
				priceTimeVos.add(priceTimeVo);
			}
		}
		return priceTimeVos;
	}
}
