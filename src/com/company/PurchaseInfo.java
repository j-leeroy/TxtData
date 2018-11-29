package com.company;

import java.util.Date;

public class PurchaseInfo {

    private Date date;
    private String orderID;
    private String sku;
    private String transactionType;
    private String paymentType;
    private String paymentDetail;
    private double amount;
    private int quantity;
    private String productTitle;

    public PurchaseInfo(Date date, String orderID, String sku, String transactionType, String paymentType, String paymentDetail, double amount, int quantity, String productTitle) {
        this.date = date;
        this.orderID = orderID;
        this.sku = sku;
        this.transactionType = transactionType;
        this.paymentType = paymentType;
        this.paymentDetail = paymentDetail;
        this.amount = amount;
        this.quantity = quantity;
        this.productTitle = productTitle;
    }
    //This constructor gets called when record does not have a quantity amount
    public PurchaseInfo(Date date, String orderID, String sku, String transactionType, String paymentType, String paymentDetail, double amount) {
        this.date = date;
        this.orderID = orderID;
        this.sku = sku;
        this.transactionType = transactionType;
        this.paymentType = paymentType;
        this.paymentDetail = paymentDetail;
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getPaymentDetail() {
        return paymentDetail;
    }

    public void setPaymentDetail(String paymentDetail) {
        this.paymentDetail = paymentDetail;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getProductTitle() {
        return productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }



}
