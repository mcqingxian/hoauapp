package com.hoau.hoauapp.mapper;


import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.hoau.hoauapp.vo.DictionaryVo;
import com.hoau.hoauapp.vo.ProduceIntroduceVo;
import com.hoau.hoauapp.vo.ResourceVo;
import com.hoau.hoauapp.vo.SlideShow;


@Repository
public interface ResourceMapper {

	int queryMaxVersionByType(Map<String, String> map);

	List<SlideShow> querySlidersByVersion(int version);

	List<ProduceIntroduceVo> queryProduceIntroduceByVersion(int version);
	
	DictionaryVo queryDictionaryInfo(DictionaryVo dictionaryVo);
	
	int addResource(ResourceVo resource);
	int addSlider(SlideShow slider);
	long getCount(Map map);
	List<SlideShow> findSlide(Map map);
}
