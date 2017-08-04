
package com.hoau.hoauapp.si.dc.company;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>company complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="company">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AREA_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CSBH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CSMC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CZ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GSBH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GSBH_MERGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GSJC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GSLX" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="JKCSBH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JLYF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PTBH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PTLXBH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QYBH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QYBHMC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QYMC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REGION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SFBH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SFMC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SFPYWD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SFSK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SFTGDRDFW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SFXNGS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SFYX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SJGSBH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SSLQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SSYJGS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="YTGS_KHZT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="YTGS_SHSM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ZS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "company", propOrder = {
    "areacode",
    "csbh",
    "csmc",
    "cz",
    "dh",
    "gsbh",
    "gsbhmerge",
    "gsjc",
    "gslx",
    "jkcsbh",
    "jlyf",
    "ptbh",
    "ptlxbh",
    "qybh",
    "qybhmc",
    "qymc",
    "region",
    "sfbh",
    "sfmc",
    "sfpywd",
    "sfsk",
    "sftgdrdfw",
    "sfxngs",
    "sfyx",
    "sjgsbh",
    "sslq",
    "ssyjgs",
    "ytgskhzt",
    "ytgsshsm",
    "zs"
})
public class Company {

    @XmlElement(name = "AREA_CODE")
    protected String areacode;
    @XmlElement(name = "CSBH")
    protected String csbh;
    @XmlElement(name = "CSMC")
    protected String csmc;
    @XmlElement(name = "CZ")
    protected String cz;
    @XmlElement(name = "DH")
    protected String dh;
    @XmlElement(name = "GSBH")
    protected String gsbh;
    @XmlElement(name = "GSBH_MERGE")
    protected String gsbhmerge;
    @XmlElement(name = "GSJC")
    protected String gsjc;
    @XmlElement(name = "GSLX")
    protected int gslx;
    @XmlElement(name = "JKCSBH")
    protected String jkcsbh;
    @XmlElement(name = "JLYF")
    protected String jlyf;
    @XmlElement(name = "PTBH")
    protected String ptbh;
    @XmlElement(name = "PTLXBH")
    protected String ptlxbh;
    @XmlElement(name = "QYBH")
    protected String qybh;
    @XmlElement(name = "QYBHMC")
    protected String qybhmc;
    @XmlElement(name = "QYMC")
    protected String qymc;
    @XmlElement(name = "REGION")
    protected String region;
    @XmlElement(name = "SFBH")
    protected String sfbh;
    @XmlElement(name = "SFMC")
    protected String sfmc;
    @XmlElement(name = "SFPYWD")
    protected String sfpywd;
    @XmlElement(name = "SFSK")
    protected String sfsk;
    @XmlElement(name = "SFTGDRDFW")
    protected String sftgdrdfw;
    @XmlElement(name = "SFXNGS")
    protected String sfxngs;
    @XmlElement(name = "SFYX")
    protected String sfyx;
    @XmlElement(name = "SJGSBH")
    protected String sjgsbh;
    @XmlElement(name = "SSLQ")
    protected String sslq;
    @XmlElement(name = "SSYJGS")
    protected String ssyjgs;
    @XmlElement(name = "YTGS_KHZT")
    protected String ytgskhzt;
    @XmlElement(name = "YTGS_SHSM")
    protected String ytgsshsm;
    @XmlElement(name = "ZS")
    protected String zs;

    /**
     * 获取areacode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAREACODE() {
        return areacode;
    }

    /**
     * 设置areacode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAREACODE(String value) {
        this.areacode = value;
    }

    /**
     * 获取csbh属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSBH() {
        return csbh;
    }

    /**
     * 设置csbh属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSBH(String value) {
        this.csbh = value;
    }

    /**
     * 获取csmc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSMC() {
        return csmc;
    }

    /**
     * 设置csmc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSMC(String value) {
        this.csmc = value;
    }

    /**
     * 获取cz属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCZ() {
        return cz;
    }

    /**
     * 设置cz属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCZ(String value) {
        this.cz = value;
    }

    /**
     * 获取dh属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDH() {
        return dh;
    }

    /**
     * 设置dh属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDH(String value) {
        this.dh = value;
    }

    /**
     * 获取gsbh属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGSBH() {
        return gsbh;
    }

    /**
     * 设置gsbh属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGSBH(String value) {
        this.gsbh = value;
    }

    /**
     * 获取gsbhmerge属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGSBHMERGE() {
        return gsbhmerge;
    }

    /**
     * 设置gsbhmerge属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGSBHMERGE(String value) {
        this.gsbhmerge = value;
    }

    /**
     * 获取gsjc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGSJC() {
        return gsjc;
    }

    /**
     * 设置gsjc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGSJC(String value) {
        this.gsjc = value;
    }

    /**
     * 获取gslx属性的值。
     * 
     */
    public int getGSLX() {
        return gslx;
    }

