package com.hoau.hoauapp.exception;

import java.util.Locale;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.hoau.hoauapp.util.AppUtil;
import com.hoau.hoauapp.vo.ResBaseVo;

@Provider
public class CXFExceptionHandler implements ExceptionMapper<Throwable> {

	public Response toResponse(Throwable ex) {
		ResponseBuilder rb = Response
				.status(Response.Status.INTERNAL_SERVER_ERROR);
		rb.type("application/json;charset=UTF-8");
		ResBaseVo entity = new ResBaseVo();
		if (ex instanceof BusinessException) {// 自定义的异常类
			ex.printStackTrace();
			BusinessException e = (BusinessException) ex;
			entity.setErrcode(AppUtil.EXCEPTION_STATUS_BUSINESS_ERROR);
			entity.setErrmsg(e.getErrMsg());
			rb.entity(entity);
		} else {
			ex.printStackTrace();
			entity.setErrcode(AppUtil.EXCEPTION_STATUS_SYSTEM_ERROR);
			entity.setErrmsg("系统异常");
			rb.entity(entity);
		}
		rb.language(Locale.SIMPLIFIED_CHINESE);
		Response r = rb.build();
		return r;
	}

}
