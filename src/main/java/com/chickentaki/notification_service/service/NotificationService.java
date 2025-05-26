package com.chickentaki.notification_service.service;
import com.chickentaki.notification_service.dto.QrGenerateRequest;
import com.chickentaki.notification_service.dto.QrGenerateResponse;
import com.chickentaki.notification_service.dto.QrStatusRequest;
import com.chickentaki.notification_service.dto.QrStatusResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.UUID;

import static java.util.UUID.*;

@Service
public class NotificationService {
        private static final Logger log = LoggerFactory.getLogger(NotificationService.class);

        public QrGenerateResponse generateQrCode(QrGenerateRequest request){
            log.info("Dummy QR generation request received for orderId: {}", request.getOrderId());
            String dummyQrData = "DUMMY_QR_DATA"+request.getOrderId()+"_"+System.currentTimeMillis();
            String transactionId = "TXN_" + UUID.randomUUID().toString().substring(0, 8);

            return new QrGenerateResponse(dummyQrData,transactionId,"Success");
        }

        public QrStatusResponse checkQrCodeStatus(QrStatusRequest request){
            log.info("Dummy QR status check request for transactionId: {}", request.getTransactionId());

            String dummyStatus = "PENDING";
            String dummyMessage = "PAYMENT PENDING FOR TRANSACTION";
            return new QrStatusResponse(request.getTransactionId(), dummyStatus, dummyMessage);
        }
}
