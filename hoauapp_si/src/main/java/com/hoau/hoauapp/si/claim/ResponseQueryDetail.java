
package com.hoau.hoauapp.si.claim;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>responseQueryDetail complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="responseQueryDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hoauapp.ws.erry.com/}responseClaimsObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="queryClaimsInfo" type="{http://hoauapp.ws.erry.com/}queryClaimsInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "responseQueryDetail", propOrder = {
    "queryClaimsInfo"
})
public class ResponseQueryDetail
    extends ResponseClaimsObject
{

    protected QueryClaimsInfo queryClaimsInfo;

    /**
     * ��ȡqueryClaimsInfo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link QueryClaimsInfo }
     *     
     */
    public QueryClaimsInfo getQueryClaimsInfo() {
        return queryClaimsInfo;
    }

    /**
     * ����queryClaimsInfo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link QueryClaimsInfo }
     *     
     */
    public void setQueryClaimsInfo(QueryClaimsInfo value) {
        this.queryClaimsInfo = value;
    }

}