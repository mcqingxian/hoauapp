
package com.hoau.hoauapp.si.dc.company;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>companyData complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="companyData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="details" type="{http://www.szzc.com.cn/services/CompanyServices}company" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ERROR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ROWCOUNT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "companyData", propOrder = {
    "details",
    "error",
    "rowcount",
    "status"
})
public class CompanyData {

    @XmlElement(nillable = true)
    protected List<Company> details;
    @XmlElement(name = "ERROR")
    protected String error;
    @XmlElement(name = "ROWCOUNT")
    protected int rowcount;
    @XmlElement(name = "STATUS")
    protected boolean status;

    /**
     * Gets the value of the details property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the details property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Company }
     * 
     * 
     */
    public List<Company> getDetails() {
        if (details == null) {
            details = new ArrayList<Company>();
        }
        return this.details;
    }

    /**
     * 获取error属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getERROR() {
        return error;
    }

    /**
     * 设置error属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setERROR(String value) {
        this.error = value;
    }

    /**
     * 获取rowcount属性的值。
     * 
     */
    public int getROWCOUNT() {
        return rowcount;
    }

    /**
     * 设置rowcount属性的值。
     * 
     */
    public void setROWCOUNT(int value) {
        this.rowcount = value;
    }

    /**
     * 获取status属性的值。
     * 
     */
    public boolean isSTATUS() {
        return status;
    }

    /**
     * 设置status属性的值。
     * 
     */
    public void setSTATUS(boolean value) {
        this.status = value;
    }

}
