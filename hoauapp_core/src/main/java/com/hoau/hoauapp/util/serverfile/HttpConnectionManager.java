package com.hoau.hoauapp.util.serverfile;

import org.apache.http.client.HttpClient;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.PoolingClientConnectionManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

/**
 * http���ӳ�
 * @author cyl
 * */

public class HttpConnectionManager 
{
	/** �������� */
	private static HttpParams httpParams;
	/** ��ȡ���� */
	private static PoolingClientConnectionManager cm;

    /** 
     * ��������� 
     */  
    public final static int MAX_TOTAL_CONNECTIONS = 200;  
    /** 
     * ��ȡ���ӵ����ȴ�ʱ�� 
     */  
    public final static int WAIT_TIMEOUT = 60000;  
    /** 
     * ÿ��·����������� 
     */  
    public final static int MAX_ROUTE_CONNECTIONS = 200;  
    /** 
     * ���ӳ�ʱʱ�� 
     */  
    public final static int CONNECT_TIMEOUT = 10000;  
    /** 
     * ��ȡ��ʱʱ�� 
     */  
    public final static int READ_TIMEOUT = 10000; 
    
    static
    {
        httpParams = new BasicHttpParams();  
    	/** �������ӳ�ʱʱ�� */
    	HttpConnectionParams.setConnectionTimeout(httpParams, CONNECT_TIMEOUT);
    	/** ���ö�ȡ��ʱʱ�� */
    	HttpConnectionParams.setSoTimeout(httpParams, READ_TIMEOUT);
    	SchemeRegistry schemeRegistry = new SchemeRegistry();  
    	schemeRegistry.register(  
    			new Scheme("http", 80, PlainSocketFactory.getSocketFactory()));  
    	schemeRegistry.register(  
    			new Scheme("https", 443, SSLSocketFactory.getSocketFactory()));
    	cm = new PoolingClientConnectionManager(schemeRegistry);
    	/** ������������� */
    	cm.setMaxTotal(MAX_TOTAL_CONNECTIONS);
    	/** ����·����������� */
    	cm.setDefaultMaxPerRoute(MAX_ROUTE_CONNECTIONS);
    }
    
    public static HttpClient getHttpClient()
    {
    	return new DefaultHttpClient(cm, httpParams);
    }
    
    public static String getTotalStats()
    {
    	return cm.getTotalStats().toString();
    }
  
}
