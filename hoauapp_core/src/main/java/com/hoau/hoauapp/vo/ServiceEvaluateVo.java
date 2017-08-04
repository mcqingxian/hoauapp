package com.hoau.hoauapp.vo;


import java.io.Serializable;
import java.util.HashMap;

/**
 * Created by 272285 on 2015/1/29.
 */
public class ServiceEvaluateVo extends ResBaseVo implements Serializable{
	/**
	 * 订单实体，用于客户端传输数据，方便扩展
	 */
    private OrderVo orderVo;
    /**
     * 服务评价，用于客户端传输数据，方便扩展
     */
    private HashMap<String,String> serviceMap;
    /**
     * 建议
     */
    private String advise;
    /**
     * 订单号
     */
    private String orderno;
    /**
     * 评价
     */
    private String allserviceevaluat;
    
    /**
     * @author 275636 
     * @date 2015-04-22 
     * 评价类型 （订单评价、运单评价）
     * */
    private String evaluatetype;
    /**
     * add huyuzhou 
     * 详细评价
     */
    private String detailevaluate; //详细评价
    //end
    
    /**
     * @author 275636 
     * @date 2015-04-22 
     * 运单VO
     * */
    private SendMeOrderVO sendMeOrderVO;

    public SendMeOrderVO getSendMeOrderVO() {
		return sendMeOrderVO;
	}

	public void setSendMeOrderVO(SendMeOrderVO sendMeOrderVO) {
		this.sendMeOrderVO = sendMeOrderVO;
	}

	public String getEvaluatetype() {
		return evaluatetype;
	}

	public void setEvaluatetype(String evaluatetype) {
		this.evaluatetype = evaluatetype;
	}

	public OrderVo getOrderVo() {
        return orderVo;
    }

    public void setOrderVo(OrderVo orderVo) {
        this.orderVo = orderVo;
    }

    public String getAdvise() {
        return advise;
    }

    public void setAdvise(String advise) {
        this.advise = advise;
    }

    public HashMap getServiceMap() {
        return serviceMap;
    }

    public void setServiceMap(HashMap serviceMap) {
        this.serviceMap = serviceMap;
    }

	public String getOrderno() {
		return orderno;
	}

	public void setOrderno(String orderno) {
		this.orderno = orderno;
	}

	public String getAllserviceevaluat() {
		return allserviceevaluat;
	}

	public void setAllserviceevaluat(String allserviceevaluat) {
		this.allserviceevaluat = allserviceevaluat;
	}

	public String getDetailevaluate() {
		return detailevaluate;
	}

	public void setDetailevaluate(String detailevaluate) {
		this.detailevaluate = detailevaluate;
	}

    
}
