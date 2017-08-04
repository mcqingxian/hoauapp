package com.hoau.hoauapp.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.ws.rs.Uri;

import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
  
/**
 *   
 * @ClassName: HttpClientUtil 
 * @Description: HttpClient调用工具类 
 * @author liudeyun deyun.liu@hoau.net 
 * @date 2015年1月15日 上午8:50:57
 */
public class HttpClientUtil {  
  
    /** 
     * 发送GET请求 
     * @param uri 
     * @return 
     */  
    @SuppressWarnings("deprecation")
	public static String sendGet(String uri) { 
        String responseBody = null;  
        @SuppressWarnings("resource")
		HttpClient httpClient = new DefaultHttpClient();  
        try {  
            HttpGet httpGet = new HttpGet(uri);
            //设置超时时间
            RequestConfig requestConfig = RequestConfig.custom() 
                    .setConnectionRequestTimeout(30)
                    .setConnectTimeout(30) 
                    .setSocketTimeout(30).build(); 
            httpGet.setConfig(requestConfig);
            System.out.println("executing request " + httpGet.getURI());  
            // Create a response handler  
            ResponseHandler<String> responseHandler = new BasicResponseHandler();  
            responseBody = httpClient.execute(httpGet, responseHandler);  
            System.out.println("----------------------------------------");  
            System.out.println(responseBody);  
            System.out.println("----------------------------------------");  
        } catch (ClientProtocolException e) {  
            throw new RuntimeException(); 
        } catch (IOException e) {  
        	throw new RuntimeException();   
        } finally {  
            httpClient.getConnectionManager().shutdown();  
        }  
        return responseBody;  
    } 
    
      
    /** 
     * 发送POST请求 
     * @param uri 
     * @param paramMap 请求参数 
     * @return 
     */  
    public static String sendPost(String uri, Map<String, String> paramMap) {  
        return sendPost(uri, paramMap, null);  
    }  
  
    /** 
     * 发送POST请求 
     * @param uri 
     * @param paramMap 请求参数 
     * @param charset 参数编码 
     * @return 
     */  
    public static String sendPost(String uri, Map<String, String> paramMap, String charset) {  
        String responseBody = null;  
        HttpClient httpClient = new DefaultHttpClient();  
        try {  
            HttpPost httpPost = new HttpPost(uri);  
            //设置超时时间
            RequestConfig requestConfig = RequestConfig.custom() 
                    .setConnectionRequestTimeout(30)
                    .setConnectTimeout(30) 
                    .setSocketTimeout(30).build(); 
            httpPost.setConfig(requestConfig);
            System.out.println("executing request " + httpPost.getURI());  
            if (paramMap != null) {  
                List<NameValuePair> nvps = new ArrayList<NameValuePair>(  
                        paramMap.size());  
                for (Map.Entry<String, String> entry : paramMap.entrySet()) {  
                    NameValuePair nvp = new BasicNameValuePair(entry.getKey(),  
                            entry.getValue());  
                    nvps.add(nvp);  
                }  
                if(charset!=null){  
                    httpPost.setEntity(new UrlEncodedFormEntity(nvps,charset));  
                }else{  
                    httpPost.setEntity(new UrlEncodedFormEntity(nvps));  
                }  
            }  
            // Create a response handler  
            ResponseHandler<String> responseHandler = new BasicResponseHandler();  
            responseBody = httpClient.execute(httpPost, responseHandler);  
            System.out.println("----------------------------------------");  
            System.out.println(responseBody);  
            System.out.println("----------------------------------------");  
        } catch (ClientProtocolException e) {  
            e.printStackTrace();  
        } catch (IOException e) {  
            e.printStackTrace();  
        } finally {  
            httpClient.getConnectionManager().shutdown();  
        }  
        return responseBody;  
  
    }  
  
}  

