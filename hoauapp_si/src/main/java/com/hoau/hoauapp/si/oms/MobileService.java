package com.hoau.hoauapp.si.oms;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.11
 * 2015-12-08T10:01:28.515+08:00
 * Generated source version: 2.7.11
 * 
 */
@WebService(targetNamespace = "http://service.server.itf.module.obh.hoau.com/", name = "MobileService")
@XmlSeeAlso({ObjectFactory.class})
public interface MobileService {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "createOrder", targetNamespace = "http://service.server.itf.module.obh.hoau.com/", className = "com.hoau.hoauapp.si.oms.CreateOrder")
    @WebMethod
    @ResponseWrapper(localName = "createOrderResponse", targetNamespace = "http://service.server.itf.module.obh.hoau.com/", className = "com.hoau.hoauapp.si.oms.CreateOrderResponse")
    public com.hoau.hoauapp.si.oms.PhoneOrderResModel createOrder(
        @WebParam(name = "arg0", targetNamespace = "")
        com.hoau.hoauapp.si.oms.PhoneOrderReqModel arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "resetPwd", targetNamespace = "http://service.server.itf.module.obh.hoau.com/", className = "com.hoau.hoauapp.si.oms.ResetPwd")
    @WebMethod
    @ResponseWrapper(localName = "resetPwdResponse", targetNamespace = "http://service.server.itf.module.obh.hoau.com/", className = "com.hoau.hoauapp.si.oms.ResetPwdResponse")
    public com.hoau.hoauapp.si.oms.ResetPwdResModel resetPwd(
        @WebParam(name = "arg0", targetNamespace = "")
        com.hoau.hoauapp.si.oms.ResetPwdReqModel arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "cancelPhoneOrde", targetNamespace = "http://service.server.itf.module.obh.hoau.com/", className = "com.hoau.hoauapp.si.oms.CancelPhoneOrde")
    @WebMethod
    @ResponseWrapper(localName = "cancelPhoneOrdeResponse", targetNamespace = "http://service.server.itf.module.obh.hoau.com/", className = "com.hoau.hoauapp.si.oms.CancelPhoneOrdeResponse")
    public com.hoau.hoauapp.si.oms.CancelOrderResModel cancelPhoneOrde(
        @WebParam(name = "arg0", targetNamespace = "")
        com.hoau.hoauapp.si.oms.CancelOrderReqModel arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "loginByPhone", targetNamespace = "http://service.server.itf.module.obh.hoau.com/", className = "com.hoau.hoauapp.si.oms.LoginByPhone")
    @WebMethod
    @ResponseWrapper(localName = "loginByPhoneResponse", targetNamespace = "http://service.server.itf.module.obh.hoau.com/", className = "com.hoau.hoauapp.si.oms.LoginByPhoneResponse")
    public com.hoau.hoauapp.si.oms.LoginUserResModel loginByPhone(
        @WebParam(name = "arg0", targetNamespace = "")
        com.hoau.hoauapp.si.oms.LoginUserReqModel arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "registerUser", targetNamespace = "http://service.server.itf.module.obh.hoau.com/", className = "com.hoau.hoauapp.si.oms.RegisterUser")
    @WebMethod
    @ResponseWrapper(localName = "registerUserResponse", targetNamespace = "http://service.server.itf.module.obh.hoau.com/", className = "com.hoau.hoauapp.si.oms.RegisterUserResponse")
    public com.hoau.hoauapp.si.oms.RegisterUserResModel registerUser(
        @WebParam(name = "arg0", targetNamespace = "")
        com.hoau.hoauapp.si.oms.RegisterUserReqModel arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "updateCache", targetNamespace = "http://service.server.itf.module.obh.hoau.com/", className = "com.hoau.hoauapp.si.oms.UpdateCache")
    @WebMethod
    @ResponseWrapper(localName = "updateCacheResponse", targetNamespace = "http://service.server.itf.module.obh.hoau.com/", className = "com.hoau.hoauapp.si.oms.UpdateCacheResponse")
    public com.hoau.hoauapp.si.oms.UpdateCacheResModel updateCache(
        @WebParam(name = "arg0", targetNamespace = "")
        com.hoau.hoauapp.si.oms.UpdateCacheReqModel arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "modifyOrder", targetNamespace = "http://service.server.itf.module.obh.hoau.com/", className = "com.hoau.hoauapp.si.oms.ModifyOrder")
    @WebMethod
    @ResponseWrapper(localName = "modifyOrderResponse", targetNamespace = "http://service.server.itf.module.obh.hoau.com/", className = "com.hoau.hoauapp.si.oms.ModifyOrderResponse")
    public com.hoau.hoauapp.si.oms.ModifyOrderResModel modifyOrder(
        @WebParam(name = "arg0", targetNamespace = "")
        com.hoau.hoauapp.si.oms.ModifyOrderReqModel arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "queryOrderDetail", targetNamespace = "http://service.server.itf.module.obh.hoau.com/", className = "com.hoau.hoauapp.si.oms.QueryOrderDetail")
    @WebMethod
    @ResponseWrapper(localName = "queryOrderDetailResponse", targetNamespace = "http://service.server.itf.module.obh.hoau.com/", className = "com.hoau.hoauapp.si.oms.QueryOrderDetailResponse")
    public com.hoau.hoauapp.si.oms.GetPhoneOrderResModel queryOrderDetail(
        @WebParam(name = "arg0", targetNamespace = "")
        com.hoau.hoauapp.si.oms.GetPhoneOrderReqModel arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "queryOrder", targetNamespace = "http://service.server.itf.module.obh.hoau.com/", className = "com.hoau.hoauapp.si.oms.QueryOrder")
    @WebMethod
    @ResponseWrapper(localName = "queryOrderResponse", targetNamespace = "http://service.server.itf.module.obh.hoau.com/", className = "com.hoau.hoauapp.si.oms.QueryOrderResponse")
    public com.hoau.hoauapp.si.oms.QueryOrdersResModel queryOrder(
        @WebParam(name = "arg0", targetNamespace = "")
        com.hoau.hoauapp.si.oms.QueryOrdersReqModel arg0
    );
}