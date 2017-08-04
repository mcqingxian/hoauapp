
package com.hoau.hoauapp.si.ttq;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>FoxPriceParamModel complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="FoxPriceParamModel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="clientID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="conCityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="conCountyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="conProvince" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="insurancePrice" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="shepperProvince" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shipperCityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shipperCountyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transportType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="volume" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FoxPriceParamModel", namespace = "http://params.foxconn.interfaces.sinotrans.com", propOrder = {
    "clientID",
    "conCityName",
    "conCountyName",
    "conProvince",
    "insurancePrice",
    "shepperProvince",
    "shipperCityName",
    "shipperCountyName",
    "transportType",
    "volume",
    "weight"
})
public class FoxPriceParamModel {

    @XmlElementRef(name = "clientID", namespace = "http://params.foxconn.interfaces.sinotrans.com", type = JAXBElement.class)
    protected JAXBElement<String> clientID;
    @XmlElementRef(name = "conCityName", namespace = "http://params.foxconn.interfaces.sinotrans.com", type = JAXBElement.class)
    protected JAXBElement<String> conCityName;
    @XmlElementRef(name = "conCountyName", namespace = "http://params.foxconn.interfaces.sinotrans.com", type = JAXBElement.class)
    protected JAXBElement<String> conCountyName;
    @XmlElementRef(name = "conProvince", namespace = "http://params.foxconn.interfaces.sinotrans.com", type = JAXBElement.class)
    protected JAXBElement<String> conProvince;
    protected Integer insurancePrice;
    @XmlElementRef(name = "shepperProvince", namespace = "http://params.foxconn.interfaces.sinotrans.com", type = JAXBElement.class)
    protected JAXBElement<String> shepperProvince;
    @XmlElementRef(name = "shipperCityName", namespace = "http://params.foxconn.interfaces.sinotrans.com", type = JAXBElement.class)
    protected JAXBElement<String> shipperCityName;
    @XmlElementRef(name = "shipperCountyName", namespace = "http://params.foxconn.interfaces.sinotrans.com", type = JAXBElement.class)
    protected JAXBElement<String> shipperCountyName;
    @XmlElementRef(name = "transportType", namespace = "http://params.foxconn.interfaces.sinotrans.com", type = JAXBElement.class)
    protected JAXBElement<String> transportType;
    protected Double volume;
    protected Double weight;

    /**
     * ��ȡclientID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClientID() {
        return clientID;
    }

    /**
     * ����clientID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClientID(JAXBElement<String> value) {
        this.clientID = value;
    }

    /**
     * ��ȡconCityName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConCityName() {
        return conCityName;
    }

    /**
     * ����conCityName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConCityName(JAXBElement<String> value) {
        this.conCityName = value;
    }

    /**
     * ��ȡconCountyName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConCountyName() {
        return conCountyName;
    }

    /**
     * ����conCountyName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConCountyName(JAXBElement<String> value) {
        this.conCountyName = value;
    }

    /**
     * ��ȡconProvince���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConProvince() {
        return conProvince;
    }

    /**
     * ����conProvince���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConProvince(JAXBElement<String> value) {
        this.conProvince = value;
    }

    /**
     * ��ȡinsurancePrice���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInsurancePrice() {
        return insurancePrice;
    }

    /**
     * ����insurancePrice���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInsurancePrice(Integer value) {
        this.insurancePrice = value;
    }

    /**
     * ��ȡshepperProvince���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShepperProvince() {
        return shepperProvince;
    }

    /**
     * ����shepperProvince���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShepperProvince(JAXBElement<String> value) {
        this.shepperProvince = value;
    }

    /**
     * ��ȡshipperCityName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShipperCityName() {
        return shipperCityName;
    }

    /**
     * ����shipperCityName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShipperCityName(JAXBElement<String> value) {
        this.shipperCityName = value;
    }

    /**
     * ��ȡshipperCountyName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShipperCountyName() {
        return shipperCountyName;
    }

    /**
     * ����shipperCountyName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShipperCountyName(JAXBElement<String> value) {
        this.shipperCountyName = value;
    }

    /**
     * ��ȡtransportType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTransportType() {
        return transportType;
    }

    /**
     * ����transportType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTransportType(JAXBElement<String> value) {
        this.transportType = value;
    }

    /**
     * ��ȡvolume���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVolume() {
        return volume;
    }

    /**
     * ����volume���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVolume(Double value) {
        this.volume = value;
    }

    /**
     * ��ȡweight���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWeight() {
        return weight;
    }

    /**
     * ����weight���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWeight(Double value) {
        this.weight = value;
    }

}
