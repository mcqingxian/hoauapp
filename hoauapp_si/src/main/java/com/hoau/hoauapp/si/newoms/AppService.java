package com.hoau.hoauapp.si.newoms;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.14
 * 2015-12-08T11:16:51.509+08:00
 * Generated source version: 2.7.14
 * 
 */
@WebService(targetNamespace = "http://service.server.itf.module.obh.hoau.com/", name = "AppService")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface AppService {

    @WebResult(name = "return", targetNamespace = "http://service.server.itf.module.obh.hoau.com/", partName = "return")
    @WebMethod
    public ResetPwdResModel resetPwd(
        @WebParam(partName = "arg0", name = "arg0")
        ResetPwdReqModel arg0
    );

    @WebResult(name = "return", targetNamespace = "http://service.server.itf.module.obh.hoau.com/", partName = "return")
    @WebMethod
    public PhoneOrderResModel createOrder(
        @WebParam(partName = "arg0", name = "arg0")
        OrderModel arg0
    );

    @WebResult(name = "return", targetNamespace = "http://service.server.itf.module.obh.hoau.com/", partName = "return")
    @WebMethod
    public ModifyOrderResModel modifyOrder(
        @WebParam(partName = "arg0", name = "arg0")
        OrderModel arg0
    );

    @WebResult(name = "return", targetNamespace = "http://service.server.itf.module.obh.hoau.com/", partName = "return")
    @WebMethod
    public QueryAppOrdersResModel queryOrder(
        @WebParam(partName = "arg0", name = "arg0")
        QueryOrdersReqModel arg0
    );

    @WebResult(name = "return", targetNamespace = "http://service.server.itf.module.obh.hoau.com/", partName = "return")
    @WebMethod
    public QueryUserResModel queryUserInfo(
        @WebParam(partName = "arg0", name = "arg0")
        java.lang.String arg0
    );
}
