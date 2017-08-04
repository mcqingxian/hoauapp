/**
 * 
 */
package com.hoau.hoauapp.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import com.hoau.hoauapp.entity.SmsEntity;


/** 
* @ClassName: SMSNetUtil 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author xujun jun.xu@hoau.net
* @date 2015年1月9日 上午10:10:15 
*  
*/
@Component
public class SMSNetUtil implements ApplicationContextAware{
	private static final DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	private static Log log = LogFactory.getLog(SMSNetUtil.class);

	
	/** 
	* @Title: sendMsg 
	* @Description: 发送短信
	* @param @param smsEntity    设定文件 
	* @return void    返回类型 
	* @throws 
	*/
	public static void sendMsg(SmsEntity smsEntity){
		SmsWebService service = new SmsWebService();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		boolean b = false;
		try {
			b = service.sendSms(sdf.format(new Date()), "APP", 
					"sms",smsEntity.getMobile(), 
					smsEntity.getContent(), "1", 
					"", "APP");
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(b == true){
			log.info("message send sucess:mobile->"+smsEntity.getMobile()+",content->"+smsEntity.getContent());
		}else{
			throw new RuntimeException("短信发送失败！");
		}
		/*
		SmsGroup t = new SmsGroup();
		t.seteTime(df.format(smsEntity.getSendTime()));
		t.setInterFaceID(SmsConfig.INTERFACEID);
		t.setLoginName(SmsConfig.LOGIN_NAME);
		t.setLoginPwd(SmsConfig.LOGIN_PWD);
		t.setOpKind(SmsConfig.OPKIND);
		t.setSerType(SmsConfig.SERTYPE);
		
		SmsTask smsTask = new SmsTask();
		smsTask.setContent(smsEntity.getContent());
		smsTask.setRecivePhoneNumber(smsEntity.getMobile());
		smsTask.setSearchID(smsEntity.getSearchID());

		SmsItem item = new SmsItem();
		
		List<SmsTask> items = new ArrayList<SmsTask>();
		items.add(smsTask);
		item.setTasks(items);
		t.setItem(item);
		
		String xml;
		CloseableHttpClient client = null;
		try {
			xml = JaxbUtil.marshToXmlBinding(SmsGroup.class, t);
			client = HttpClients.createDefault();
			HttpPost httpPost = new HttpPost(SmsConfig.URL);
			StringEntity requestEntity = new StringEntity(xml,"GB2312");
			httpPost.setEntity(requestEntity);
			CloseableHttpResponse response = client.execute(httpPost);
			if(response.getStatusLine().getStatusCode() == HttpStatus.SC_OK){
				log.info("entity:"+EntityUtils.toString(response.getEntity()));
				log.info("message send sucess:mobile->"+smsEntity.getMobile()+",content->"+smsEntity.getContent());
			}else{
				throw new RuntimeException("短信发送失败！");
			}
		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			if(client != null){
				try {
					client.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		*/
	}
	public static void main(String[] args) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SmsEntity entity = new SmsEntity();
		entity.setContent("微信验证码：123456");
		entity.setMobile("13916078704");
		entity.setSearchID(UUIDUtil.getUUID());
		entity.setSendTime(sdf.parse("2016-07-07 16:51:45"));
		sendMsg(entity);
		/*
		String file = "E:\\King\\【工作】\\天地华宇【短信】\\优惠券\\mobile.txt";
		String content = "关注微信（id:Hoau4008086666）即可下单查询，轻轻松松，再送10元现金抵用券，就是这么任性，等什么呢！回复TD退订！";
//		String content = "test";
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
		PrintWriter pw = new PrintWriter(new FileOutputStream("E:\\King\\【工作】\\天地华宇【短信】\\优惠券\\msgId.txt", true));
		String phone = null;
		while((phone = br.readLine()) != null){
			SmsEntity entity = new SmsEntity();
			entity.setContent(content);
			entity.setMobile(phone);
			String msgId = UUIDUtil.getUUID();
			entity.setSearchID(msgId);
			entity.setSendTime(new Date());
			sendMsg(entity);
			pw.write(msgId+"@"+phone);
			pw.write("\r\n");
			System.out.println(phone+"---"+content);
			Thread.sleep(50);
		}
		pw.flush();
		pw.close();
		br.close();
		*/
	}
	public void setApplicationContext(ApplicationContext arg0)
			throws BeansException {
		
	}
}
