
package com.hoau.hoauapp.si.claim;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>queryCheck complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="queryCheck"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="reqClaimsObject" type="{http://hoauapp.ws.erry.com/}reqClaimsObject" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "queryCheck", propOrder = {
    "reqClaimsObject"
})
public class QueryCheck {

    protected ReqClaimsObject reqClaimsObject;

    /**
     * 获取reqClaimsObject属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ReqClaimsObject }
     *     
     */
    public ReqClaimsObject getReqClaimsObject() {
        return reqClaimsObject;
    }

    /**
     * 设置reqClaimsObject属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ReqClaimsObject }
     *     
     */
    public void setReqClaimsObject(ReqClaimsObject value) {
        this.reqClaimsObject = value;
    }

}
