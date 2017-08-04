package com.hoau.hoauapp.facade;

import java.security.SignatureException;

import javax.annotation.Resource;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.springframework.stereotype.Service;

import com.hoau.hoauapp.business.IContactService;
import com.hoau.hoauapp.common.Signature;
import com.hoau.hoauapp.constant.HttpConstant;
import com.hoau.hoauapp.util.AppUtil;
import com.hoau.hoauapp.vo.ContactListVo;
import com.hoau.hoauapp.vo.ContactVo;
import com.hoau.hoauapp.vo.ResBaseVo;

/**
 * 
 * @author 271755
 *
 */
@Service
@Path("/contact")
@Consumes(HttpConstant.DATATYPE)
@Produces(HttpConstant.DATATYPE)
public class ContactFacade {
	@Resource
	IContactService contactService;
	@POST
	@Path("add")
	public ResBaseVo addContact(ContactVo contactVo){
		return contactService.addContact(contactVo);
	}
	
	@GET
	@Path("delete/{contactId}/{userId}")
	public ResBaseVo deleteContact(@PathParam("contactId")String contactId,@PathParam("userId")String userId){
		return contactService.deleteContact(userId, contactId);
	}
	
	/*
	 * added by liji 2016-01-08
	 * start
	 */
	@GET
	@Path("delete/{contactId}/{userId}/{time}/{key}")
	public ResBaseVo deleteContactWithKey(@PathParam("contactId")String contactId,@PathParam("userId")String userId, 
			@PathParam("time")String time, @PathParam("key")String key){
		String sign = null;
		try {
			sign = Signature.calculateRFC2104HMAC((contactId + userId + time), AppUtil.AUTHENTICATION_KEY);
		} catch (SignatureException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(!sign.equals(key)){
			ContactListVo r = new ContactListVo();
			r.setErrcode(AppUtil.EXCEPTION_STATUS_AUTHENTICATION_ERROR);
			r.setErrmsg(AppUtil.EXCEPTION_STATUS_AUTHENTICATION_MESSAGE);
			return r;
		}else{
			return contactService.deleteContact(userId, contactId);
		}
	}
	/*
	 * end
	 */
	
	@POST
	@Path("update")
	public ResBaseVo updateContact(ContactVo contactVo){
		return contactService.updateContact(contactVo);
	}
	
	@GET
	@Path("contactById/{contactId}")
	public ContactVo queryContactById(@PathParam("contactId")String contactId){
		return null;
	}
	@GET
	@Path("contacts/{userId}/{contactType}")
	public ContactListVo queryContacts(@PathParam("userId")String userId,@PathParam("contactType")String contactType){
		return contactService.queryContact(userId, contactType);
	}
	
	/*
	 * added by liji 2016-01-08
	 * start
	 */
	@GET
	@Path("contacts/{userId}/{contactType}/{time}/{key}")
	public ContactListVo queryContactsWithKey(@PathParam("userId")String userId,@PathParam("contactType")String contactType,
			@PathParam("time")String time, @PathParam("key")String key){
		String sign = null;
		try {
			sign = Signature.calculateRFC2104HMAC((userId + contactType + time), AppUtil.AUTHENTICATION_KEY);
		} catch (SignatureException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(!sign.equals(key)){
			ContactListVo r = new ContactListVo();
			r.setErrcode(AppUtil.EXCEPTION_STATUS_AUTHENTICATION_ERROR);
			r.setErrmsg(AppUtil.EXCEPTION_STATUS_AUTHENTICATION_MESSAGE);
			return r;
		}else{
			return contactService.queryContact(userId, contactType);
		}
	}
	/*
	 * end
	 */
	@GET
	@Path("default/{userId}")
	public ContactListVo queryDefaultContact(@PathParam("userId")String userId){
		return contactService.queryDefaultContact(userId);
	}
	
	/*
	 * added by liji 2016-01-08
	 * start
	 */
	@GET
	@Path("default/{userId}/{time}/{key}")
	public ContactListVo queryDefaultContactWithKey(@PathParam("userId")String userId, @PathParam("time")String time, @PathParam("key")String key){
		String sign = null;
		try {
			sign = Signature.calculateRFC2104HMAC((userId + time), AppUtil.AUTHENTICATION_KEY);
		} catch (SignatureException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(!sign.equals(key)){
			ContactListVo r = new ContactListVo();
			r.setErrcode(AppUtil.EXCEPTION_STATUS_AUTHENTICATION_ERROR);
			r.setErrmsg(AppUtil.EXCEPTION_STATUS_AUTHENTICATION_MESSAGE);
			return r;
		}else{
			return contactService.queryDefaultContact(userId);
		}
	}
	/*
	 * end
	 */
}
