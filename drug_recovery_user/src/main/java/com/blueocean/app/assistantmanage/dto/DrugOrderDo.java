package com.blueocean.app.assistantmanage.dto;

import java.io.Serializable;
import java.util.Date;

public class DrugOrderDo implements Serializable {
    
    private String orderId;

    private String orderStatus;

    private String orderType;

   
    private Integer userId;

    private String orderPhone;

   
    private String orderAddr;

   
    private Integer drugRecycleSiteId;

    
    private String drugRecycleSiteName;

    
    private Integer recycleCount;

    
    private Double totalDrugPrice;

   
    private Double cashCoupon;

    
    private Date gmtCreate;

   
    private Date gmtModified;

   
    private Date orderTime;

    
    private Date orderCompleteTime;

    private Date closeOrderTime;

    private String isActivity;

    
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column drug_order.order_id
     *
     * @return the value of drug_order.order_id
     *
     * @mbggenerated Tue Jul 25 16:54:12 CST 2017
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column drug_order.order_id
     *
     * @param orderId the value for drug_order.order_id
     *
     * @mbggenerated Tue Jul 25 16:54:12 CST 2017
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column drug_order.order_status
     *
     * @return the value of drug_order.order_status
     *
     * @mbggenerated Tue Jul 25 16:54:12 CST 2017
     */
    public String getOrderStatus() {
        return orderStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column drug_order.order_status
     *
     * @param orderStatus the value for drug_order.order_status
     *
     * @mbggenerated Tue Jul 25 16:54:12 CST 2017
     */
    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus == null ? null : orderStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column drug_order.order_type
     *
     * @return the value of drug_order.order_type
     *
     * @mbggenerated Tue Jul 25 16:54:12 CST 2017
     */
    public String getOrderType() {
        return orderType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column drug_order.order_type
     *
     * @param orderType the value for drug_order.order_type
     *
     * @mbggenerated Tue Jul 25 16:54:12 CST 2017
     */
    public void setOrderType(String orderType) {
        this.orderType = orderType == null ? null : orderType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column drug_order.user_id
     *
     * @return the value of drug_order.user_id
     *
     * @mbggenerated Tue Jul 25 16:54:12 CST 2017
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column drug_order.user_id
     *
     * @param userId the value for drug_order.user_id
     *
     * @mbggenerated Tue Jul 25 16:54:12 CST 2017
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column drug_order.order_phone
     *
     * @return the value of drug_order.order_phone
     *
     * @mbggenerated Tue Jul 25 16:54:12 CST 2017
     */
    public String getOrderPhone() {
        return orderPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column drug_order.order_phone
     *
     * @param orderPhone the value for drug_order.order_phone
     *
     * @mbggenerated Tue Jul 25 16:54:12 CST 2017
     */
    public void setOrderPhone(String orderPhone) {
        this.orderPhone = orderPhone == null ? null : orderPhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column drug_order.order_addr
     *
     * @return the value of drug_order.order_addr
     *
     * @mbggenerated Tue Jul 25 16:54:12 CST 2017
     */
    public String getOrderAddr() {
        return orderAddr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column drug_order.order_addr
     *
     * @param orderAddr the value for drug_order.order_addr
     *
     * @mbggenerated Tue Jul 25 16:54:12 CST 2017
     */
    public void setOrderAddr(String orderAddr) {
        this.orderAddr = orderAddr == null ? null : orderAddr.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column drug_order.drug_recycle_site_id
     *
     * @return the value of drug_order.drug_recycle_site_id
     *
     * @mbggenerated Tue Jul 25 16:54:12 CST 2017
     */
    public Integer getDrugRecycleSiteId() {
        return drugRecycleSiteId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column drug_order.drug_recycle_site_id
     *
     * @param drugRecycleSiteId the value for drug_order.drug_recycle_site_id
     *
     * @mbggenerated Tue Jul 25 16:54:12 CST 2017
     */
    public void setDrugRecycleSiteId(Integer drugRecycleSiteId) {
        this.drugRecycleSiteId = drugRecycleSiteId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column drug_order.drug_recycle_site_name
     *
     * @return the value of drug_order.drug_recycle_site_name
     *
     * @mbggenerated Tue Jul 25 16:54:12 CST 2017
     */
    public String getDrugRecycleSiteName() {
        return drugRecycleSiteName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column drug_order.drug_recycle_site_name
     *
     * @param drugRecycleSiteName the value for drug_order.drug_recycle_site_name
     *
     * @mbggenerated Tue Jul 25 16:54:12 CST 2017
     */
    public void setDrugRecycleSiteName(String drugRecycleSiteName) {
        this.drugRecycleSiteName = drugRecycleSiteName == null ? null : drugRecycleSiteName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column drug_order.recycle_count
     *
     * @return the value of drug_order.recycle_count
     *
     * @mbggenerated Tue Jul 25 16:54:12 CST 2017
     */
    public Integer getRecycleCount() {
        return recycleCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column drug_order.recycle_count
     *
     * @param recycleCount the value for drug_order.recycle_count
     *
     * @mbggenerated Tue Jul 25 16:54:12 CST 2017
     */
    public void setRecycleCount(Integer recycleCount) {
        this.recycleCount = recycleCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column drug_order.total_drug_price
     *
     * @return the value of drug_order.total_drug_price
     *
     * @mbggenerated Tue Jul 25 16:54:12 CST 2017
     */
    public Double getTotalDrugPrice() {
        return totalDrugPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column drug_order.total_drug_price
     *
     * @param totalDrugPrice the value for drug_order.total_drug_price
     *
     * @mbggenerated Tue Jul 25 16:54:12 CST 2017
     */
    public void setTotalDrugPrice(Double totalDrugPrice) {
        this.totalDrugPrice = totalDrugPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column drug_order.cash_coupon
     *
     * @return the value of drug_order.cash_coupon
     *
     * @mbggenerated Tue Jul 25 16:54:12 CST 2017
     */
    public Double getCashCoupon() {
        return cashCoupon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column drug_order.cash_coupon
     *
     * @param cashCoupon the value for drug_order.cash_coupon
     *
     * @mbggenerated Tue Jul 25 16:54:12 CST 2017
     */
    public void setCashCoupon(Double cashCoupon) {
        this.cashCoupon = cashCoupon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column drug_order.gmt_create
     *
     * @return the value of drug_order.gmt_create
     *
     * @mbggenerated Tue Jul 25 16:54:12 CST 2017
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column drug_order.gmt_create
     *
     * @param gmtCreate the value for drug_order.gmt_create
     *
     * @mbggenerated Tue Jul 25 16:54:12 CST 2017
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column drug_order.gmt_modified
     *
     * @return the value of drug_order.gmt_modified
     *
     * @mbggenerated Tue Jul 25 16:54:12 CST 2017
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column drug_order.gmt_modified
     *
     * @param gmtModified the value for drug_order.gmt_modified
     *
     * @mbggenerated Tue Jul 25 16:54:12 CST 2017
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column drug_order.order_time
     *
     * @return the value of drug_order.order_time
     *
     * @mbggenerated Tue Jul 25 16:54:12 CST 2017
     */
    public Date getOrderTime() {
        return orderTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column drug_order.order_time
     *
     * @param orderTime the value for drug_order.order_time
     *
     * @mbggenerated Tue Jul 25 16:54:12 CST 2017
     */
    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column drug_order.order_complete_time
     *
     * @return the value of drug_order.order_complete_time
     *
     * @mbggenerated Tue Jul 25 16:54:12 CST 2017
     */
    public Date getOrderCompleteTime() {
        return orderCompleteTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column drug_order.order_complete_time
     *
     * @param orderCompleteTime the value for drug_order.order_complete_time
     *
     * @mbggenerated Tue Jul 25 16:54:12 CST 2017
     */
    public void setOrderCompleteTime(Date orderCompleteTime) {
        this.orderCompleteTime = orderCompleteTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column drug_order.close_order_time
     *
     * @return the value of drug_order.close_order_time
     *
     * @mbggenerated Tue Jul 25 16:54:12 CST 2017
     */
    public Date getCloseOrderTime() {
        return closeOrderTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column drug_order.close_order_time
     *
     * @param closeOrderTime the value for drug_order.close_order_time
     *
     * @mbggenerated Tue Jul 25 16:54:12 CST 2017
     */
    public void setCloseOrderTime(Date closeOrderTime) {
        this.closeOrderTime = closeOrderTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column drug_order.is_activity
     *
     * @return the value of drug_order.is_activity
     *
     * @mbggenerated Tue Jul 25 16:54:12 CST 2017
     */
    public String getIsActivity() {
        return isActivity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column drug_order.is_activity
     *
     * @param isActivity the value for drug_order.is_activity
     *
     * @mbggenerated Tue Jul 25 16:54:12 CST 2017
     */
    public void setIsActivity(String isActivity) {
        this.isActivity = isActivity == null ? null : isActivity.trim();
    }
}