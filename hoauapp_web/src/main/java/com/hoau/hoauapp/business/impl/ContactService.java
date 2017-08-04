package com.hoau.hoauapp.business.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hoau.hoauapp.business.IContactService;
import com.hoau.hoauapp.mapper.ContactMapper;
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
public class ContactService implements IContactService{
	@Resource
	ContactMapper contactMapper;
	@Transactional
	public ResBaseVo addContact(ContactVo contactVo) {
		if(contactVo.isDefault()){
			contactMapper.updateContactIsDefault(contactVo);
		}
		contactMapper.saveContact(contactVo);
		ResBaseVo res = new ResBaseVo();
		res.setErrcode(AppUtil.EXCEPTION_STATUS_SUCCESS);
		return res;
	}
	@Transactional
	public ResBaseVo updateContact(ContactVo contactVo){
		if(contactVo.isDefault()){
			contactMapper.updateContactIsDefault(contactVo);
		}
		contactMapper.updateContact(contactVo);
		ResBaseVo res = new ResBaseVo();
		res.setErrcode(AppUtil.EXCEPTION_STATUS_SUCCESS);
		return res;
	}
	@Transactional
	public ResBaseVo deleteContact(String userId,String contactId){
		Map<String,String> map = new HashMap<String,String>();
		map.put("userId", userId);
		map.put("contactId", contactId);
		contactMapper.deleteContact(map);
		ResBaseVo res = new ResBaseVo();
		res.setErrcode(AppUtil.EXCEPTION_STATUS_SUCCESS);
		return res;
	}
	
	public ContactListVo queryContact(String userId,String contactType){
		Map<String,String> map = new HashMap<String,String>();
		map.put("userId", userId);
		map.put("contactType", contactType);
		List<ContactVo> contacts = contactMapper.queryContacts(map);
		ContactListVo res = new ContactListVo();
		res.setErrcode(AppUtil.EXCEPTION_STATUS_SUCCESS);
		res.setContacts(contacts);
		return res;
	}
	public ContactListVo queryDefaultContact(String userId) {
		Map<String,String> map = new HashMap<String,String>();
		map.put("userId", userId);
		List<ContactVo> contacts = contactMapper.queryDefaultContact(map);
		ContactListVo res = new ContactListVo();
		res.setErrcode(AppUtil.EXCEPTION_STATUS_SUCCESS);
		res.setContacts(contacts);
		return res;
	}
}
