
package com.hoau.hoauapp.si.dc.sendme;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.11
 * 2015-06-16T15:49:23.585+08:00
 * Generated source version: 2.7.11
 * 
 */
public final class AppWaybillServices_AppWaybillServicesPort_Client {

    private static final QName SERVICE_NAME = new QName("http://www.hoau.net/services/AppWaybillServices", "AppWaybillServices");

    private AppWaybillServices_AppWaybillServicesPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = AppWaybillServices_Service.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        AppWaybillServices_Service ss = new AppWaybillServices_Service(wsdlURL, SERVICE_NAME);
        AppWaybillServices port = ss.getAppWaybillServicesPort();  
        
        {
        System.out.println("Invoking queryWBlist...");
        java.lang.String _queryWBlist_registerPhone = "";
        com.hoau.hoauapp.si.dc.sendme.WaybillInfoVector _queryWBlist__return = port.queryWBlist(_queryWBlist_registerPhone);
        System.out.println("queryWBlist.result=" + _queryWBlist__return);


        }
        {
        System.out.println("Invoking queryWayBill...");
        java.lang.String _queryWayBill_arg0 = "";
        java.lang.String _queryWayBill_arg1 = "";
        com.hoau.hoauapp.si.dc.sendme.WaybillInfo _queryWayBill__return = port.queryWayBill(_queryWayBill_arg0, _queryWayBill_arg1);
        System.out.println("queryWayBill.result=" + _queryWayBill__return);


        }

        System.exit(0);
    }

}
