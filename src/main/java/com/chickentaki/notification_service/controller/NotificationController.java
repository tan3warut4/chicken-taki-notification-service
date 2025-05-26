package com.chickentaki.notification_service.controller;

import com.chickentaki.notification_service.dto.QrGenerateRequest;
import com.chickentaki.notification_service.dto.QrGenerateResponse;
import com.chickentaki.notification_service.dto.QrStatusRequest;
import com.chickentaki.notification_service.dto.QrStatusResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.chickentaki.notification_service.service.NotificationService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@RestController // Marks this class as a REST Controller
@RequestMapping("/v1") // Base path for all endpoints in this controller
public class NotificationController {

    private static final Logger log = LoggerFactory.getLogger(NotificationController.class);

    private final NotificationService notificationService;

    @Autowired // Spring will inject an instance of NotificationService
    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    // POST /v1/qr-generate
    @PostMapping("/qr-generate")
    public ResponseEntity<QrGenerateResponse> generateQrCode(@RequestBody QrGenerateRequest request) {
        log.info("API call received: POST /v1/qr-generate with request: {}", request);
        QrGenerateResponse response = notificationService.generateQrCode(request);
        return new ResponseEntity<>(response, HttpStatus.OK); // Or HttpStatus.CREATED if preferred for generation
    }

    @PostMapping("/qr-status")
    public ResponseEntity<QrStatusResponse> checkQrCodeStatus(@RequestBody QrStatusRequest request){
        log.info("API call received: POST /v1/qr-status with request: {}", request);
        QrStatusResponse response = notificationService.checkQrCodeStatus(request);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
