/**
 * 
 */
package com.hoau.hoauapp.business;

import com.hoau.hoauapp.vo.ResBaseVo;


/** 
* @ClassName: IMsgService 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author xujun jun.xu@hoau.net
* @date 2015年1月9日 下午4:24:04 
*  
*/
public interface IMsgService {
	public ResBaseVo sendValiCode(String mobile ,int apptype);
}
