package com.hoau.hoauapp.business.impl;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hoau.hoauapp.business.INewFeedbackService;
import com.hoau.hoauapp.constant.PropertyConstant;
import com.hoau.hoauapp.entity.User;
import com.hoau.hoauapp.mapper.NewFeedbackMapper;
import com.hoau.hoauapp.util.AppUtil;
import com.hoau.hoauapp.util.JsonUtils;
import com.hoau.hoauapp.vo.NewFeedbackBaseVo;
import com.hoau.hoauapp.vo.NewFeedbackListVo;
import com.hoau.hoauapp.vo.NewFeedbackVo;
import com.hoau.hoauapp.vo.ResBaseVo;

/**
 * 意见反馈服务类
 * 
 * @author 273503
 * 
 */
@Service
public class NewFeedbackService implements INewFeedbackService {

	@Resource
	private NewFeedbackMapper newFeedbackMapper;

	/**
	 * 新增反馈消息
	 */
	public ResBaseVo addNewFeedback(NewFeedbackVo newvo) {

		User u = new User();
		try {
			newFeedbackMapper.addNewFeedback(newvo);
			u.setErrcode(AppUtil.EXCEPTION_STATUS_SUCCESS);
		} catch (Exception e) {
			u.setErrcode(AppUtil.EXCEPTION_STATUS_BUSINESS_ERROR);
			u.setErrmsg("添加信息失败");
		}
		URL url = null;
		HttpURLConnection conn = null;
		try {

			url = new URL(PropertyConstant.NEWFEEDBACK_POST_URL);
			conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("POST");// 提交模式
			// conn.setConnectTimeout(10000);//连接超时 单位毫秒
			// conn.setReadTimeout(2000);//读取超时 单位毫秒
			conn.setDoOutput(true);// 是否输入参数

			String params = "topic=" + newvo.getTheme() + "&wbnum="
					+ newvo.getWaybill() + "&name=" + newvo.getUsername()
					+ "&tel=" + newvo.getContactway() + "&email=null&type="
					+ newvo.getFeedbacktype() + "&message="
					+ newvo.getFeedbackmsg() + "&UserID=" + newvo.getUserid()
					+ "";
			byte[] bypes = params.toString().getBytes();
			conn.getOutputStream().write(bypes);// 输入参数
			conn.getOutputStream().flush();
			conn.getOutputStream().close();
			InputStream inStream = conn.getInputStream();
			
			String resmsg = new String(readInputStream(inStream), "UTF-8");
			String rest = new String(resmsg.getBytes("utf-8"));
			NewFeedbackBaseVo nb =  JsonUtils.toObject(rest, NewFeedbackBaseVo.class);
			//是否成功
			if(!"true".endsWith(nb.getRs())){
				u.setErrmsg(nb.getMsg());
				u.setErrcode(AppUtil.EXCEPTION_STATUS_BUSINESS_ERROR);
			}else{
				u.setErrmsg(nb.getMsg());
			}
		
		} catch (Exception e) {
			e.printStackTrace();
			u.setErrcode(AppUtil.EXCEPTION_STATUS_BUSINESS_ERROR);
			u.setErrmsg("添加信息失败");
		} finally {
			if (conn != null) {
				conn.disconnect();
			}
		}

		return u;
	}


	/**
	 * 从输入流中读取数据
	 * 
	 * @param inStream
	 * @return
	 * @throws Exception
	 */
	public static byte[] readInputStream(InputStream inStream) throws Exception {
		ByteArrayOutputStream outStream = new ByteArrayOutputStream();
		byte[] buffer = new byte[1024];
		int len = 0;
		while ((len = inStream.read(buffer)) != -1) {
			outStream.write(buffer, 0, len);
		}
		byte[] data = outStream.toByteArray();// 网页的二进制数据
		outStream.close();
		inStream.close();
		return data;
	}

	/**
	 * 根据用户ID查询反馈消息
	 */
	public NewFeedbackListVo findNewFeedback(User user) {
		List<NewFeedbackVo> lst = null;
		NewFeedbackListVo lv = new NewFeedbackListVo();
		lv.setErrcode(AppUtil.EXCEPTION_STATUS_SUCCESS);
		
		if(user !=null && user.getId()!=null || !"".equals(user.getId().trim())){
			try {

				String lurl = PropertyConstant.NEWFEEDBACK_GET_URL;
				lurl = lurl + "?UserID=" + user.getId();
				URL url = new URL(lurl);
				HttpURLConnection conn = (HttpURLConnection) url.openConnection();
				conn.setRequestMethod("GET");// 提交模式
				InputStream inStream = conn.getInputStream();
				String str = new String(readInputStream(inStream));
				String ruentstr = new String(str.getBytes("utf-8"));	
				ruentstr = ruentstr.trim();
				int index = ruentstr.indexOf("[");
				if(index >=0){
					ruentstr = ruentstr.substring(index);//官网PHP框架返回字符前多余一个空号 ，需要跳过
					lst = JsonUtils.toList(ruentstr,NewFeedbackVo.class);
				}
				if(lst==null){
					lst = new ArrayList<NewFeedbackVo>();
				}
				
			} catch (Exception e) {
				e.printStackTrace();
				lv.setErrcode(AppUtil.EXCEPTION_STATUS_BUSINESS_ERROR);
				lv.setErrmsg("查询失败");
			}
		}else{
			lst = new ArrayList<NewFeedbackVo>();
		}	
		lv.setListvo(lst);	
		return lv;
	}
	




}
