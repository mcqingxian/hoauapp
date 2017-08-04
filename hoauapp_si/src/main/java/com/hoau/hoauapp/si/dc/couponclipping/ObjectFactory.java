
package com.hoau.hoauapp.si.dc.couponclipping;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.hoau.hoauapp.si.dc.couponclipping package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetNewVoucher_QNAME = new QName("http://www.hoau.net/services/OuterVocherServices", "getNewVoucher");
    private final static QName _GetNewVoucherResponse_QNAME = new QName("http://www.hoau.net/services/OuterVocherServices", "getNewVoucherResponse");
    private final static QName _GetUsedVouchersResponse_QNAME = new QName("http://www.hoau.net/services/OuterVocherServices", "getUsedVouchersResponse");
    private final static QName _GetVoucherStatusResponse_QNAME = new QName("http://www.hoau.net/services/OuterVocherServices", "getVoucherStatusResponse");
    private final static QName _GetVoucherStatus_QNAME = new QName("http://www.hoau.net/services/OuterVocherServices", "getVoucherStatus");
    private final static QName _GetUsedVouchers_QNAME = new QName("http://www.hoau.net/services/OuterVocherServices", "getUsedVouchers");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.hoau.hoauapp.si.dc.couponclipping
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetVoucherStatusResponse }
     * 
     */
    public GetVoucherStatusResponse createGetVoucherStatusResponse() {
        return new GetVoucherStatusResponse();
    }

    /**
     * Create an instance of {@link GetUsedVouchersResponse }
     * 
     */
    public GetUsedVouchersResponse createGetUsedVouchersResponse() {
        return new GetUsedVouchersResponse();
    }

    /**
     * Create an instance of {@link GetNewVoucherResponse }
     * 
     */
    public GetNewVoucherResponse createGetNewVoucherResponse() {
        return new GetNewVoucherResponse();
    }

    /**
     * Create an instance of {@link GetNewVoucher }
     * 
     */
    public GetNewVoucher createGetNewVoucher() {
        return new GetNewVoucher();
    }

    /**
     * Create an instance of {@link GetUsedVouchers }
     * 
     */
    public GetUsedVouchers createGetUsedVouchers() {
        return new GetUsedVouchers();
    }

    /**
     * Create an instance of {@link GetVoucherStatus }
     * 
     */
    public GetVoucherStatus createGetVoucherStatus() {
        return new GetVoucherStatus();
    }

    /**
     * Create an instance of {@link GetVoucherStatusRes }
     * 
     */
    public GetVoucherStatusRes createGetVoucherStatusRes() {
        return new GetVoucherStatusRes();
    }

    /**
     * Create an instance of {@link ResBaseVo }
     * 
     */
    public ResBaseVo createResBaseVo() {
        return new ResBaseVo();
    }

    /**
     * Create an instance of {@link VoucherInfo }
     * 
     */
    public VoucherInfo createVoucherInfo() {
        return new VoucherInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNewVoucher }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hoau.net/services/OuterVocherServices", name = "getNewVoucher")
    public JAXBElement<GetNewVoucher> createGetNewVoucher(GetNewVoucher value) {
        return new JAXBElement<GetNewVoucher>(_GetNewVoucher_QNAME, GetNewVoucher.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNewVoucherResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hoau.net/services/OuterVocherServices", name = "getNewVoucherResponse")
    public JAXBElement<GetNewVoucherResponse> createGetNewVoucherResponse(GetNewVoucherResponse value) {
        return new JAXBElement<GetNewVoucherResponse>(_GetNewVoucherResponse_QNAME, GetNewVoucherResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsedVouchersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hoau.net/services/OuterVocherServices", name = "getUsedVouchersResponse")
    public JAXBElement<GetUsedVouchersResponse> createGetUsedVouchersResponse(GetUsedVouchersResponse value) {
        return new JAXBElement<GetUsedVouchersResponse>(_GetUsedVouchersResponse_QNAME, GetUsedVouchersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVoucherStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hoau.net/services/OuterVocherServices", name = "getVoucherStatusResponse")
    public JAXBElement<GetVoucherStatusResponse> createGetVoucherStatusResponse(GetVoucherStatusResponse value) {
        return new JAXBElement<GetVoucherStatusResponse>(_GetVoucherStatusResponse_QNAME, GetVoucherStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVoucherStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hoau.net/services/OuterVocherServices", name = "getVoucherStatus")
    public JAXBElement<GetVoucherStatus> createGetVoucherStatus(GetVoucherStatus value) {
        return new JAXBElement<GetVoucherStatus>(_GetVoucherStatus_QNAME, GetVoucherStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsedVouchers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hoau.net/services/OuterVocherServices", name = "getUsedVouchers")
    public JAXBElement<GetUsedVouchers> createGetUsedVouchers(GetUsedVouchers value) {
        return new JAXBElement<GetUsedVouchers>(_GetUsedVouchers_QNAME, GetUsedVouchers.class, null, value);
    }

}
