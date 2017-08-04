
package com.hoau.hoauapp.si.oms;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.hoau.hoauapp.si.oms package. 
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

    private final static QName _RegisterUserResponse_QNAME = new QName("http://service.server.itf.module.obh.hoau.com/", "registerUserResponse");
    private final static QName _UpdateCacheResponse_QNAME = new QName("http://service.server.itf.module.obh.hoau.com/", "updateCacheResponse");
    private final static QName _QueryOrderDetailResponse_QNAME = new QName("http://service.server.itf.module.obh.hoau.com/", "queryOrderDetailResponse");
    private final static QName _ModifyOrderResponse_QNAME = new QName("http://service.server.itf.module.obh.hoau.com/", "modifyOrderResponse");
    private final static QName _ModifyOrder_QNAME = new QName("http://service.server.itf.module.obh.hoau.com/", "modifyOrder");
    private final static QName _LoginByPhone_QNAME = new QName("http://service.server.itf.module.obh.hoau.com/", "loginByPhone");
    private final static QName _UpdateCache_QNAME = new QName("http://service.server.itf.module.obh.hoau.com/", "updateCache");
    private final static QName _QueryOrderResponse_QNAME = new QName("http://service.server.itf.module.obh.hoau.com/", "queryOrderResponse");
    private final static QName _ResetPwdResponse_QNAME = new QName("http://service.server.itf.module.obh.hoau.com/", "resetPwdResponse");
    private final static QName _QueryOrder_QNAME = new QName("http://service.server.itf.module.obh.hoau.com/", "queryOrder");
    private final static QName _CreateOrderResponse_QNAME = new QName("http://service.server.itf.module.obh.hoau.com/", "createOrderResponse");
    private final static QName _ResetPwd_QNAME = new QName("http://service.server.itf.module.obh.hoau.com/", "resetPwd");
    private final static QName _CreateOrder_QNAME = new QName("http://service.server.itf.module.obh.hoau.com/", "createOrder");
    private final static QName _QueryOrderDetail_QNAME = new QName("http://service.server.itf.module.obh.hoau.com/", "queryOrderDetail");
    private final static QName _LoginByPhoneResponse_QNAME = new QName("http://service.server.itf.module.obh.hoau.com/", "loginByPhoneResponse");
    private final static QName _CancelPhoneOrde_QNAME = new QName("http://service.server.itf.module.obh.hoau.com/", "cancelPhoneOrde");
    private final static QName _RegisterUser_QNAME = new QName("http://service.server.itf.module.obh.hoau.com/", "registerUser");
    private final static QName _CancelPhoneOrdeResponse_QNAME = new QName("http://service.server.itf.module.obh.hoau.com/", "cancelPhoneOrdeResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.hoau.hoauapp.si.oms
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CancelPhoneOrdeResponse }
     * 
     */
    public CancelPhoneOrdeResponse createCancelPhoneOrdeResponse() {
        return new CancelPhoneOrdeResponse();
    }

    /**
     * Create an instance of {@link RegisterUser }
     * 
     */
    public RegisterUser createRegisterUser() {
        return new RegisterUser();
    }

    /**
     * Create an instance of {@link CancelPhoneOrde }
     * 
     */
    public CancelPhoneOrde createCancelPhoneOrde() {
        return new CancelPhoneOrde();
    }

    /**
     * Create an instance of {@link QueryOrderDetail }
     * 
     */
    public QueryOrderDetail createQueryOrderDetail() {
        return new QueryOrderDetail();
    }

    /**
     * Create an instance of {@link LoginByPhoneResponse }
     * 
     */
    public LoginByPhoneResponse createLoginByPhoneResponse() {
        return new LoginByPhoneResponse();
    }

    /**
     * Create an instance of {@link CreateOrder }
     * 
     */
    public CreateOrder createCreateOrder() {
        return new CreateOrder();
    }

    /**
     * Create an instance of {@link CreateOrderResponse }
     * 
     */
    public CreateOrderResponse createCreateOrderResponse() {
        return new CreateOrderResponse();
    }

    /**
     * Create an instance of {@link ResetPwd }
     * 
     */
    public ResetPwd createResetPwd() {
        return new ResetPwd();
    }

    /**
     * Create an instance of {@link ResetPwdResponse }
     * 
     */
    public ResetPwdResponse createResetPwdResponse() {
        return new ResetPwdResponse();
    }

    /**
     * Create an instance of {@link QueryOrder }
     * 
     */
    public QueryOrder createQueryOrder() {
        return new QueryOrder();
    }

    /**
     * Create an instance of {@link UpdateCache }
     * 
     */
    public UpdateCache createUpdateCache() {
        return new UpdateCache();
    }

    /**
     * Create an instance of {@link QueryOrderResponse }
     * 
     */
    public QueryOrderResponse createQueryOrderResponse() {
        return new QueryOrderResponse();
    }

    /**
     * Create an instance of {@link LoginByPhone }
     * 
     */
    public LoginByPhone createLoginByPhone() {
        return new LoginByPhone();
    }

    /**
     * Create an instance of {@link QueryOrderDetailResponse }
     * 
     */
    public QueryOrderDetailResponse createQueryOrderDetailResponse() {
        return new QueryOrderDetailResponse();
    }

    /**
     * Create an instance of {@link ModifyOrder }
     * 
     */
    public ModifyOrder createModifyOrder() {
        return new ModifyOrder();
    }

    /**
     * Create an instance of {@link ModifyOrderResponse }
     * 
     */
    public ModifyOrderResponse createModifyOrderResponse() {
        return new ModifyOrderResponse();
    }

    /**
     * Create an instance of {@link UpdateCacheResponse }
     * 
     */
    public UpdateCacheResponse createUpdateCacheResponse() {
        return new UpdateCacheResponse();
    }

    /**
     * Create an instance of {@link RegisterUserResponse }
     * 
     */
    public RegisterUserResponse createRegisterUserResponse() {
        return new RegisterUserResponse();
    }

    /**
     * Create an instance of {@link CancelOrderReqModel }
     * 
     */
    public CancelOrderReqModel createCancelOrderReqModel() {
        return new CancelOrderReqModel();
    }

    /**
     * Create an instance of {@link RegisterUserResModel }
     * 
     */
    public RegisterUserResModel createRegisterUserResModel() {
        return new RegisterUserResModel();
    }

    /**
     * Create an instance of {@link ResetPwdReqModel }
     * 
     */
    public ResetPwdReqModel createResetPwdReqModel() {
        return new ResetPwdReqModel();
    }

    /**
     * Create an instance of {@link SupportingDataModel }
     * 
     */
    public SupportingDataModel createSupportingDataModel() {
        return new SupportingDataModel();
    }

    /**
     * Create an instance of {@link ResetPwdResModel }
     * 
     */
    public ResetPwdResModel createResetPwdResModel() {
        return new ResetPwdResModel();
    }

    /**
     * Create an instance of {@link QueryOrdersResModel }
     * 
     */
    public QueryOrdersResModel createQueryOrdersResModel() {
        return new QueryOrdersResModel();
    }

    /**
     * Create an instance of {@link LoginUserResModel }
     * 
     */
    public LoginUserResModel createLoginUserResModel() {
        return new LoginUserResModel();
    }

    /**
     * Create an instance of {@link GetPhoneOrderReqModel }
     * 
     */
    public GetPhoneOrderReqModel createGetPhoneOrderReqModel() {
        return new GetPhoneOrderReqModel();
    }

    /**
     * Create an instance of {@link ModifyOrderReqModel }
     * 
     */
    public ModifyOrderReqModel createModifyOrderReqModel() {
        return new ModifyOrderReqModel();
    }

    /**
     * Create an instance of {@link RegisterUserReqModel }
     * 
     */
    public RegisterUserReqModel createRegisterUserReqModel() {
        return new RegisterUserReqModel();
    }

    /**
     * Create an instance of {@link PhoneOrderReqModel }
     * 
     */
    public PhoneOrderReqModel createPhoneOrderReqModel() {
        return new PhoneOrderReqModel();
    }

    /**
     * Create an instance of {@link UpdateCacheResModel }
     * 
     */
    public UpdateCacheResModel createUpdateCacheResModel() {
        return new UpdateCacheResModel();
    }

    /**
     * Create an instance of {@link QueryOrderModel }
     * 
     */
    public QueryOrderModel createQueryOrderModel() {
        return new QueryOrderModel();
    }

    /**
     * Create an instance of {@link GetPhoneOrderResModel }
     * 
     */
    public GetPhoneOrderResModel createGetPhoneOrderResModel() {
        return new GetPhoneOrderResModel();
    }

    /**
     * Create an instance of {@link PhoneOrderResModel }
     * 
     */
    public PhoneOrderResModel createPhoneOrderResModel() {
        return new PhoneOrderResModel();
    }

    /**
     * Create an instance of {@link CancelOrderResModel }
     * 
     */
    public CancelOrderResModel createCancelOrderResModel() {
        return new CancelOrderResModel();
    }

    /**
     * Create an instance of {@link ModifyOrderResModel }
     * 
     */
    public ModifyOrderResModel createModifyOrderResModel() {
        return new ModifyOrderResModel();
    }

    /**
     * Create an instance of {@link LoginUserReqModel }
     * 
     */
    public LoginUserReqModel createLoginUserReqModel() {
        return new LoginUserReqModel();
    }

    /**
     * Create an instance of {@link UpdateCacheReqModel }
     * 
     */
    public UpdateCacheReqModel createUpdateCacheReqModel() {
        return new UpdateCacheReqModel();
    }

    /**
     * Create an instance of {@link QueryOrdersReqModel }
     * 
     */
    public QueryOrdersReqModel createQueryOrdersReqModel() {
        return new QueryOrdersReqModel();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.server.itf.module.obh.hoau.com/", name = "registerUserResponse")
    public JAXBElement<RegisterUserResponse> createRegisterUserResponse(RegisterUserResponse value) {
        return new JAXBElement<RegisterUserResponse>(_RegisterUserResponse_QNAME, RegisterUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCacheResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.server.itf.module.obh.hoau.com/", name = "updateCacheResponse")
    public JAXBElement<UpdateCacheResponse> createUpdateCacheResponse(UpdateCacheResponse value) {
        return new JAXBElement<UpdateCacheResponse>(_UpdateCacheResponse_QNAME, UpdateCacheResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryOrderDetailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.server.itf.module.obh.hoau.com/", name = "queryOrderDetailResponse")
    public JAXBElement<QueryOrderDetailResponse> createQueryOrderDetailResponse(QueryOrderDetailResponse value) {
        return new JAXBElement<QueryOrderDetailResponse>(_QueryOrderDetailResponse_QNAME, QueryOrderDetailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyOrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.server.itf.module.obh.hoau.com/", name = "modifyOrderResponse")
    public JAXBElement<ModifyOrderResponse> createModifyOrderResponse(ModifyOrderResponse value) {
        return new JAXBElement<ModifyOrderResponse>(_ModifyOrderResponse_QNAME, ModifyOrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.server.itf.module.obh.hoau.com/", name = "modifyOrder")
    public JAXBElement<ModifyOrder> createModifyOrder(ModifyOrder value) {
        return new JAXBElement<ModifyOrder>(_ModifyOrder_QNAME, ModifyOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginByPhone }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.server.itf.module.obh.hoau.com/", name = "loginByPhone")
    public JAXBElement<LoginByPhone> createLoginByPhone(LoginByPhone value) {
        return new JAXBElement<LoginByPhone>(_LoginByPhone_QNAME, LoginByPhone.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCache }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.server.itf.module.obh.hoau.com/", name = "updateCache")
    public JAXBElement<UpdateCache> createUpdateCache(UpdateCache value) {
        return new JAXBElement<UpdateCache>(_UpdateCache_QNAME, UpdateCache.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryOrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.server.itf.module.obh.hoau.com/", name = "queryOrderResponse")
    public JAXBElement<QueryOrderResponse> createQueryOrderResponse(QueryOrderResponse value) {
        return new JAXBElement<QueryOrderResponse>(_QueryOrderResponse_QNAME, QueryOrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResetPwdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.server.itf.module.obh.hoau.com/", name = "resetPwdResponse")
    public JAXBElement<ResetPwdResponse> createResetPwdResponse(ResetPwdResponse value) {
        return new JAXBElement<ResetPwdResponse>(_ResetPwdResponse_QNAME, ResetPwdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.server.itf.module.obh.hoau.com/", name = "queryOrder")
    public JAXBElement<QueryOrder> createQueryOrder(QueryOrder value) {
        return new JAXBElement<QueryOrder>(_QueryOrder_QNAME, QueryOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.server.itf.module.obh.hoau.com/", name = "createOrderResponse")
    public JAXBElement<CreateOrderResponse> createCreateOrderResponse(CreateOrderResponse value) {
        return new JAXBElement<CreateOrderResponse>(_CreateOrderResponse_QNAME, CreateOrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResetPwd }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.server.itf.module.obh.hoau.com/", name = "resetPwd")
    public JAXBElement<ResetPwd> createResetPwd(ResetPwd value) {
        return new JAXBElement<ResetPwd>(_ResetPwd_QNAME, ResetPwd.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.server.itf.module.obh.hoau.com/", name = "createOrder")
    public JAXBElement<CreateOrder> createCreateOrder(CreateOrder value) {
        return new JAXBElement<CreateOrder>(_CreateOrder_QNAME, CreateOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryOrderDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.server.itf.module.obh.hoau.com/", name = "queryOrderDetail")
    public JAXBElement<QueryOrderDetail> createQueryOrderDetail(QueryOrderDetail value) {
        return new JAXBElement<QueryOrderDetail>(_QueryOrderDetail_QNAME, QueryOrderDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginByPhoneResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.server.itf.module.obh.hoau.com/", name = "loginByPhoneResponse")
    public JAXBElement<LoginByPhoneResponse> createLoginByPhoneResponse(LoginByPhoneResponse value) {
        return new JAXBElement<LoginByPhoneResponse>(_LoginByPhoneResponse_QNAME, LoginByPhoneResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelPhoneOrde }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.server.itf.module.obh.hoau.com/", name = "cancelPhoneOrde")
    public JAXBElement<CancelPhoneOrde> createCancelPhoneOrde(CancelPhoneOrde value) {
        return new JAXBElement<CancelPhoneOrde>(_CancelPhoneOrde_QNAME, CancelPhoneOrde.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.server.itf.module.obh.hoau.com/", name = "registerUser")
    public JAXBElement<RegisterUser> createRegisterUser(RegisterUser value) {
        return new JAXBElement<RegisterUser>(_RegisterUser_QNAME, RegisterUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelPhoneOrdeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.server.itf.module.obh.hoau.com/", name = "cancelPhoneOrdeResponse")
    public JAXBElement<CancelPhoneOrdeResponse> createCancelPhoneOrdeResponse(CancelPhoneOrdeResponse value) {
        return new JAXBElement<CancelPhoneOrdeResponse>(_CancelPhoneOrdeResponse_QNAME, CancelPhoneOrdeResponse.class, null, value);
    }

}
