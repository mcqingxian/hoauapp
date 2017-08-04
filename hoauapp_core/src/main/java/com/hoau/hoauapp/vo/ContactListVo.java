package com.hoau.hoauapp.vo;

import java.util.List;

public class ContactListVo extends ResBaseVo{
	List<ContactVo> contacts;
	
	public List<ContactVo> getContacts() {
		return contacts;
	}

	public void setContacts(List<ContactVo> contacts) {
		this.contacts = contacts;
	}

}
