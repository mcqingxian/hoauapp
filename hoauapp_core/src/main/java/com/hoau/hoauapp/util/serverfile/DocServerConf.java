package com.hoau.hoauapp.util.serverfile;

import java.util.Vector;

/**
 * 文档服务器对象
 * @author hsw
 */
public class DocServerConf 
{

	/** 2位的服务器编号 */
	public String id;
	/** 服务器地址 */
	public String url;
	/** 支持的业务类型，all表示所有，否则各个类型用逗号隔开 */
	public String types;
	/** 是否启用 */
	public boolean enable = true;
	/** 连接是否正常 */
	private boolean isConnectOk = false;
	/** 上次检查的时间 */
	private long connectCheckTime = 0;
	
	Vector typesVec = null;
	
	@Override
	public String toString()
	{
		return "DocServerConf[id="+id+",url="+url+",types="+types+",enable="+enable+"]";
	}
	
	public void serverNotAvailable()
	{
		this.isConnectOk = false;
	}
	
	private Vector getTypesVec()
	{
		if(typesVec == null)
		{
			String[] typesVecArrs = this.types.split(",");
			if(typesVecArrs!=null && typesVecArrs.length>0){
				for(String typesVecArr : typesVecArrs){
					typesVec.add(typesVecArr);
				}
			}
		}
		return typesVec;
	}
	
	public boolean isMatchTypes(String type)
	{
		if("all".equalsIgnoreCase(this.types))
		{
			return true;
		}
		//拆分
		Vector vec = getTypesVec();
		for (int i = 0; i < vec.size(); i++)
		{
			if(type.equals(((String)vec.get(i)).trim()))
			{
				return true;
			}
		}
		return false;
	}
	
	public boolean isOK()
	{
		//配置了此服务器已启用 and 连接是有效的
		return this.enable && this.isConnectOK();
	}

	private boolean isConnectOK()
	{
		long current = System.currentTimeMillis();
		boolean check = false;
		//正常的连接，每隔10分钟检查一次
		if(isConnectOk)
		{
			check = current - connectCheckTime >= 600000;
		}
		else//之前就是不正常的连接，每隔10s就实际检查一次
		{
			check = current - connectCheckTime >= 10000;
		}
		if(check)
		{
			isConnectOk = DocConnector.isConnectOK(url);
			System.out.println("isConnectOK="+isConnectOk+",url="+url);
			connectCheckTime = current;
		}
		return isConnectOk;
	}
	
}
