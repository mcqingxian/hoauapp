package com.hoau.hoauapp.business.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hoau.hoauapp.business.IResourceService;
import com.hoau.hoauapp.mapper.ResourceMapper;
import com.hoau.hoauapp.util.AppUtil;
import com.hoau.hoauapp.util.StringUtil;
import com.hoau.hoauapp.vo.DictionaryVo;
import com.hoau.hoauapp.vo.ProduceIntroduceVo;
import com.hoau.hoauapp.vo.ProductIntroduceCheckVersionVo;
import com.hoau.hoauapp.vo.SlideShow;
import com.hoau.hoauapp.vo.SliderCheckVersionVo;
@Service
public class ResourceService implements IResourceService{
	@Resource
	ResourceMapper resourceMapper;
	public SliderCheckVersionVo checkSliderUpdate(String version) {
		SliderCheckVersionVo result = new SliderCheckVersionVo();
		result.setErrcode(AppUtil.EXCEPTION_STATUS_SUCCESS);
		Map<String, String> map = new HashMap<String, String>();
		map.put("resourceType", "RESOURCE_SLIDER");
		int maxVersion = resourceMapper.queryMaxVersionByType(map);
		if(StringUtil.isEmpty(version)){
			result.setUpdate(true);
			List<SlideShow> sliders =  resourceMapper.querySlidersByVersion(maxVersion);
			result.setSlideShows(sliders);
		}else{
			if(maxVersion>Integer.valueOf(version)){
				result.setUpdate(true);
				List<SlideShow> sliders =  resourceMapper.querySlidersByVersion(maxVersion);
				result.setSlideShows(sliders);
			}else{
				result.setUpdate(false);
			}
		}
		result.setVersion(String.valueOf(maxVersion));
		return result;
	}
	public ProductIntroduceCheckVersionVo checkProductIntroduceUpdate(
			String version) {
		ProductIntroduceCheckVersionVo result = new ProductIntroduceCheckVersionVo();
		result.setErrcode(AppUtil.EXCEPTION_STATUS_SUCCESS);
		Map<String, String> map = new HashMap<String, String>();
		map.put("resourceType", "PRODUCT_INTRODUCE");
		int maxVersion = resourceMapper.queryMaxVersionByType(map);
		if(StringUtil.isEmpty(version)){
			result.setUpdate(true);
			List<ProduceIntroduceVo> products = resourceMapper.queryProduceIntroduceByVersion(maxVersion);
			result.setProducts(products);
		}else{
			if(maxVersion>Integer.valueOf(version)){
				List<ProduceIntroduceVo> products = resourceMapper.queryProduceIntroduceByVersion(maxVersion);
				result.setProducts(products);
				result.setUpdate(true);
			}else{
				result.setUpdate(false);
			}
		}
		result.setVersion(String.valueOf(maxVersion));
		return result;
	}
	
	/**
	 * @Title: queryDictionaryInfo 
	 * @Description: 查询数据字典信息
	 * @param @param dictionaryVo
	 * @return     DictionaryVo
	 * @throws
	 */
	public DictionaryVo queryDictionaryInfo(DictionaryVo dictionaryVo){
		DictionaryVo result = null;
		try {
			result = resourceMapper.queryDictionaryInfo(dictionaryVo);
			if(result == null){
				result = new DictionaryVo();
			}
			result.setErrcode(AppUtil.EXCEPTION_STATUS_SUCCESS);
		} catch (Exception e) {
			result.setErrcode(AppUtil.EXCEPTION_STATUS_SYSTEM_ERROR);
		}
		return result;
	}
}
