package com.hoau.hoauapp.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.hoau.hoauapp.service.IGoodsTraceService;
import com.hoau.hoauapp.si.ttq.FoxPriceParamModel;
import com.hoau.hoauapp.si.ttq.FoxPriceResult;
import com.hoau.hoauapp.si.ttq.FoxService;
import com.hoau.hoauapp.si.ttq.FoxServicePortType;
import com.hoau.hoauapp.si.ttq.FoxTraceInfo;
import com.hoau.hoauapp.si.ttq.FoxTraceResult;
import com.hoau.hoauapp.si.ttq.ObjectFactory;
import com.hoau.hoauapp.util.AppUtil;
import com.hoau.hoauapp.vo.GoodsQueryHistoryVo;
import com.hoau.hoauapp.vo.GoodsTraceResponse;
import com.hoau.hoauapp.vo.PriceAndTimeResponse;
import com.hoau.hoauapp.vo.TraceInfo;

@Service
public class GoodsTraceService implements IGoodsTraceService{
	FoxServicePortType foxService = null;
	ObjectFactory factory = null;
	public GoodsTraceService() {
		foxService = new FoxService().getFoxServiceHttpPort();
		factory = new ObjectFactory();
	}
	
	
	public GoodsTraceResponse goodsTrace(String waybill) {
		FoxTraceResult traceResult = foxService.queryGoodsTrack(waybill);
		return wrappGoodsTrace(traceResult);
	}
	
	private GoodsTraceResponse wrappGoodsTrace(FoxTraceResult traceResult) {
		GoodsTraceResponse goodsTraceResponse = new GoodsTraceResponse();
		goodsTraceResponse.setPickComCustomerCare(traceResult.getPickComCustomerCare().getValue());
		goodsTraceResponse.setPickCompanyAddr(traceResult.getPickCompanyAddr().getValue());
		goodsTraceResponse.setPickCompanyName(traceResult.getPickCompanyName().getValue());
		goodsTraceResponse.setPickCompanyTel(traceResult.getPickCompanyTel().getValue());
		
		List<FoxTraceInfo> foxTraceInfos = traceResult.getFoxTraceInfos().getValue().getFoxTraceInfo();
		List<TraceInfo> infos = new ArrayList<TraceInfo>();
		for(FoxTraceInfo t : foxTraceInfos){
			TraceInfo info = new TraceInfo();
			info.setDesc(t.getDesc().getValue());
			info.setTime(t.getTime().getValue());
			infos.add(info);
		}
		Collections.sort(infos, Collections.reverseOrder(new Comparator<TraceInfo>() {
			public int compare(TraceInfo o1, TraceInfo o2) {
				return o1.getTime().compareTo(o2.getTime());
			}
		}));
		if(infos.size()>0){
			infos.get(0).setNewestStatus(true);
		}
		goodsTraceResponse.setTraceInfos(infos);
		goodsTraceResponse.setErrcode(AppUtil.EXCEPTION_STATUS_SUCCESS);
		return goodsTraceResponse;
	}

	public PriceAndTimeResponse queryPriceAndTime(String waybill) {
		FoxPriceParamModel priceParamModel = new FoxPriceParamModel();
		priceParamModel.setClientID(factory.createFoxPriceParamModelClientID("clientid"));
		priceParamModel.setConCityName(factory.createFoxPriceParamModelConCityName("conCitynam"));
		priceParamModel.setConCountyName(factory.createFoxPriceParamModelConCountyName("conCountyName"));
		priceParamModel.setConProvince(factory.createFoxPriceParamModelConProvince("conProvince"));
		priceParamModel.setInsurancePrice(10000);
		priceParamModel.setShepperProvince(factory.createFoxPriceParamModelShepperProvince("shipperProvince"));
		priceParamModel.setShipperCityName(factory.createFoxPriceParamModelShipperCityName("shipperCityName"));
		priceParamModel.setShipperCountyName(factory.createFoxPriceParamModelShipperCountyName("ShipperCountyName"));
		priceParamModel.setTransportType(factory.createFoxPriceParamModelTransportType("TransportType"));
		priceParamModel.setVolume(0.01);
		priceParamModel.setWeight(0.01);
		
		FoxPriceResult traceResult = foxService.queryPrice(priceParamModel);
		
		PriceAndTimeResponse priceAndTimeResponse = new PriceAndTimeResponse();
		priceAndTimeResponse.setEbpdDeliveryHour(traceResult.getEbpdDeliveryHour().getValue());
		priceAndTimeResponse.setEbpdSendHour(traceResult.getEbpdSendHour().getValue());
		priceAndTimeResponse.setFreightPrice(traceResult.getFreightPrice().getValue());
		priceAndTimeResponse.setInsurancePrice(traceResult.getInsurancePrice().getValue());
		priceAndTimeResponse.setIsSuccess(traceResult.getIsSuccess().getValue());
		priceAndTimeResponse.setMsg(traceResult.getMsg().getValue());
		
		return priceAndTimeResponse;
	}


	public GoodsQueryHistoryVo goodsQueryHistoryVo(String userid) {
		List<String> waybills = new ArrayList<String>();
		waybills.add("12345678");
		waybills.add("12345679");
		GoodsQueryHistoryVo goodsQueryHistoryVo = new GoodsQueryHistoryVo();
		goodsQueryHistoryVo.setWaybills(waybills);
		goodsQueryHistoryVo.setErrcode(AppUtil.EXCEPTION_STATUS_SUCCESS);
		goodsQueryHistoryVo.setErrmsg("success");
		return goodsQueryHistoryVo;
	}
	
	
}
