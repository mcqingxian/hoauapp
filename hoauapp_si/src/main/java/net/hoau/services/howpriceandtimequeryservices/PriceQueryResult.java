
package net.hoau.services.howpriceandtimequeryservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import com.hoau.hoauapp.vo.ResBaseVo;


/**
 * <p>priceQueryResult complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="priceQueryResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="deliveryTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="heavyPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="heveryDiscount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="insuredRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="issusingFee" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="lightDiscount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="lightPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="messageFee" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="minInsuredFee" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="pickTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="startPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="surcharge" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="transportType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "priceQueryResult", propOrder = {
    "deliveryTime",
    "heavyPrice",
    "heveryDiscount",
    "insuredRate",
    "issusingFee",
    "lightDiscount",
    "lightPrice",
    "messageFee",
    "minInsuredFee",
    "pickTime",
    "startPrice",
    "surcharge",
    "transportType"
})
public class PriceQueryResult  {

    /**
	 * 
	 */
	private static final long serialVersionUID = -518160039735699203L;
	protected String deliveryTime;
    protected Double heavyPrice;
    protected Double heveryDiscount;
    protected Double insuredRate;
    protected Double issusingFee;
    protected Double lightDiscount;
    protected Double lightPrice;
    protected Double messageFee;
    protected Double minInsuredFee;
    protected String pickTime;
    protected Double startPrice;
    protected Double surcharge;
    protected String transportType;

    /**
     * ��ȡdeliveryTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryTime() {
        return deliveryTime;
    }

    /**
     * ����deliveryTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryTime(String value) {
        this.deliveryTime = value;
    }

    /**
     * ��ȡheavyPrice���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHeavyPrice() {
        return heavyPrice;
    }

    /**
     * ����heavyPrice���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHeavyPrice(Double value) {
        this.heavyPrice = value;
    }

    /**
     * ��ȡheveryDiscount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHeveryDiscount() {
        return heveryDiscount;
    }

    /**
     * ����heveryDiscount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHeveryDiscount(Double value) {
        this.heveryDiscount = value;
    }

    /**
     * ��ȡinsuredRate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getInsuredRate() {
        return insuredRate;
    }

    /**
     * ����insuredRate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setInsuredRate(Double value) {
        this.insuredRate = value;
    }

    /**
     * ��ȡissusingFee���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getIssusingFee() {
        return issusingFee;
    }

    /**
     * ����issusingFee���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setIssusingFee(Double value) {
        this.issusingFee = value;
    }

    /**
     * ��ȡlightDiscount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLightDiscount() {
        return lightDiscount;
    }

    /**
     * ����lightDiscount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLightDiscount(Double value) {
        this.lightDiscount = value;
    }

    /**
     * ��ȡlightPrice���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLightPrice() {
        return lightPrice;
    }

    /**
     * ����lightPrice���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLightPrice(Double value) {
        this.lightPrice = value;
    }

    /**
     * ��ȡmessageFee���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMessageFee() {
        return messageFee;
    }

    /**
     * ����messageFee���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMessageFee(Double value) {
        this.messageFee = value;
    }

    /**
     * ��ȡminInsuredFee���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinInsuredFee() {
        return minInsuredFee;
    }

    /**
     * ����minInsuredFee���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinInsuredFee(Double value) {
        this.minInsuredFee = value;
    }

    /**
     * ��ȡpickTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickTime() {
        return pickTime;
    }

    /**
     * ����pickTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickTime(String value) {
        this.pickTime = value;
    }

    /**
     * ��ȡstartPrice���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getStartPrice() {
        return startPrice;
    }

    /**
     * ����startPrice���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setStartPrice(Double value) {
        this.startPrice = value;
    }

    /**
     * ��ȡsurcharge���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSurcharge() {
        return surcharge;
    }

    /**
     * ����surcharge���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSurcharge(Double value) {
        this.surcharge = value;
    }

    /**
     * ��ȡtransportType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportType() {
        return transportType;
    }

    /**
     * ����transportType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportType(String value) {
        this.transportType = value;
    }

}
