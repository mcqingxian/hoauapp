
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.hoau.hoauapp.si.bank;

import java.util.logging.Logger;
/**
 * This class was generated by Apache CXF 3.1.6
 * 2016-06-03T16:09:08.903+08:00
 * Generated source version: 3.1.6
 * 
 */

@javax.jws.WebService(
                      serviceName = "BaseAccountInfoServices",
                      portName = "BaseAccountInfoServicesPort",
                      targetNamespace = "http://10.39.251.150:8080/services/BaseAccountInfoServices",
                      wsdlLocation = "http://10.39.109.29:8080/services/BaseAccountInfoServices?wsdl",
                      endpointInterface = "com.hoau.hoauapp.si.bank.BaseAccountInfoServices")
                      
public class BaseAccountInfoServicesPortImpl implements BaseAccountInfoServices {

    private static final Logger LOG = Logger.getLogger(BaseAccountInfoServicesPortImpl.class.getName());

    /* (non-Javadoc)
     * @see com.hoau.hoauapp.si.bank.BaseAccountInfoServices#getAccountCityList(java.lang.String  arg0 )*
     */
    public java.util.List<com.hoau.hoauapp.si.bank.AccountCity> getAccountCityList(java.lang.String arg0) { 
        LOG.info("Executing operation getAccountCityList");
        System.out.println(arg0);
        try {
            java.util.List<com.hoau.hoauapp.si.bank.AccountCity> _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.hoau.hoauapp.si.bank.BaseAccountInfoServices#getAccountProvinceList(java.lang.String  arg0 )*
     */
    public java.util.List<com.hoau.hoauapp.si.bank.AccountProvince> getAccountProvinceList(java.lang.String arg0) { 
        LOG.info("Executing operation getAccountProvinceList");
        System.out.println(arg0);
        try {
            java.util.List<com.hoau.hoauapp.si.bank.AccountProvince> _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.hoau.hoauapp.si.bank.BaseAccountInfoServices#getAccountBankInfoList(java.lang.String  arg0 )*
     */
    public java.util.List<com.hoau.hoauapp.si.bank.AccountBankInfo> getAccountBankInfoList(java.lang.String arg0) { 
        LOG.info("Executing operation getAccountBankInfoList");
        System.out.println(arg0);
        try {
            java.util.List<com.hoau.hoauapp.si.bank.AccountBankInfo> _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