    /**
     * 设置gslx属性的值。
     * 
     */
    public void setGSLX(int value) {
        this.gslx = value;
    }

    /**
     * 获取jkcsbh属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJKCSBH() {
        return jkcsbh;
    }

    /**
     * 设置jkcsbh属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJKCSBH(String value) {
        this.jkcsbh = value;
    }

    /**
     * 获取jlyf属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJLYF() {
        return jlyf;
    }

    /**
     * 设置jlyf属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJLYF(String value) {
        this.jlyf = value;
    }

    /**
     * 获取ptbh属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPTBH() {
        return ptbh;
    }

    /**
     * 设置ptbh属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPTBH(String value) {
        this.ptbh = value;
    }

    /**
     * 获取ptlxbh属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPTLXBH() {
        return ptlxbh;
    }

    /**
     * 设置ptlxbh属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPTLXBH(String value) {
        this.ptlxbh = value;
    }

    /**
     * 获取qybh属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQYBH() {
        return qybh;
    }

    /**
     * 设置qybh属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQYBH(String value) {
        this.qybh = value;
    }

    /**
     * 获取qybhmc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQYBHMC() {
        return qybhmc;
    }

    /**
     * 设置qybhmc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQYBHMC(String value) {
        this.qybhmc = value;
    }

    /**
     * 获取qymc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQYMC() {
        return qymc;
    }

    /**
     * 设置qymc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQYMC(String value) {
        this.qymc = value;
    }

    /**
     * 获取region属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREGION() {
        return region;
    }

    /**
     * 设置region属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREGION(String value) {
        this.region = value;
    }

    /**
     * 获取sfbh属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSFBH() {
        return sfbh;
    }

    /**
     * 设置sfbh属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSFBH(String value) {
        this.sfbh = value;
    }

    /**
     * 获取sfmc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSFMC() {
        return sfmc;
    }

    /**
     * 设置sfmc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSFMC(String value) {
        this.sfmc = value;
    }

    /**
     * 获取sfpywd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSFPYWD() {
        return sfpywd;
    }

    /**
     * 设置sfpywd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSFPYWD(String value) {
        this.sfpywd = value;
    }

    /**
     * 获取sfsk属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSFSK() {
        return sfsk;
    }

    /**
     * 设置sfsk属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSFSK(String value) {
        this.sfsk = value;
    }

    /**
     * 获取sftgdrdfw属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSFTGDRDFW() {
        return sftgdrdfw;
    }

    /**
     * 设置sftgdrdfw属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSFTGDRDFW(String value) {
        this.sftgdrdfw = value;
    }

    /**
     * 获取sfxngs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSFXNGS() {
        return sfxngs;
    }

    /**
     * 设置sfxngs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSFXNGS(String value) {
        this.sfxngs = value;
    }

    /**
     * 获取sfyx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSFYX() {
        return sfyx;
    }

    /**
     * 设置sfyx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSFYX(String value) {
        this.sfyx = value;
    }

    /**
     * 获取sjgsbh属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSJGSBH() {
        return sjgsbh;
    }

    /**
     * 设置sjgsbh属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSJGSBH(String value) {
        this.sjgsbh = value;
    }

    /**
     * 获取sslq属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSLQ() {
        return sslq;
    }

    /**
     * 设置sslq属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSLQ(String value) {
        this.sslq = value;
    }

    /**
     * 获取ssyjgs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSYJGS() {
        return ssyjgs;
    }

    /**
     * 设置ssyjgs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSYJGS(String value) {
        this.ssyjgs = value;
    }

    /**
     * 获取ytgskhzt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYTGSKHZT() {
        return ytgskhzt;
    }

    /**
     * 设置ytgskhzt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYTGSKHZT(String value) {
        this.ytgskhzt = value;
    }

    /**
     * 获取ytgsshsm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYTGSSHSM() {
        return ytgsshsm;
    }

    /**
     * 设置ytgsshsm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYTGSSHSM(String value) {
        this.ytgsshsm = value;
    }

    /**
     * 获取zs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZS() {
        return zs;
    }

    /**
     * 设置zs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZS(String value) {
        this.zs = value;
    }

}
