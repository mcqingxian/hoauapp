package com.hoau.hoauapp.util;
/**
 * 
 * @author 271755
 * 经纬度转换工具类
 */
public class LatLngConvertUtil {
	
	/**
	 * 谷歌地图纬度转换为百度地图纬度
	 * @param lat
	 * @return
	 */
	public static double latG2B(double lat){
		double i = (Math.round((lat+0.0060) * 10000000));
		double j = 10000000d;
		double res = i/ j;
		return res;
	}
	/**
	 * 谷歌地图经度转换为百度地图经度
	 * @param lat
	 * @return
	 */
	public static double lngG2B(double lng){
		double i = (Math.round((lng+0.0065) * 10000000));
		double j = 10000000d;
		double res = i/ j;
		return res;
	}
	
}
