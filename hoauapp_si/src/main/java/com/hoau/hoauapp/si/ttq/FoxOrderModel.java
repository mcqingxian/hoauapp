
package com.hoau.hoauapp.si.ttq;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>FoxOrderModel complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡfoxCargoname���Ե�ֵ��
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
     * ����foxCargoname���Ե�ֵ��
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
     * ��ȡfoxCode���Ե�ֵ��
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
     * ����foxCode���Ե�ֵ��
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
     * ��ȡfoxId���Ե�ֵ��
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
     * ����foxId���Ե�ֵ��
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
     * ��ȡfoxPackageService���Ե�ֵ��
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
     * ����foxPackageService���Ե�ֵ��
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
     * ��ȡfoxReceiverAddress���Ե�ֵ��
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
     * ����foxReceiverAddress���Ե�ֵ��
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
     * ��ȡfoxReceiverCity���Ե�ֵ��
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
     * ����foxReceiverCity���Ե�ֵ��
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
     * ��ȡfoxReceiverCompanyname���Ե�ֵ��
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
     * ����foxReceiverCompanyname���Ե�ֵ��
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
     * ��ȡfoxReceiverCounty���Ե�ֵ��
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
     * ����foxReceiverCounty���Ե�ֵ��
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
     * ��ȡfoxReceiverMobile���Ե�ֵ��
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
     * ����foxReceiverMobile���Ե�ֵ��
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
     * ��ȡfoxReceiverName���Ե�ֵ��
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
     * ����foxReceiverName���Ե�ֵ��
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
     * ��ȡfoxReceiverProvince���Ե�ֵ��
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
     * ����foxReceiverProvince���Ե�ֵ��
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
     * ��ȡfoxSenderAddress���Ե�ֵ��
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
     * ����foxSenderAddress���Ե�ֵ��
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
     * ��ȡfoxSenderCity���Ե�ֵ��
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
     * ����foxSenderCity���Ե�ֵ��
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
     * ��ȡfoxSenderCompanyname���Ե�ֵ��
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
     * ����foxSenderCompanyname���Ե�ֵ��
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
     * ��ȡfoxSenderCounty���Ե�ֵ��
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
     * ����foxSenderCounty���Ե�ֵ��
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
     * ��ȡfoxSenderMobile���Ե�ֵ��
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
     * ����foxSenderMobile���Ե�ֵ��
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
     * ��ȡfoxSenderName���Ե�ֵ��
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
     * ����foxSenderName���Ե�ֵ��
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
     * ��ȡfoxSenderProvince���Ե�ֵ��
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
     * ����foxSenderProvince���Ե�ֵ��
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
     * ��ȡfoxTotalNumber���Ե�ֵ��
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
     * ����foxTotalNumber���Ե�ֵ��
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
     * ��ȡfoxTotalVolume���Ե�ֵ��
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
     * ����foxTotalVolume���Ե�ֵ��
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
     * ��ȡfoxTotalWeight���Ե�ֵ��
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
     * ����foxTotalWeight���Ե�ֵ��
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
     * ��ȡfoxTransportType���Ե�ֵ��
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
     * ����foxTransportType���Ե�ֵ��
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
