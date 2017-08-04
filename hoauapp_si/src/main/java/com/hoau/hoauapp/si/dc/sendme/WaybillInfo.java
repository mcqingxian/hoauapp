
package com.hoau.hoauapp.si.dc.sendme;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>waybillInfo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="waybillInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.hoau.net/services/AppWaybillServices}resBaseVo">
 *       &lt;sequence>
 *         &lt;element name="CYRQZ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DSHKE" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="FKFS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HJJE" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="HWMC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JS" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="KDSJ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QTYD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SHRDZ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SHRLXDH1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SHRLXR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SHRMC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SHRSJ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SOHFS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TJ" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="TYRDZ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TYRLXDH1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TYRLXR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TYRMC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TYRQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TYRSJ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="YDBH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="YDZT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ZL" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "waybillInfo", propOrder = {
    "cyrqz",
    "dshke",
    "fkfs",
    "hjje",
    "hwmc",
    "js",
    "kdsj",
    "qtyd",
    "shrdz",
    "shrlxdh1",
    "shrlxr",
    "shrmc",
    "shrsj",
    "sohfs",
    "tj",
    "tyrdz",
    "tyrlxdh1",
    "tyrlxr",
    "tyrmc",
    "tyrq",
    "tyrsj",
    "ydbh",
    "ydzt",
    "zl"
})
public class WaybillInfo
    extends ResBaseVo
{

    @XmlElement(name = "CYRQZ")
    protected String cyrqz;
    @XmlElement(name = "DSHKE")
    protected float dshke;
    @XmlElement(name = "FKFS")
    protected String fkfs;
    @XmlElement(name = "HJJE")
    protected float hjje;
    @XmlElement(name = "HWMC")
    protected String hwmc;
    @XmlElement(name = "JS")
    protected int js;
    @XmlElement(name = "KDSJ")
    protected String kdsj;
    @XmlElement(name = "QTYD")
    protected String qtyd;
    @XmlElement(name = "SHRDZ")
    protected String shrdz;
    @XmlElement(name = "SHRLXDH1")
    protected String shrlxdh1;
    @XmlElement(name = "SHRLXR")
    protected String shrlxr;
    @XmlElement(name = "SHRMC")
    protected String shrmc;
    @XmlElement(name = "SHRSJ")
    protected String shrsj;
    @XmlElement(name = "SOHFS")
    protected String sohfs;
    @XmlElement(name = "TJ")
    protected float tj;
    @XmlElement(name = "TYRDZ")
    protected String tyrdz;
    @XmlElement(name = "TYRLXDH1")
    protected String tyrlxdh1;
    @XmlElement(name = "TYRLXR")
    protected String tyrlxr;
    @XmlElement(name = "TYRMC")
    protected String tyrmc;
    @XmlElement(name = "TYRQ")
    protected String tyrq;
    @XmlElement(name = "TYRSJ")
    protected String tyrsj;
    @XmlElement(name = "YDBH")
    protected String ydbh;
    @XmlElement(name = "YDZT")
    protected String ydzt;
    @XmlElement(name = "ZL")
    protected float zl;

    /**
     * ��ȡcyrqz���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCYRQZ() {
        return cyrqz;
    }

    /**
     * ����cyrqz���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCYRQZ(String value) {
        this.cyrqz = value;
    }

    /**
     * ��ȡdshke���Ե�ֵ��
     * 
     */
    public float getDSHKE() {
        return dshke;
    }

    /**
     * ����dshke���Ե�ֵ��
     * 
     */
    public void setDSHKE(float value) {
        this.dshke = value;
    }

    /**
     * ��ȡfkfs���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFKFS() {
        return fkfs;
    }

    /**
     * ����fkfs���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFKFS(String value) {
        this.fkfs = value;
    }

    /**
     * ��ȡhjje���Ե�ֵ��
     * 
     */
    public float getHJJE() {
        return hjje;
    }

    /**
     * ����hjje���Ե�ֵ��
     * 
     */
    public void setHJJE(float value) {
        this.hjje = value;
    }

    /**
     * ��ȡhwmc���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHWMC() {
        return hwmc;
    }

    /**
     * ����hwmc���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHWMC(String value) {
        this.hwmc = value;
    }

    /**
     * ��ȡjs���Ե�ֵ��
     * 
     */
    public int getJS() {
        return js;
    }

    /**
     * ����js���Ե�ֵ��
     * 
     */
    public void setJS(int value) {
        this.js = value;
    }

    /**
     * ��ȡkdsj���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDSJ() {
        return kdsj;
    }

    /**
     * ����kdsj���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDSJ(String value) {
        this.kdsj = value;
    }

    /**
     * ��ȡqtyd���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQTYD() {
        return qtyd;
    }

    /**
     * ����qtyd���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQTYD(String value) {
        this.qtyd = value;
    }

    /**
     * ��ȡshrdz���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSHRDZ() {
        return shrdz;
    }

    /**
     * ����shrdz���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSHRDZ(String value) {
        this.shrdz = value;
    }

    /**
     * ��ȡshrlxdh1���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSHRLXDH1() {
        return shrlxdh1;
    }

    /**
     * ����shrlxdh1���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSHRLXDH1(String value) {
        this.shrlxdh1 = value;
    }

    /**
     * ��ȡshrlxr���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSHRLXR() {
        return shrlxr;
    }

    /**
     * ����shrlxr���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSHRLXR(String value) {
        this.shrlxr = value;
    }

    /**
     * ��ȡshrmc���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSHRMC() {
        return shrmc;
    }

    /**
     * ����shrmc���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSHRMC(String value) {
        this.shrmc = value;
    }

    /**
     * ��ȡshrsj���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSHRSJ() {
        return shrsj;
    }

    /**
     * ����shrsj���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSHRSJ(String value) {
        this.shrsj = value;
    }

    /**
     * ��ȡsohfs���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOHFS() {
        return sohfs;
    }

    /**
     * ����sohfs���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOHFS(String value) {
        this.sohfs = value;
    }

    /**
     * ��ȡtj���Ե�ֵ��
     * 
     */
    public float getTJ() {
        return tj;
    }

    /**
     * ����tj���Ե�ֵ��
     * 
     */
    public void setTJ(float value) {
        this.tj = value;
    }

    /**
     * ��ȡtyrdz���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYRDZ() {
        return tyrdz;
    }

    /**
     * ����tyrdz���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYRDZ(String value) {
        this.tyrdz = value;
    }

    /**
     * ��ȡtyrlxdh1���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYRLXDH1() {
        return tyrlxdh1;
    }

    /**
     * ����tyrlxdh1���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYRLXDH1(String value) {
        this.tyrlxdh1 = value;
    }

    /**
     * ��ȡtyrlxr���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYRLXR() {
        return tyrlxr;
    }

    /**
     * ����tyrlxr���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYRLXR(String value) {
        this.tyrlxr = value;
    }

    /**
     * ��ȡtyrmc���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYRMC() {
        return tyrmc;
    }

    /**
     * ����tyrmc���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYRMC(String value) {
        this.tyrmc = value;
    }

    /**
     * ��ȡtyrq���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYRQ() {
        return tyrq;
    }

    /**
     * ����tyrq���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYRQ(String value) {
        this.tyrq = value;
    }

    /**
     * ��ȡtyrsj���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYRSJ() {
        return tyrsj;
    }

    /**
     * ����tyrsj���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYRSJ(String value) {
        this.tyrsj = value;
    }

    /**
     * ��ȡydbh���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYDBH() {
        return ydbh;
    }

    /**
     * ����ydbh���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYDBH(String value) {
        this.ydbh = value;
    }

    /**
     * ��ȡydzt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYDZT() {
        return ydzt;
    }

    /**
     * ����ydzt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYDZT(String value) {
        this.ydzt = value;
    }

    /**
     * ��ȡzl���Ե�ֵ��
     * 
     */
    public float getZL() {
        return zl;
    }

    /**
     * ����zl���Ե�ֵ��
     * 
     */
    public void setZL(float value) {
        this.zl = value;
    }

}
