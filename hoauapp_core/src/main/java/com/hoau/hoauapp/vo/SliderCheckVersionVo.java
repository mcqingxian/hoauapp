package com.hoau.hoauapp.vo;

import java.util.List;

/**
 * 
 * @author 271755
 * 检测首页活动是否更新
 */
public class SliderCheckVersionVo extends ResBaseVo{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String version;
	
	private boolean isUpdate;
	
	private List<SlideShow> slideShows;
	
	public List<SlideShow> getSlideShows() {
		return slideShows;
	}

	public void setSlideShows(List<SlideShow> slideShows) {
		this.slideShows = slideShows;
	}

	public boolean isUpdate() {
		return isUpdate;
	}

	public void setUpdate(boolean isUpdate) {
		this.isUpdate = isUpdate;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
	
}
