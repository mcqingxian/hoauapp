
package com.hoau.hoauapp.si.oms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>loginByPhoneResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="loginByPhoneResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://service.server.itf.module.obh.hoau.com/}loginUserResModel" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loginByPhoneResponse", propOrder = {
    "_return"
})
public class LoginByPhoneResponse {

    @XmlElement(name = "return")
    protected LoginUserResModel _return;

    /**
     * 获取return属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LoginUserResModel }
     *     
     */
    public LoginUserResModel getReturn() {
        return _return;
    }

    /**
     * 设置return属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LoginUserResModel }
     *     
     */
    public void setReturn(LoginUserResModel value) {
        this._return = value;
    }

}
