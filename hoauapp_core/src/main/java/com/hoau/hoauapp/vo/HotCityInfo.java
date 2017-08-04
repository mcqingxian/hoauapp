package com.hoau.hoauapp.vo;

/**
 * 热门城市
 * Created by xu on 2015-02-02.
 */
public class HotCityInfo extends DistrictInfo
{
	/**
	 * 上级（省级信息）
	 */
	private DistrictInfo province;

	public DistrictInfo getProvince()
	{
		return province;
	}

	public void setProvince(DistrictInfo province)
	{
		this.province = province;
	}

	public HotCityInfo()
	{

	}

	public HotCityInfo(String province, String city)
	{
		this.province = new DistrictInfo();
		this.province.setHasChild(true);
		this.province.setDistrictName(province);
		setDistrictName(city);
		setHasChild(true);
	}
}
