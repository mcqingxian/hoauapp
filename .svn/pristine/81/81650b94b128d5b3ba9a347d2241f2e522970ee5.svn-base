
package com.hoau.hoauapp.si.newoms;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfOrderModel complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOrderModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrderModel" type="{http://model.app.interfaces.sinotrans.com}OrderModel" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOrderModel", namespace = "http://model.app.interfaces.sinotrans.com", propOrder = {
    "orderModel"
})
public class ArrayOfOrderModel {

    @XmlElement(name = "OrderModel", nillable = true)
    protected List<OrderModel> orderModel;

    /**
     * Gets the value of the orderModel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderModel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderModel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderModel }
     * 
     * 
     */
    public List<OrderModel> getOrderModel() {
        if (orderModel == null) {
            orderModel = new ArrayList<OrderModel>();
        }
        return this.orderModel;
    }

}
