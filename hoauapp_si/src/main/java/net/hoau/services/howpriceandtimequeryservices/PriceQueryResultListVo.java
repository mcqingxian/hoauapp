package net.hoau.services.howpriceandtimequeryservices;

import java.util.ArrayList;
import java.util.List;

import com.hoau.hoauapp.vo.ResBaseVo;

/**
 * 用于转换PriceQueryResult对象
 * 
 * @author zhangchao 2016年5月10日上午10:33:46
 *
 */
public class PriceQueryResultListVo extends ResBaseVo {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5066013377138647586L;
	List<PriceQueryResult> list;
	public List<PriceQueryResult> getList() {
		return list;
	}
	public void setList(List<PriceQueryResult> list) {
		this.list = list;
	}
	
	
}
