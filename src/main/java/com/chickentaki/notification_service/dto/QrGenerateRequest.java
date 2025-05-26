package com.chickentaki.notification_service.dto;

public class QrGenerateRequest {
    private String orderId;
    private Double amount;
    private String currencyCode;

    public QrGenerateRequest(){
    }
    public QrGenerateRequest(String orderId, Double amount, String currencyCode){
        this.orderId = orderId;
        this.amount = amount;
        this.currencyCode = currencyCode;
    }
    // getter setter

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }
    @Override
    public String toString(){
        return "QRGenerateRequest{"+"OrderID = "+ orderId+'\'' +
                ", amount=" + amount +
                ", currencyCode='" + currencyCode + '\'' +
                '}';
    }
}
