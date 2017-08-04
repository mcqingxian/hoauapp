package com.hoau.hoauapp.util.serverfile;

import java.io.*;
import java.util.*;

import com.hoau.hoauapp.constant.PropertyConstant;
import com.hoau.hoauapp.constant.PropertyManager;
import com.hoau.hoauapp.util.StringUtil;

import java.net.*;

/**
 * 文档服务连接器
 * @author 田育林
 *
 */
public class DocConnector{
	protected static ArrayList<DocServerConf> docServers = new ArrayList<DocServerConf>();
	
	/** 配置信息 */
	public static final String id = PropertyConstant.DOCSERVER_ID;
	public static final String url = PropertyConstant.DOCSERVER_URL;
	public static final String types = PropertyConstant.DOCSERVER_TYPES;
	public static final String enable = PropertyConstant.DOCSERVER_ENABLE;
	public static final String picdir = PropertyConstant.DOCSERVER_PICDIR;

	/**
	 * 静态初始化
	 */
	static {
		DocServerConf ds = new DocServerConf();
		ds.id = id;
		ds.url = url;
		ds.types = types;
		ds.enable = !"false".equalsIgnoreCase(enable);
		docServers.add(ds);
	}
	
	
	/**
	 * 根据业务类型来寻找文档服务器地址
	 */
	public static String findServerUrlByType(String type, boolean write)
	{
		if(docServers == null || docServers.size() == 0 || StringUtil.isEmpty(type))
		{
			return "";
		}
		for (DocServerConf ds : docServers)
		{
			//没有正常的连接
			if(!ds.isOK())
			{
				continue;
			}
			//是否满足类型的要求
			if(ds.isMatchTypes(type))
			{
				return ds.url;
			}
		}
		//如果不是用于写入的，只是要读，就可以随便找一个
		//hsw at 2013-04-19, 即使写入也允许任意类型的服务器
		if(true || !write)
		{
			for (DocServerConf ds : docServers)
			{
				//没有正常的连接
				if(!ds.isOK())
				{
					continue;
				}
				return ds.url;
			}
		}
		return "";
	}
	
	/**
	 * 根据组号来寻找文档服务器地址
	 */
	public static String findServerUrlByGroupFlag(String groupFlag)
	{
		if(groupFlag == null || groupFlag.length() < 2)
		{
			return "";
		}
		String id = groupFlag.substring(0, 2);

		if(docServers == null || docServers.size() == 0)
		{
			return "";
		}
		//首先尽量根据服务器ID号来查找
		for (DocServerConf ds : docServers)
		{
			//没有正常的连接
			if(!ds.isOK())
			{
				continue;
			}
			if(id.equals(ds.id))
			{
				return ds.url;
			}
		}
		//如果还是找不到，则随便取一个吧
		for (DocServerConf ds : docServers)
		{
			//没有正常的连接
			if(!ds.isOK())
			{
				continue;
			}
			return ds.url;
		}
		return "";
	}
	
	/**
	 * 主动告知连接不可用
	 * @param url
	 */
	public static void serverNotAvailable(String url)
	{
		if(!StringUtil.isEmpty(url))
		{
			//首先尽量根据服务器ID号来查找
			for (DocServerConf ds : docServers)
			{
				//没有正常的连接
				if(url.equals(ds.url))
				{
					ds.serverNotAvailable();
				}
			}
		}
	}

	public static boolean isConnectOK(String urlAddress)
	{
		try {
			URL url = new URL(urlAddress);
			URLConnection servletConn = url.openConnection();
			servletConn.setReadTimeout(500);
			servletConn.setConnectTimeout(500);
			servletConn.setDoInput(true);
			servletConn.setDoOutput(true);
			servletConn.setUseCaches(false);
			servletConn.setDefaultUseCaches(false);
			servletConn.setRequestProperty("Content-type","application/octet-stream");
			//发送对象
			ObjectOutputStream objOut = new ObjectOutputStream(servletConn.getOutputStream());
			objOut.writeObject("connect test");
			objOut.flush();
			objOut.close();
			
			InputStream inStrm = servletConn.getInputStream(); 
			inStrm.close();
		} catch (MalformedURLException e) {
			return false;
		} catch (IOException e) {
			return false;
		}
		return true;
	}
}