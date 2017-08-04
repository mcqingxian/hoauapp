package com.hoau.hoauapp.facade;

import javax.annotation.Resource;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.stereotype.Service;

import com.hoau.hoauapp.business.INewFeedbackService;
import com.hoau.hoauapp.constant.HttpConstant;
import com.hoau.hoauapp.entity.User;
import com.hoau.hoauapp.vo.NewFeedbackListVo;
import com.hoau.hoauapp.vo.NewFeedbackVo;
import com.hoau.hoauapp.vo.ResBaseVo;
/**
 *  用户意见反馈
 * @author 273503
 *
 */
@Service
@Path("/newfeedback")
@Consumes(HttpConstant.DATATYPE)
@Produces(HttpConstant.DATATYPE)
public class NewFeedbackFacade {

	@Resource
	INewFeedbackService newFeedbackService;
	
	
	@POST
	@Path("addnewfeedback")
	public ResBaseVo addNewFeedBack(NewFeedbackVo newfeedbackvo) {
		return newFeedbackService.addNewFeedback(newfeedbackvo);
	}
	
	@POST
	@Path("findnewfeedback")
	public NewFeedbackListVo findNewFeedBack(User user) {
		return newFeedbackService.findNewFeedback(user);
	}
	
}
