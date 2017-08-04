
package com.hoau.hoauapp.si.ttq;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>FoxOrderModel complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="FoxOrderModel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="foxCargoname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="foxCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="foxId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="foxPackageService" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="foxReceiverAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="foxReceiverCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="foxReceiverCompanyname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="foxReceiverCounty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="foxReceiverMobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="foxReceiverName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="foxReceiverProvince" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="foxSenderAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="foxSenderCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="foxSenderCompanyname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="foxSenderCounty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="foxSenderMobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="foxSenderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="foxSenderProvince" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="foxTotalNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="foxTotalVolume" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="foxTotalWeight" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="foxTransportType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FoxOrderModel", namespace = "http://params.foxconn.interfaces.sinotrans.com", propOrder = {
    "foxCargoname",
    "foxCode",
    "foxId",
    "foxPackageService",
    "foxReceiverAddress",
    "foxReceiverCity",
    "foxReceiverCompanyname",
    "foxReceiverCounty",
    "foxReceiverMobile",
    "foxReceiverName",
    "foxReceiverProvince",
    "foxSenderAddress",
    "foxSenderCity",
    "foxSenderCompanyname",
    "foxSenderCounty",
    "foxSenderMobile",
    "foxSenderName",
    "foxSenderProvince",
    "foxTotalNumber",
    "foxTotalVolume",
    "foxTotalWeight",
    "foxTransportType"
})
public class FoxOrderModel {

    @XmlElementRef(name = "foxCargoname", namespace = "http://params.foxconn.interfaces.sinotrans.com", type = JAXBElement.class)
    protected JAXBElement<String> foxCargoname;
    @XmlElementRef(name = "foxCode", namespace = "http://params.foxconn.interfaces.sinotrans.com", type = JAXBElement.class)
    protected JAXBElement<String> foxCode;
    @XmlElementRef(name = "foxId", namespace = "http://params.foxconn.interfaces.sinotrans.com", type = JAXBElement.class)
    protected JAXBElement<String> foxId;
    @XmlElementRef(name = "foxPackageService", namespace = "http://params.foxconn.interfaces.sinotrans.com", type = JAXBElement.class)
    protected JAXBElement<String> foxPackageService;
    @XmlElementRef(name = "foxReceiverAddress", namespace = "http://params.foxconn.interfaces.sinotrans.com", type = JAXBElement.class)
    protected JAXBElement<String> foxReceiverAddress;
    @XmlElementRef(name = "foxReceiverCity", namespace = "http://params.foxconn.interfaces.sinotrans.com", type = JAXBElement.class)
    protected JAXBElement<String> foxReceiverCity;
    @XmlElementRef(name = "foxReceiverCompanyname", namespace = "http://params.foxconn.interfaces.sinotrans.com", type = JAXBElement.class)
    protected JAXBElement<String> foxReceiverCompanyname;
    @XmlElementRef(name = "foxReceiverCounty", namespace = "http://params.foxconn.interfaces.sinotrans.com", type = JAXBElement.class)
    protected JAXBElement<String> foxReceiverCounty;
    @XmlElementRef(name = "foxReceiverMobile", namespace = "http://params.foxconn.interfaces.sinotrans.com", type = JAXBElement.class)
    protected JAXBElement<String> foxReceiverMobile;
    @XmlElementRef(name = "foxReceiverName", namespace = "http://params.foxconn.interfaces.sinotrans.com", type = JAXBElement.class)
    protected JAXBElement<String> foxReceiverName;
    @XmlElementRef(name = "foxReceiverProvince", namespace = "http://params.foxconn.interfaces.sinotrans.com", type = JAXBElement.class)
    protected JAXBElement<String> foxReceiverProvince;
    @XmlElementRef(name = "foxSenderAddress", namespace = "http://params.foxconn.interfaces.sinotrans.com", type = JAXBElement.class)
    protected JAXBElement<String> foxSenderAddress;
    @XmlElementRef(name = "foxSenderCity", namespace = "http://params.foxconn.interfaces.sinotrans.com", type = JAXBElement.class)
    protected JAXBElement<String> foxSenderCity;
    @XmlElementRef(name = "foxSenderCompanyname", namespace = "http://params.foxconn.interfaces.sinotrans.com", type = JAXBElement.class)
    protected JAXBElement<String> foxSenderCompanyname;
    @XmlElementRef(name = "foxSenderCounty", namespace = "http://params.foxconn.interfaces.sinotrans.com", type = JAXBElement.class)
    protected JAXBElement<String> foxSenderCounty;
    @XmlElementRef(name = "foxSenderMobile", namespace = "http://params.foxconn.interfaces.sinotrans.com", type = JAXBElement.class)
    protected JAXBElement<String> foxSenderMobile;
    @XmlElementRef(name = "foxSenderName", namespace = "http://params.foxconn.interfaces.sinotrans.com", type = JAXBElement.class)
    protected JAXBElement<String> foxSenderName;
    @XmlElementRef(name = "foxSenderProvince", namespace = "http://params.foxconn.interfaces.sinotrans.com", type = JAXBElement.class)
    protected JAXBElement<String> foxSenderProvince;
    @XmlElementRef(name = "foxTotalNumber", namespace = "http://params.foxconn.interfaces.sinotrans.com", type = JAXBElement.class)
    protected JAXBElement<Integer> foxTotalNumber;
    @XmlElementRef(name = "foxTotalVolume", namespace = "http://params.foxconn.interfaces.sinotrans.com", type = JAXBElement.class)
    protected JAXBElement<Double> foxTotalVolume;
    @XmlElementRef(name = "foxTotalWeight", namespace = "http://params.foxconn.interfaces.sinotrans.com", type = JAXBElement.class)
    protected JAXBElement<Double> foxTotalWeight;
    @XmlElementRef(name = "foxTransportType", namespace = "http://params.foxconn.interfaces.sinotrans.com", type = JAXBElement.class)
    protected JAXBElement<String> foxTransportType;

