package com.hoau.hoauapp.si.dc.company;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.11
 * 2015-01-15T09:12:56.140+08:00
 * Generated source version: 2.7.11
 * 
 */
@WebService(targetNamespace = "http://www.szzc.com.cn/services/CompanyServices", name = "CompanyServices")
@XmlSeeAlso({ObjectFactory.class})
public interface CompanyServices {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getCompanyData", targetNamespace = "http://www.szzc.com.cn/services/CompanyServices", className = "com.hoau.hoauapp.si.dc.company.GetCompanyData")
    @WebMethod
    @ResponseWrapper(localName = "getCompanyDataResponse", targetNamespace = "http://www.szzc.com.cn/services/CompanyServices", className = "com.hoau.hoauapp.si.dc.company.GetCompanyDataResponse")
    public com.hoau.hoauapp.si.dc.company.CompanyData getCompanyData();
}
