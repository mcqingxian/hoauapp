
package com.hoau.hoauapp.si.ol;

import javax.xml.ws.Endpoint;

/**
 * This class was generated by Apache CXF 2.7.14
 * 2015-10-29T15:52:16.566+08:00
 * Generated source version: 2.7.14
 * 
 */
 
public class DistrictServicePortType_DistrictServiceHttpPort_Server{

    protected DistrictServicePortType_DistrictServiceHttpPort_Server() throws java.lang.Exception {
        System.out.println("Starting Server");
        Object implementor = new DistrictServicePortTypeImpl();
        String address = "http://online.hoau.net/obh-web/services/DistrictService?wsdl";
        Endpoint.publish(address, implementor);
    }
    
    public static void main(String args[]) throws java.lang.Exception { 
        new DistrictServicePortType_DistrictServiceHttpPort_Server();
        System.out.println("Server ready..."); 
        
        Thread.sleep(5 * 60 * 1000); 
        System.out.println("Server exiting");
        System.exit(0);
    }
}