    /**
     * 获取foxCargoname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFoxCargoname() {
        return foxCargoname;
    }

    /**
     * 设置foxCargoname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFoxCargoname(JAXBElement<String> value) {
        this.foxCargoname = value;
    }

    /**
     * 获取foxCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFoxCode() {
        return foxCode;
    }

    /**
     * 设置foxCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFoxCode(JAXBElement<String> value) {
        this.foxCode = value;
    }

    /**
     * 获取foxId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFoxId() {
        return foxId;
    }

    /**
     * 设置foxId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFoxId(JAXBElement<String> value) {
        this.foxId = value;
    }

    /**
     * 获取foxPackageService属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFoxPackageService() {
        return foxPackageService;
    }

    /**
     * 设置foxPackageService属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFoxPackageService(JAXBElement<String> value) {
        this.foxPackageService = value;
    }

    /**
     * 获取foxReceiverAddress属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFoxReceiverAddress() {
        return foxReceiverAddress;
    }

    /**
     * 设置foxReceiverAddress属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFoxReceiverAddress(JAXBElement<String> value) {
        this.foxReceiverAddress = value;
    }

    /**
     * 获取foxReceiverCity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFoxReceiverCity() {
        return foxReceiverCity;
    }

    /**
     * 设置foxReceiverCity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFoxReceiverCity(JAXBElement<String> value) {
        this.foxReceiverCity = value;
    }

    /**
     * 获取foxReceiverCompanyname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFoxReceiverCompanyname() {
        return foxReceiverCompanyname;
    }

    /**
     * 设置foxReceiverCompanyname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFoxReceiverCompanyname(JAXBElement<String> value) {
        this.foxReceiverCompanyname = value;
    }

    /**
     * 获取foxReceiverCounty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFoxReceiverCounty() {
        return foxReceiverCounty;
    }

    /**
     * 设置foxReceiverCounty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFoxReceiverCounty(JAXBElement<String> value) {
        this.foxReceiverCounty = value;
    }

    /**
     * 获取foxReceiverMobile属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFoxReceiverMobile() {
        return foxReceiverMobile;
    }

    /**
     * 设置foxReceiverMobile属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFoxReceiverMobile(JAXBElement<String> value) {
        this.foxReceiverMobile = value;
    }

    /**
     * 获取foxReceiverName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFoxReceiverName() {
        return foxReceiverName;
    }

    /**
     * 设置foxReceiverName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFoxReceiverName(JAXBElement<String> value) {
        this.foxReceiverName = value;
    }

    /**
     * 获取foxReceiverProvince属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFoxReceiverProvince() {
        return foxReceiverProvince;
    }

    /**
     * 设置foxReceiverProvince属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFoxReceiverProvince(JAXBElement<String> value) {
        this.foxReceiverProvince = value;
    }

    /**
     * 获取foxSenderAddress属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFoxSenderAddress() {
        return foxSenderAddress;
    }

    /**
     * 设置foxSenderAddress属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFoxSenderAddress(JAXBElement<String> value) {
        this.foxSenderAddress = value;
    }

    /**
     * 获取foxSenderCity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFoxSenderCity() {
        return foxSenderCity;
    }

    /**
     * 设置foxSenderCity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFoxSenderCity(JAXBElement<String> value) {
        this.foxSenderCity = value;
    }

    /**
     * 获取foxSenderCompanyname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFoxSenderCompanyname() {
        return foxSenderCompanyname;
    }

    /**
     * 设置foxSenderCompanyname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFoxSenderCompanyname(JAXBElement<String> value) {
        this.foxSenderCompanyname = value;
    }

    /**
     * 获取foxSenderCounty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFoxSenderCounty() {
        return foxSenderCounty;
    }

    /**
     * 设置foxSenderCounty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFoxSenderCounty(JAXBElement<String> value) {
        this.foxSenderCounty = value;
    }

    /**
     * 获取foxSenderMobile属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFoxSenderMobile() {
        return foxSenderMobile;
    }

    /**
     * 设置foxSenderMobile属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFoxSenderMobile(JAXBElement<String> value) {
        this.foxSenderMobile = value;
    }

    /**
     * 获取foxSenderName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFoxSenderName() {
        return foxSenderName;
    }

    /**
     * 设置foxSenderName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFoxSenderName(JAXBElement<String> value) {
        this.foxSenderName = value;
    }

    /**
     * 获取foxSenderProvince属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFoxSenderProvince() {
        return foxSenderProvince;
    }

    /**
     * 设置foxSenderProvince属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFoxSenderProvince(JAXBElement<String> value) {
        this.foxSenderProvince = value;
    }

    /**
     * 获取foxTotalNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getFoxTotalNumber() {
        return foxTotalNumber;
    }

    /**
     * 设置foxTotalNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setFoxTotalNumber(JAXBElement<Integer> value) {
        this.foxTotalNumber = value;
    }

    /**
     * 获取foxTotalVolume属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getFoxTotalVolume() {
        return foxTotalVolume;
    }

    /**
     * 设置foxTotalVolume属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setFoxTotalVolume(JAXBElement<Double> value) {
        this.foxTotalVolume = value;
    }

    /**
     * 获取foxTotalWeight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getFoxTotalWeight() {
        return foxTotalWeight;
    }

    /**
     * 设置foxTotalWeight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setFoxTotalWeight(JAXBElement<Double> value) {
        this.foxTotalWeight = value;
    }

    /**
     * 获取foxTransportType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFoxTransportType() {
        return foxTransportType;
    }

    /**
     * 设置foxTransportType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFoxTransportType(JAXBElement<String> value) {
        this.foxTransportType = value;
    }

}
