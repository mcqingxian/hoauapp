package com.hoau.hoauapp.interceptor;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.apache.cxf.transport.http.AbstractHTTPDestination;
import org.springframework.stereotype.Component;

import com.hoau.hoauapp.entity.OperateRecord;
import com.hoau.hoauapp.mapper.OperateRecordMapper;


/** 
* @ClassName: AuthenticateInterceptor 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author xujun jun.xu@hoau.net
* @date 2015年1月9日 上午8:51:30 
*  
*/
@Component
public class OperateRecordsInterceptor extends AbstractPhaseInterceptor<Message> {

	private static final Log LOG = LogFactory.getLog(OperateRecordsInterceptor.class);
	
	@Resource
	private OperateRecordMapper operateRecordMapper;
	
	
	public OperateRecordsInterceptor() {
		this(Phase.PRE_STREAM);
	}

	public OperateRecordsInterceptor(String phase) {
		super(phase);
	}

	public void handleMessage(Message paramT) throws Fault {
		HttpServletRequest request = (HttpServletRequest) paramT.get(AbstractHTTPDestination.HTTP_REQUEST);
		String uri = request.getRequestURI();
		OperateRecord record = new OperateRecord();
		String reqMethod = request.getMethod();
		record.setUri(uri);
		record.setRequestMethod(reqMethod);
		try{
			operateRecordMapper.saveRecord(record);
		}catch(Exception e){
			LOG.error("日志记录异常");
			e.printStackTrace();
		}
	}
	
}
