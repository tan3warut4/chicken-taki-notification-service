package com.chickentaki.notification_service.dto;

public class QrStatusRequest {
    private String transactionId;

    public QrStatusRequest(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    @Override
    public String toString() {
        return "QrStatusRequest{" +
                "transactionID='" + transactionId + '\'' +
                '}';
    }
}
