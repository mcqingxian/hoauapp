package com.hoau.hoauapp.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.hoau.hoauapp.vo.ContactVo;

@Repository
public interface ContactMapper {
	List<ContactVo> queryContacts(Map<String,String> map);

	void saveContact(ContactVo contactVo);
	
	void updateContact(ContactVo contactVo);
	
	void deleteContact(Map<String,String> map);
	
	void updateContactIsDefault(ContactVo contactVo);

	List<ContactVo> queryDefaultContact(Map<String, String> map);
}
