
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.hoau.hoauapp.si.dc.company;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.11
 * 2015-01-15T09:12:56.130+08:00
 * Generated source version: 2.7.11
 * 
 */

@javax.jws.WebService(
                      serviceName = "CompanyServices",
                      portName = "CompanyServicesPort",
                      targetNamespace = "http://www.szzc.com.cn/services/CompanyServices",
                      wsdlLocation = "http://10.39.109.29:8080/services/CompanyServices?wsdl",
                      endpointInterface = "com.hoau.hoauapp.si.dc.company.CompanyServices")
                      
public class CompanyServicesImpl implements CompanyServices {

    private static final Logger LOG = Logger.getLogger(CompanyServicesImpl.class.getName());

    /* (non-Javadoc)
     * @see com.hoau.hoauapp.si.dc.company.CompanyServices#getCompanyData(*
     */
    public com.hoau.hoauapp.si.dc.company.CompanyData getCompanyData() { 
        LOG.info("Executing operation getCompanyData");
        try {
            com.hoau.hoauapp.si.dc.company.CompanyData _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
