
package com.hoau.hoauapp.si.ttq;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>FoxTraceResult complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�����ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="FoxTraceResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="foxTraceInfos" type="{http://result.foxconn.interfaces.sinotrans.com}ArrayOfFoxTraceInfo" minOccurs="0"/&gt;
 *         &lt;element name="pickComCustomerCare" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pickCompanyAddr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pickCompanyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pickCompanyTel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FoxTraceResult", namespace = "http://result.foxconn.interfaces.sinotrans.com", propOrder = {
    "foxTraceInfos",
    "pickComCustomerCare",
    "pickCompanyAddr",
    "pickCompanyName",
    "pickCompanyTel"
})
public class FoxTraceResult {

    @XmlElementRef(name = "foxTraceInfos", namespace = "http://result.foxconn.interfaces.sinotrans.com", type = JAXBElement.class)
    protected JAXBElement<ArrayOfFoxTraceInfo> foxTraceInfos;
    @XmlElementRef(name = "pickComCustomerCare", namespace = "http://result.foxconn.interfaces.sinotrans.com", type = JAXBElement.class)
    protected JAXBElement<String> pickComCustomerCare;
    @XmlElementRef(name = "pickCompanyAddr", namespace = "http://result.foxconn.interfaces.sinotrans.com", type = JAXBElement.class)
    protected JAXBElement<String> pickCompanyAddr;
    @XmlElementRef(name = "pickCompanyName", namespace = "http://result.foxconn.interfaces.sinotrans.com", type = JAXBElement.class)
    protected JAXBElement<String> pickCompanyName;
    @XmlElementRef(name = "pickCompanyTel", namespace = "http://result.foxconn.interfaces.sinotrans.com", type = JAXBElement.class)
    protected JAXBElement<String> pickCompanyTel;

    /**
     * ��ȡfoxTraceInfos���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFoxTraceInfo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfFoxTraceInfo> getFoxTraceInfos() {
        return foxTraceInfos;
    }

    /**
     * ����foxTraceInfos���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFoxTraceInfo }{@code >}
     *     
     */
    public void setFoxTraceInfos(JAXBElement<ArrayOfFoxTraceInfo> value) {
        this.foxTraceInfos = value;
    }

    /**
     * ��ȡpickComCustomerCare���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPickComCustomerCare() {
        return pickComCustomerCare;
    }

    /**
     * ����pickComCustomerCare���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPickComCustomerCare(JAXBElement<String> value) {
        this.pickComCustomerCare = value;
    }

    /**
     * ��ȡpickCompanyAddr���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPickCompanyAddr() {
        return pickCompanyAddr;
    }

    /**
     * ����pickCompanyAddr���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPickCompanyAddr(JAXBElement<String> value) {
        this.pickCompanyAddr = value;
    }

    /**
     * ��ȡpickCompanyName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPickCompanyName() {
        return pickCompanyName;
    }

    /**
     * ����pickCompanyName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPickCompanyName(JAXBElement<String> value) {
        this.pickCompanyName = value;
    }

    /**
     * ��ȡpickCompanyTel���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPickCompanyTel() {
        return pickCompanyTel;
    }

    /**
     * ����pickCompanyTel���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPickCompanyTel(JAXBElement<String> value) {
        this.pickCompanyTel = value;
    }

}
