
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.hoau.hoauapp.si.dc.couponclipping;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.11
 * 2015-05-21T08:42:14.928+08:00
 * Generated source version: 2.7.11
 * 
 */

@javax.jws.WebService(
                      serviceName = "OuterVocherServices",
                      portName = "OuterVocherServicesPort",
                      targetNamespace = "http://www.hoau.net/services/OuterVocherServices",
                      wsdlLocation = "http://10.39.251.3:8080/hoaunew/services/OuterVocherServices?wsdl",
                      endpointInterface = "com.hoau.hoauapp.si.dc.couponclipping.OuterVocherServices")
                      
public class OuterVocherServicesImpl implements OuterVocherServices {

    private static final Logger LOG = Logger.getLogger(OuterVocherServicesImpl.class.getName());

    /* (non-Javadoc)
     * @see com.hoau.hoauapp.si.dc.couponclipping.OuterVocherServices#getVoucherStatus(java.lang.String  arg0 ,)java.util.List<java.lang.String>  arg1 )*
     */
    public com.hoau.hoauapp.si.dc.couponclipping.GetVoucherStatusRes getVoucherStatus(java.lang.String arg0,java.util.List<java.lang.String> arg1) { 
        LOG.info("Executing operation getVoucherStatus");
        System.out.println(arg0);
        System.out.println(arg1);
        try {
            com.hoau.hoauapp.si.dc.couponclipping.GetVoucherStatusRes _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.hoau.hoauapp.si.dc.couponclipping.OuterVocherServices#getNewVoucher(java.lang.String  arg0 ,)int  arg1 )*
     */
    public com.hoau.hoauapp.si.dc.couponclipping.VoucherInfo getNewVoucher(java.lang.String arg0,int arg1) { 
        LOG.info("Executing operation getNewVoucher");
        System.out.println(arg0);
        System.out.println(arg1);
        try {
            com.hoau.hoauapp.si.dc.couponclipping.VoucherInfo _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.hoau.hoauapp.si.dc.couponclipping.OuterVocherServices#getUsedVouchers(java.lang.String  arg0 ,)java.lang.String  arg1 ,)java.lang.String  arg2 )*
     */
    public java.util.List<java.lang.String> getUsedVouchers(java.lang.String arg0,java.lang.String arg1,java.lang.String arg2) { 
        LOG.info("Executing operation getUsedVouchers");
        System.out.println(arg0);
        System.out.println(arg1);
        System.out.println(arg2);
        try {
            java.util.List<java.lang.String> _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
