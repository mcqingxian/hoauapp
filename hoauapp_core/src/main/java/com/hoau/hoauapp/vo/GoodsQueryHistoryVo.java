package com.hoau.hoauapp.vo;

import java.util.List;

/** 
* @ClassName: GoodsQueryHistoryVo 
* @Description: 货物查询历史记录
* @author xujun jun.xu@hoau.net
* @date 2015年1月16日 下午1:46:20 
*  
*/
public class GoodsQueryHistoryVo extends ResBaseVo{
	private List<String> waybills;

	public List<String> getWaybills() {
		return waybills;
	}

	public void setWaybills(List<String> waybills) {
		this.waybills = waybills;
	}
	
}
