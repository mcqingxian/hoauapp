
package com.hoau.hoauapp.si.dc.couponclipping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getVoucherStatusResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="getVoucherStatusResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://www.hoau.net/services/OuterVocherServices}getVoucherStatusRes" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getVoucherStatusResponse", propOrder = {
    "_return"
})
public class GetVoucherStatusResponse {

    @XmlElement(name = "return")
    protected GetVoucherStatusRes _return;

    /**
     * 获取return属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GetVoucherStatusRes }
     *     
     */
    public GetVoucherStatusRes getReturn() {
        return _return;
    }

    /**
     * 设置return属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GetVoucherStatusRes }
     *     
     */
    public void setReturn(GetVoucherStatusRes value) {
        this._return = value;
    }

}
