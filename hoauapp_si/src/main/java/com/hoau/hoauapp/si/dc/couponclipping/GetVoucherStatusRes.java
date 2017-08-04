
package com.hoau.hoauapp.si.dc.couponclipping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getVoucherStatusRes complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="getVoucherStatusRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.hoau.net/services/OuterVocherServices}resBaseVo">
 *       &lt;sequence>
 *         &lt;element name="voucherInfos" type="{http://www.hoau.net/services/OuterVocherServices}voucherInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getVoucherStatusRes", propOrder = {
    "voucherInfos"
})
public class GetVoucherStatusRes
    extends ResBaseVo
{

    @XmlElement(nillable = true)
    protected List<VoucherInfo> voucherInfos;

    /**
     * Gets the value of the voucherInfos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the voucherInfos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVoucherInfos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VoucherInfo }
     * 
     * 
     */
    public List<VoucherInfo> getVoucherInfos() {
        if (voucherInfos == null) {
            voucherInfos = new ArrayList<VoucherInfo>();
        }
        return this.voucherInfos;
    }

}
