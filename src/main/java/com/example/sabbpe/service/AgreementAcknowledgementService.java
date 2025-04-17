package com.example.sabbpe.service;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class AgreementAcknowledgementService {

    @Autowired
    private JavaMailSender mailSender;
    
    private Logger log = org.slf4j.LoggerFactory.getLogger(AgreementAcknowledgementService.class);
    public String sendEmail() {
        SimpleMailMessage message = new SimpleMailMessage();
  
        message.setFrom("geetishadevre247@gmail.com");
        message.setTo("alamcta@gmail.com");
        message.setSubject("Agreement Signed Successfully");
        message.setText("Hi,PFA for the agreement esign");

        mailSender.send(message);
        log.info("mail sent successfully");
        return "mail sent successfully";

    }
}
