package com.hoau.hoauapp.constant;


public class PropertyConstant
{
  private static final String[] fileNames = { "/config.properties" };
  private static PropertyManager propertyManager = PropertyManager.load(fileNames, PropertyConstant.class);
  public static final String OMS_URL = propertyManager.getString("OMS_URL");
  public static final String SMS_TEMPLATE = propertyManager.getString("SMS_TEMPLATE");
  public static final String NEW_OMS_URL = propertyManager.getString("NEW_OMS_URL");
  public static final String LINUXSERVER_URL = propertyManager.getString("LINUXSERVER_URL");
  public static final String LINUXSERVER_VERSION_URL = propertyManager.getString("LINUXSERVER_VERSIONURL");
  public static final String LINUXSERVER_SLIDERURL = propertyManager.getString("LINUXSERVER_SLIDERURL");
  public static final String NEWFEEDBACK_POST_URL = propertyManager.getString("NEWFEEDBACK_POST_URL");
  public static final String NEWFEEDBACK_GET_URL = propertyManager.getString("NEWFEEDBACK_GET_URL");
  public static final String DC_URL = propertyManager.getString("DC_URL");
  public static final String CLAIM_URL = propertyManager.getString("CLAIM_URL");
  public static final String LINUXSERVER_CLAIMURL = propertyManager.getString("LINUXSERVER_CLAIMURL");
  public static final String RESOURCES_URL = propertyManager.getString("RESOURCES_URL");
  public static final String DISTRICT_URL = propertyManager.getString("DISTRICT_URL");
  
  public static final String APIKEY_ANDROID = propertyManager.getString("APIKEY_ANDROID"); //android 百度推送apikey
  public static final String SECRETKEY_ANDROID = propertyManager.getString("SECRETKEY_ANDROID");//android 百度推送secretkey
  public static final String APIKEY_IOS = propertyManager.getString("APIKEY_IOS");//ios 百度推送apikey
  public static final String SECRETKEY_IOS = propertyManager.getString("SECRETKEY_IOS");//ios 百度推送secretkey
  public static final String PUSH_TITLEMSG = propertyManager.getString("PUSH_TITLEMSG"); //货物消息标题
  public static final int PUSH_STATE_IOS = propertyManager.getInt("PUSH_STATE_IOS");//ios 应用部署状态  1：开发状态2：生产状态  
  public static final String DC_SENDME_URL = propertyManager.getString("DC_SENDME_URL");
  public static final String DC_PRICETIME_URL = propertyManager.getString("DC_PRICETIME_URL");  //调用DC价格失效的接口的WSDL
  public static final String MDM_DISTRICT_URL =  propertyManager.getString("MDM_DISTRICT_URL");   //调用MDM接口获得新的省市区的接口

  /**从图片服务器获取图片时的配置信息，田育林，2016-06-20**/
  public static final String DOCSERVER_ID =  propertyManager.getString("DOCSERVER_ID");
  public static final String DOCSERVER_URL =  propertyManager.getString("DOCSERVER_URL");
  public static final String DOCSERVER_TYPES =  propertyManager.getString("DOCSERVER_TYPES");
  public static final String DOCSERVER_ENABLE =  propertyManager.getString("DOCSERVER_ENABLE");
  public static final String DOCSERVER_PICDIR =  propertyManager.getString("DOCSERVER_PICDIR");
  public static final String BANK_INFO_SERVICE = propertyManager.getString("BANK_INFO_SERVICE");
}
