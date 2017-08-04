
package com.hoau.hoauapp.si.dc.company;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>companyData complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡerror���Ե�ֵ��
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
     * ����error���Ե�ֵ��
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
     * ��ȡrowcount���Ե�ֵ��
     * 
     */
    public int getROWCOUNT() {
        return rowcount;
    }

    /**
     * ����rowcount���Ե�ֵ��
     * 
     */
    public void setROWCOUNT(int value) {
        this.rowcount = value;
    }

    /**
     * ��ȡstatus���Ե�ֵ��
     * 
     */
    public boolean isSTATUS() {
        return status;
    }

    /**
     * ����status���Ե�ֵ��
     * 
     */
    public void setSTATUS(boolean value) {
        this.status = value;
    }

}
