package com.hoau.hoauapp.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by 275636 on 2015/4/8.
 */
public class SendMeOrderVO extends ResBaseVo implements Serializable {
    private String userId;
    /**
     * 运单ID
     */
    private String orderId;

    /**
     * 运单号
     */
    private String orderNo;
    /**
     * 发货人姓名
     */
    private String shipperName;
    /**
     * 发货人手机
     */
    private String shipperMobile;
    /**
     * 发货人省份
     */
    private String shipperProvince;
    /**
     * 发货人城市
     */
    private String shipperCity;
    /**
     * 发货人区县
     */
    private String shipperArea;
    /**
     * 发货人详细地址
     */
    private String shipperAddress;
    /**
     * 收货人姓名
     */
    private String consigneeName;
    /**
     * 收货人手机
     */
    private String consigneeMobile;
    /**
     * 收货人省份
     */
    private String consigneeProvince;
    /**
     * 收货人城市
     */
    private String consigneeCity;
    /**
     * 收货人区域
     */
    private String consigneeArea;
    /**
     * 收货人地址
     */
    private String consigneeAddress;
    /**
     * 货物名称
     */
    private String cargoName;
    /**
     * 件数
     */
    private int cargoPiece;
    /**
     * 货物重量
     */
    private double cargoWeight;
    /**
     * 货物体积
     */
    private double cargoVolume;

    /**
     * 订单状态
     */
    private String orderStatus;


    /**
     * 发货时间
     */
    private Date senddate;

    /**
     * 运单号
     */
    private String transNo;
    /**
     * 备注
     */
    private String remarks;

    /**
     * 总体评分
     */
    private String evaluate;

    private String productTypeName;

    /**
     * 运输类型
     * */
    private String yslx;
    /**
     * 送货方式
     * */
    private String shfs;
    /**
     * 代收货款
     * */
    private String dshk;
    /**
     * 总费用
     * */
    private String zfy;
    /**
     * 付款方式
     * */
    private String fkfs;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getShipperName() {
        return shipperName;
    }

    public void setShipperName(String shipperName) {
        this.shipperName = shipperName;
    }

    public String getShipperMobile() {
        return shipperMobile;
    }

    public void setShipperMobile(String shipperMobile) {
        this.shipperMobile = shipperMobile;
    }

    public String getShipperProvince() {
        return shipperProvince;
    }

    public void setShipperProvince(String shipperProvince) {
        this.shipperProvince = shipperProvince;
    }

    public String getShipperCity() {
        return shipperCity;
    }

    public void setShipperCity(String shipperCity) {
        this.shipperCity = shipperCity;
    }

    public String getShipperArea() {
        return shipperArea;
    }

    public void setShipperArea(String shipperArea) {
        this.shipperArea = shipperArea;
    }

    public String getShipperAddress() {
        return shipperAddress;
    }

    public void setShipperAddress(String shipperAddress) {
        this.shipperAddress = shipperAddress;
    }

    public String getConsigneeName() {
        return consigneeName;
    }

    public void setConsigneeName(String consigneeName) {
        this.consigneeName = consigneeName;
    }

    public String getConsigneeMobile() {
        return consigneeMobile;
    }

    public void setConsigneeMobile(String consigneeMobile) {
        this.consigneeMobile = consigneeMobile;
    }

    public String getConsigneeProvince() {
        return consigneeProvince;
    }

    public void setConsigneeProvince(String consigneeProvince) {
        this.consigneeProvince = consigneeProvince;
    }

    public String getConsigneeCity() {
        return consigneeCity;
    }

    public void setConsigneeCity(String consigneeCity) {
        this.consigneeCity = consigneeCity;
    }

    public String getConsigneeArea() {
        return consigneeArea;
    }

    public void setConsigneeArea(String consigneeArea) {
        this.consigneeArea = consigneeArea;
    }

    public String getConsigneeAddress() {
        return consigneeAddress;
    }

    public void setConsigneeAddress(String consigneeAddress) {
        this.consigneeAddress = consigneeAddress;
    }

    public String getCargoName() {
        return cargoName;
    }

    public void setCargoName(String cargoName) {
        this.cargoName = cargoName;
    }

    public int getCargoPiece() {
        return cargoPiece;
    }

    public void setCargoPiece(int cargoPiece) {
        this.cargoPiece = cargoPiece;
    }

    public double getCargoWeight() {
        return cargoWeight;
    }

    public void setCargoWeight(double cargoWeight) {
        this.cargoWeight = cargoWeight;
    }

    public double getCargoVolume() {
        return cargoVolume;
    }

    public void setCargoVolume(double cargoVolume) {
        this.cargoVolume = cargoVolume;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Date getSenddate() {
        return senddate;
    }

    public void setSenddate(Date senddate) {
        this.senddate = senddate;
    }

    public String getTransNo() {
        return transNo;
    }

    public void setTransNo(String transNo) {
        this.transNo = transNo;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getEvaluate() {
        return evaluate;
    }

    public void setEvaluate(String evaluate) {
        this.evaluate = evaluate;
    }

    public String getProductTypeName() {
        return productTypeName;
    }

    public void setProductTypeName(String productTypeName) {
        this.productTypeName = productTypeName;
    }

    public String getYslx() {
        return yslx;
    }

    public void setYslx(String yslx) {
        this.yslx = yslx;
    }

    public String getShfs() {
        return shfs;
    }

    public void setShfs(String shfs) {
        this.shfs = shfs;
    }

    public String getDshk() {
        return dshk;
    }

    public void setDshk(String dshk) {
        this.dshk = dshk;
    }

    public String getZfy() {
        return zfy;
    }

    public void setZfy(String zfy) {
        this.zfy = zfy;
    }

    public String getFkfs() {
        return fkfs;
    }

    public void setFkfs(String fkfs) {
        this.fkfs = fkfs;
    }

    public String getQtyd() {
        return qtyd;
    }

    public void setQtyd(String qtyd) {
        this.qtyd = qtyd;
    }

    /**

     * 其他约定*
     * */
    private String qtyd;
  }
