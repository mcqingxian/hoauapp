
package com.hoau.hoauapp.si.dc.sendme;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>waybillInfoVector complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="waybillInfoVector">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.hoau.net/services/AppWaybillServices}resBaseVo">
 *       &lt;sequence>
 *         &lt;element name="waybillInfo" type="{http://www.hoau.net/services/AppWaybillServices}waybillInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "waybillInfoVector", propOrder = {
    "waybillInfo"
})
public class WaybillInfoVector
    extends ResBaseVo
{

    protected List<WaybillInfo> waybillInfo;

    /**
     * Gets the value of the waybillInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the waybillInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWaybillInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WaybillInfo }
     * 
     * 
     */
    public List<WaybillInfo> getWaybillInfo() {
        if (waybillInfo == null) {
            waybillInfo = new ArrayList<WaybillInfo>();
        }
        return this.waybillInfo;
    }

}
