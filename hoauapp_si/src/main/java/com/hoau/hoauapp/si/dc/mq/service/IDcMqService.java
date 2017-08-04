package com.hoau.hoauapp.si.dc.mq.service;

public interface IDcMqService<T> {
	String getMethod();
	T toObject(String json);
	void service(T entity);
}
