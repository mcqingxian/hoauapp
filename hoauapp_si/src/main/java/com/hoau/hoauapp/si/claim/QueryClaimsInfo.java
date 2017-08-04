
package com.hoau.hoauapp.si.claim;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>queryClaimsInfo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="queryClaimsInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accidentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bankAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bankAccountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bankCardPicFiles" type="{http://hoauapp.ws.erry.com/}claimsAttachmentInfo" minOccurs="0"/&gt;
 *         &lt;element name="bankCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bankProvince" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="billNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="billTel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cargoReceiptPicFiles" type="{http://hoauapp.ws.erry.com/}claimsAttachmentInfo" minOccurs="0"/&gt;
 *         &lt;element name="cityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="claimOrderPicFiles" type="{http://hoauapp.ws.erry.com/}claimsAttachmentInfo" minOccurs="0"/&gt;
 *         &lt;element name="claimsAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="claimsId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="claimsNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="claimsOwner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="claimsTrackList" type="{http://hoauapp.ws.erry.com/}claimsTrack" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="contactName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contactTel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="createTime" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="damagePicFiles" type="{http://hoauapp.ws.erry.com/}claimsAttachmentInfo" minOccurs="0"/&gt;
 *         &lt;element name="dcEvent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dcEventDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="exceptionCount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="goodsName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="identificationCardPicFiles" type="{http://hoauapp.ws.erry.com/}claimsAttachmentInfo" minOccurs="0"/&gt;
 *         &lt;element name="invoicePicFiles" type="{http://hoauapp.ws.erry.com/}claimsAttachmentInfo" minOccurs="0"/&gt;
 *         &lt;element name="payAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="payeeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="refuseStatus" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="shippingOrderPicFiles" type="{http://hoauapp.ws.erry.com/}claimsAttachmentInfo" minOccurs="0"/&gt;
 *         &lt;element name="showConfirmBtn" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="showmodifyBtn" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "queryClaimsInfo", propOrder = {
    "accidentType",
    "bankAccount",
    "bankAccountName",
    "bankCardPicFiles",
    "bankCity",
    "bankName",
    "bankProvince",
    "billNo",
    "billTel",
    "cargoReceiptPicFiles",
    "cityName",
    "claimOrderPicFiles",
    "claimsAmount",
    "claimsId",
    "claimsNo",
    "claimsOwner",
    "claimsTrackList",
    "contactName",
    "contactTel",
    "createTime",
    "damagePicFiles",
    "dcEvent",
    "dcEventDesc",
    "exceptionCount",
    "goodsName",
    "identificationCardPicFiles",
    "invoicePicFiles",
    "payAmount",
    "payeeName",
    "reason",
    "refuseStatus",
    "shippingOrderPicFiles",
    "showConfirmBtn",
    "showmodifyBtn"
})
public class QueryClaimsInfo {

    protected String accidentType;
    protected String bankAccount;
    protected String bankAccountName;
    protected ClaimsAttachmentInfo bankCardPicFiles;
    protected String bankCity;
    protected String bankName;
    protected String bankProvince;
    protected String billNo;
    protected String billTel;
    protected ClaimsAttachmentInfo cargoReceiptPicFiles;
    protected String cityName;
    protected ClaimsAttachmentInfo claimOrderPicFiles;
    protected double claimsAmount;
    protected Long claimsId;
    protected String claimsNo;
    protected String claimsOwner;
    @XmlElement(nillable = true)
    protected List<ClaimsTrack> claimsTrackList;
    protected String contactName;
    protected String contactTel;
    protected long createTime;
    protected ClaimsAttachmentInfo damagePicFiles;
    protected String dcEvent;
    protected String dcEventDesc;
    protected long exceptionCount;
    protected String goodsName;
    protected ClaimsAttachmentInfo identificationCardPicFiles;
    protected ClaimsAttachmentInfo invoicePicFiles;
    protected double payAmount;
    protected String payeeName;
    protected String reason;
    protected int refuseStatus;
    protected ClaimsAttachmentInfo shippingOrderPicFiles;
    protected boolean showConfirmBtn;
    protected boolean showmodifyBtn;

    /**
     * ��ȡaccidentType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccidentType() {
        return accidentType;
    }

    /**
     * ����accidentType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccidentType(String value) {
        this.accidentType = value;
    }

    /**
     * ��ȡbankAccount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAccount() {
        return bankAccount;
    }

    /**
     * ����bankAccount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAccount(String value) {
        this.bankAccount = value;
    }

    /**
     * ��ȡbankAccountName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAccountName() {
        return bankAccountName;
    }

    /**
     * ����bankAccountName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAccountName(String value) {
        this.bankAccountName = value;
    }

    /**
     * ��ȡbankCardPicFiles���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ClaimsAttachmentInfo }
     *     
     */
    public ClaimsAttachmentInfo getBankCardPicFiles() {
        return bankCardPicFiles;
    }

    /**
     * ����bankCardPicFiles���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimsAttachmentInfo }
     *     
     */
    public void setBankCardPicFiles(ClaimsAttachmentInfo value) {
        this.bankCardPicFiles = value;
    }

    /**
     * ��ȡbankCity���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankCity() {
        return bankCity;
    }

    /**
     * ����bankCity���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankCity(String value) {
        this.bankCity = value;
    }

    /**
     * ��ȡbankName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * ����bankName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankName(String value) {
        this.bankName = value;
    }

    /**
     * ��ȡbankProvince���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankProvince() {
        return bankProvince;
    }

    /**
     * ����bankProvince���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankProvince(String value) {
        this.bankProvince = value;
    }

    /**
     * ��ȡbillNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillNo() {
        return billNo;
    }

    /**
     * ����billNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillNo(String value) {
        this.billNo = value;
    }

    /**
     * ��ȡbillTel���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillTel() {
        return billTel;
    }

    /**
     * ����billTel���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillTel(String value) {
        this.billTel = value;
    }

    /**
     * ��ȡcargoReceiptPicFiles���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ClaimsAttachmentInfo }
     *     
     */
    public ClaimsAttachmentInfo getCargoReceiptPicFiles() {
        return cargoReceiptPicFiles;
    }

    /**
     * ����cargoReceiptPicFiles���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimsAttachmentInfo }
     *     
     */
    public void setCargoReceiptPicFiles(ClaimsAttachmentInfo value) {
        this.cargoReceiptPicFiles = value;
    }

    /**
     * ��ȡcityName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * ����cityName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityName(String value) {
        this.cityName = value;
    }

    /**
     * ��ȡclaimOrderPicFiles���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ClaimsAttachmentInfo }
     *     
     */
    public ClaimsAttachmentInfo getClaimOrderPicFiles() {
        return claimOrderPicFiles;
    }

    /**
     * ����claimOrderPicFiles���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimsAttachmentInfo }
     *     
     */
    public void setClaimOrderPicFiles(ClaimsAttachmentInfo value) {
        this.claimOrderPicFiles = value;
    }

    /**
     * ��ȡclaimsAmount���Ե�ֵ��
     * 
     */
    public double getClaimsAmount() {
        return claimsAmount;
    }

    /**
     * ����claimsAmount���Ե�ֵ��
     * 
     */
    public void setClaimsAmount(double value) {
        this.claimsAmount = value;
    }

    /**
     * ��ȡclaimsId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getClaimsId() {
        return claimsId;
    }

    /**
     * ����claimsId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setClaimsId(Long value) {
        this.claimsId = value;
    }

    /**
     * ��ȡclaimsNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimsNo() {
        return claimsNo;
    }

    /**
     * ����claimsNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimsNo(String value) {
        this.claimsNo = value;
    }

    /**
     * ��ȡclaimsOwner���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimsOwner() {
        return claimsOwner;
    }

    /**
     * ����claimsOwner���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimsOwner(String value) {
        this.claimsOwner = value;
    }

    /**
     * Gets the value of the claimsTrackList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the claimsTrackList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClaimsTrackList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClaimsTrack }
     * 
     * 
     */
    public List<ClaimsTrack> getClaimsTrackList() {
        if (claimsTrackList == null) {
            claimsTrackList = new ArrayList<ClaimsTrack>();
        }
        return this.claimsTrackList;
    }

    /**
     * ��ȡcontactName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * ����contactName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactName(String value) {
        this.contactName = value;
    }

    /**
     * ��ȡcontactTel���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactTel() {
        return contactTel;
    }

    /**
     * ����contactTel���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactTel(String value) {
        this.contactTel = value;
    }

    /**
     * ��ȡcreateTime���Ե�ֵ��
     * 
     */
    public long getCreateTime() {
        return createTime;
    }

    /**
     * ����createTime���Ե�ֵ��
     * 
     */
    public void setCreateTime(long value) {
        this.createTime = value;
    }

    /**
     * ��ȡdamagePicFiles���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ClaimsAttachmentInfo }
     *     
     */
    public ClaimsAttachmentInfo getDamagePicFiles() {
        return damagePicFiles;
    }

    /**
     * ����damagePicFiles���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimsAttachmentInfo }
     *     
     */
    public void setDamagePicFiles(ClaimsAttachmentInfo value) {
        this.damagePicFiles = value;
    }

    /**
     * ��ȡdcEvent���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDcEvent() {
        return dcEvent;
    }

    /**
     * ����dcEvent���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDcEvent(String value) {
        this.dcEvent = value;
    }

    /**
     * ��ȡdcEventDesc���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDcEventDesc() {
        return dcEventDesc;
    }

    /**
     * ����dcEventDesc���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDcEventDesc(String value) {
        this.dcEventDesc = value;
    }

    /**
     * ��ȡexceptionCount���Ե�ֵ��
     * 
     */
    public long getExceptionCount() {
        return exceptionCount;
    }

    /**
     * ����exceptionCount���Ե�ֵ��
     * 
     */
    public void setExceptionCount(long value) {
        this.exceptionCount = value;
    }

    /**
     * ��ȡgoodsName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoodsName() {
        return goodsName;
    }

    /**
     * ����goodsName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoodsName(String value) {
        this.goodsName = value;
    }

    /**
     * ��ȡidentificationCardPicFiles���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ClaimsAttachmentInfo }
     *     
     */
    public ClaimsAttachmentInfo getIdentificationCardPicFiles() {
        return identificationCardPicFiles;
    }

    /**
     * ����identificationCardPicFiles���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimsAttachmentInfo }
     *     
     */
    public void setIdentificationCardPicFiles(ClaimsAttachmentInfo value) {
        this.identificationCardPicFiles = value;
    }

    /**
     * ��ȡinvoicePicFiles���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ClaimsAttachmentInfo }
     *     
     */
    public ClaimsAttachmentInfo getInvoicePicFiles() {
        return invoicePicFiles;
    }

    /**
     * ����invoicePicFiles���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimsAttachmentInfo }
     *     
     */
    public void setInvoicePicFiles(ClaimsAttachmentInfo value) {
        this.invoicePicFiles = value;
    }

    /**
     * ��ȡpayAmount���Ե�ֵ��
     * 
     */
    public double getPayAmount() {
        return payAmount;
    }

    /**
     * ����payAmount���Ե�ֵ��
     * 
     */
    public void setPayAmount(double value) {
        this.payAmount = value;
    }

    /**
     * ��ȡpayeeName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayeeName() {
        return payeeName;
    }

    /**
     * ����payeeName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayeeName(String value) {
        this.payeeName = value;
    }

    /**
     * ��ȡreason���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * ����reason���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * ��ȡrefuseStatus���Ե�ֵ��
     * 
     */
    public int getRefuseStatus() {
        return refuseStatus;
    }

    /**
     * ����refuseStatus���Ե�ֵ��
     * 
     */
    public void setRefuseStatus(int value) {
        this.refuseStatus = value;
    }

    /**
     * ��ȡshippingOrderPicFiles���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ClaimsAttachmentInfo }
     *     
     */
    public ClaimsAttachmentInfo getShippingOrderPicFiles() {
        return shippingOrderPicFiles;
    }

    /**
     * ����shippingOrderPicFiles���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimsAttachmentInfo }
     *     
     */
    public void setShippingOrderPicFiles(ClaimsAttachmentInfo value) {
        this.shippingOrderPicFiles = value;
    }

    /**
     * ��ȡshowConfirmBtn���Ե�ֵ��
     * 
     */
    public boolean isShowConfirmBtn() {
        return showConfirmBtn;
    }

    /**
     * ����showConfirmBtn���Ե�ֵ��
     * 
     */
    public void setShowConfirmBtn(boolean value) {
        this.showConfirmBtn = value;
    }

    /**
     * ��ȡshowmodifyBtn���Ե�ֵ��
     * 
     */
    public boolean isShowmodifyBtn() {
        return showmodifyBtn;
    }

    /**
     * ����showmodifyBtn���Ե�ֵ��
     * 
     */
    public void setShowmodifyBtn(boolean value) {
        this.showmodifyBtn = value;
    }

}
