package com.chickentaki.notification_service.dto;

public class QrGenerateResponse {
    private String qrCodeData;
    private String transactionId;
    private String status;
    public QrGenerateResponse(){

    }
    public QrGenerateResponse(String qrCodeData, String transactionId, String status){
        this.qrCodeData = qrCodeData;
        this.transactionId = transactionId;
        this.status = status;
    }

    public String getQrCodeData() {
        return qrCodeData;
    }

    public void setQrCodeData(String qrCodeData) {
        this.qrCodeData = qrCodeData;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    @Override
    public String toString() {
        return "QrGenerateResponse{" +
                "qrCodeData='" + qrCodeData + '\'' +
                ", transactionId='" + transactionId + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
