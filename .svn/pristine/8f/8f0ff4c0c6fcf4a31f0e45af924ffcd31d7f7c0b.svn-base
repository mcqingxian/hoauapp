package com.hoau.hoauapp.business.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baidu.yun.core.annotation.RangeRestrict;
import com.hoau.hoauapp.business.ISliderManageService;
import com.hoau.hoauapp.mapper.ResourceMapper;
import com.hoau.hoauapp.util.ZipFileUtil;
import com.hoau.hoauapp.vo.ResourceVo;
import com.hoau.hoauapp.vo.SlideShow;
/**
 * 
 *
 * @作者： wangmingzhao
 * @Title: SliderManageService.java
 * @Package com.hoau.hoauapp.business.impl
 * @Description: APP主页滑动广告管理服务实现类
 * @Date: 2015-4-17 下午5:22:56
 */
@Service
public class SliderManageService implements ISliderManageService {

	@Resource
	private ResourceMapper resourceMapper;
	
	/**
	 * 
	 * 方法体说明： 资源信息添加
	 * 作者：wangmingzhao
	 * 日期：2015-4-22 下午2:57:07
	 * 
	 * @param slide   资源明细list
	 * @param filepath  zip包路径
	 * @param destination  解压目录
	 */
	@Transactional
	public void addSliderMsg(List<SlideShow> slide,String filepath,String destination) {
		try {
			Map map = new HashMap();
			ResourceVo resource = new ResourceVo();
			resource.setResourcetype(ResourceVo.RESOURCE_SLIDER);
			map.put("resourceType", ResourceVo.RESOURCE_SLIDER);
			int nowdatenum = ZipFileUtil.getNowDateofInt();
			int maxversion = resourceMapper.queryMaxVersionByType(map);
			if(nowdatenum > maxversion){
				resource.setResourceversion(nowdatenum);
			}else{
				resource.setResourceversion(maxversion+1);
			}
			//添加资源信息主表
			resourceMapper.addResource(resource);
			//解压目录
			destination = destination+"/"+resource.getResourceversion()+"/";
			//添加资源信息明细表
			for(SlideShow s:slide){
				s.setVersion(resource.getResourceversion());
				resourceMapper.addSlider(s);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("资源消息添加异常");
		}
		//解压附件
		try{
			if(!ZipFileUtil.unZip(filepath, destination,false)){
				throw new RuntimeException("附件解压异常");
			}
		}catch(Exception e){
			e.printStackTrace();
			throw new RuntimeException("附件解压异常");
		}
		
		
			
	}

	public List<SlideShow> findSliderMsg(Map map) {	
		return resourceMapper.findSlide(map);
	}

	public long getCount(Map map) {	
		return resourceMapper.getCount(map);
	}
	
	

}
