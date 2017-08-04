package com.hoau.hoauapp.facade;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.springframework.stereotype.Service;

import com.hoau.hoauapp.business.IResourceService;
import com.hoau.hoauapp.constant.HttpConstant;
import com.hoau.hoauapp.vo.DictionaryVo;
import com.hoau.hoauapp.vo.ProductIntroduceCheckVersionVo;
import com.hoau.hoauapp.vo.SliderCheckVersionVo;

@Service
@Path("/resource")
@Consumes(HttpConstant.DATATYPE)
@Produces(HttpConstant.DATATYPE)
public class ResourceFacade {
	@Resource
	private IResourceService resourceService;
	
	@GET
	@Path("sliders/check/{version}")
	public SliderCheckVersionVo checkSliderUpdate(@PathParam("version")String version){
		return resourceService.checkSliderUpdate(version);
	}
	
	@GET
	@Path("productIntroduce/check/{version}")
	public ProductIntroduceCheckVersionVo checkProductIntroduceUpdate(@PathParam("version")String version){
		return resourceService.checkProductIntroduceUpdate(version);
	}
	
	@POST
	@Path("queryDictionaryInfo")
	public DictionaryVo queryDictionaryInfo(DictionaryVo dictionaryVo){
		return resourceService.queryDictionaryInfo(dictionaryVo);
	}
}
