package com.hoau.hoauapp.vo;

import java.util.List;

public class ClaimTraceVo extends ResBaseVo{

	/**
	 * serialVersionUID:TODO（用一句话描述这个变量表示什么）
	 *
	 * @since 1.0.0
	 */
	private static final long serialVersionUID = 1L;
	
	private List<ClaimTraceInfo> traceInfos;

	public List<ClaimTraceInfo> getTraceInfos() {
		return traceInfos;
	}

	public void setTraceInfos(List<ClaimTraceInfo> traceInfos) {
		this.traceInfos = traceInfos;
	}
	
	

}
