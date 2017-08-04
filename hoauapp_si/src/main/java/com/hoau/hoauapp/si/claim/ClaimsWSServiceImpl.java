
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.hoau.hoauapp.si.claim;

import java.util.List;
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
 * 2015-05-05T16:07:20.400+08:00
 * Generated source version: 2.7.11
 * 
 */

@javax.jws.WebService(
                      serviceName = "ClaimsWSServiceImplService",
                      portName = "ClaimsWSServiceImplPort",
                      targetNamespace = "http://hoauapp.ws.erry.com/",
                      wsdlLocation = "http://10.39.251.109/TDHY_CLAIMS/ws-services/claimsWSService?wsdl",
                      endpointInterface = "com.hoau.hoauapp.si.claim.ClaimsWSService")
                      
public class ClaimsWSServiceImpl implements ClaimsWSService {

    private static final Logger LOG = Logger.getLogger(ClaimsWSServiceImpl.class.getName());

    /* (non-Javadoc)
     * @see com.hoau.hoauapp.si.claim.ClaimsWSService#getClaims(java.lang.String  userID )*
     */
    public com.hoau.hoauapp.si.claim.ResponseQueryClaims getClaims(java.lang.String userID) { 
        LOG.info("Executing operation getClaims");
        System.out.println(userID);
        try {
            com.hoau.hoauapp.si.claim.ResponseQueryClaims _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.hoau.hoauapp.si.claim.ClaimsWSService#confirmClaimsAmount(java.lang.String  claimsNo )*
     */
    public com.hoau.hoauapp.si.claim.ResponseClaimsObject confirmClaimsAmount(java.lang.String claimsNo) { 
        LOG.info("Executing operation confirmClaimsAmount");
        System.out.println(claimsNo);
        try {
            com.hoau.hoauapp.si.claim.ResponseClaimsObject _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.hoau.hoauapp.si.claim.ClaimsWSService#findByClaims(java.lang.String  billNo ,)java.lang.String  claimsNo )*
     */
    public com.hoau.hoauapp.si.claim.ResponseQueryFiles findByClaims(java.lang.String billNo,java.lang.String claimsNo) { 
        LOG.info("Executing operation findByClaims");
        System.out.println(billNo);
        System.out.println(claimsNo);
        try {
            com.hoau.hoauapp.si.claim.ResponseQueryFiles _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.hoau.hoauapp.si.claim.ClaimsWSService#uploadClaims(com.hoau.hoauapp.si.claim.ClaimsInfo  claimsInfo )*
     */
    public com.hoau.hoauapp.si.claim.ResponseClaimsObject uploadClaims(com.hoau.hoauapp.si.claim.ClaimsInfo claimsInfo) { 
        LOG.info("Executing operation uploadClaims");
        System.out.println(claimsInfo);
        try {
            com.hoau.hoauapp.si.claim.ResponseClaimsObject _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.hoau.hoauapp.si.claim.ClaimsWSService#queryCheck(com.hoau.hoauapp.si.claim.ReqClaimsObject  reqClaimsObject )*
     */
    public com.hoau.hoauapp.si.claim.ResponseClaimsObject queryCheck(com.hoau.hoauapp.si.claim.ReqClaimsObject reqClaimsObject) { 
        LOG.info("Executing operation queryCheck");
        System.out.println(reqClaimsObject);
        try {
            com.hoau.hoauapp.si.claim.ResponseClaimsObject _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

	/* (non-Javadoc)
	 * @see com.hoau.hoauapp.si.claim.ClaimsWSService#findClaimsDetail(java.lang.String, java.lang.String)
	 */
	public com.hoau.hoauapp.si.claim.ResponseQueryDetail findClaimsDetail(java.lang.String arg0, java.lang.String arg1) {
		 LOG.info("Executing operation findClaimsDetail");
	     try {
	         com.hoau.hoauapp.si.claim.ResponseQueryDetail _return = null;
	         return _return;
	     } catch (java.lang.Exception ex) {
	         ex.printStackTrace();
	         throw new RuntimeException(ex);
	     }
	}

	/* (non-Javadoc)
	 * @see com.hoau.hoauapp.si.claim.ClaimsWSService#findClaimsPlace(java.lang.String, java.lang.String)
	 */
	public java.util.List<com.hoau.hoauapp.si.claim.QueryCorpResult> findClaimsPlace(java.lang.String billNo, java.lang.String billTel) {
		LOG.info("Executing operation findClaimsDetail");
	     try {
	    	 java.util.List<com.hoau.hoauapp.si.claim.QueryCorpResult> _return = null;
	         return _return;
	     } catch (java.lang.Exception ex) {
	         ex.printStackTrace();
	         throw new RuntimeException(ex);
	     }
	}

}