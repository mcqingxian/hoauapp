
package com.hoau.hoauapp.si.oms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>modifyOrderReqModel complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="modifyOrderReqModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="modifyOrder" type="{http://service.server.itf.module.obh.hoau.com/}phoneOrderReqModel" minOccurs="0"/>
 *         &lt;element name="userid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modifyOrderReqModel", propOrder = {
    "modifyOrder",
    "userid"
})
public class ModifyOrderReqModel {

    protected PhoneOrderReqModel modifyOrder;
    protected String userid;

    /**
     * 获取modifyOrder属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PhoneOrderReqModel }
     *     
     */
    public PhoneOrderReqModel getModifyOrder() {
        return modifyOrder;
    }

    /**
     * 设置modifyOrder属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneOrderReqModel }
     *     
     */
    public void setModifyOrder(PhoneOrderReqModel value) {
        this.modifyOrder = value;
    }

    /**
     * 获取userid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserid() {
        return userid;
    }

    /**
     * 设置userid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserid(String value) {
        this.userid = value;
    }

}
