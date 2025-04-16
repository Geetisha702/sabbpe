package com.example.sabbpe.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sabbpe.DTO.AgreementDTO;
import com.example.sabbpe.service.AgreementAcknowledgementService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class AgreementAcknowledgementController {

    @Autowired
    private AgreementAcknowledgementService agreementAcknowledgementService;
    private Logger log = org.slf4j.LoggerFactory.getLogger(AgreementAcknowledgementController.class);
    AgreementDTO request=new AgreementDTO();

    @PostMapping("/send-mail")
    public ResponseEntity<String>  sendMail(@RequestBody AgreementDTO signed) {
    	if(signed.getSigned().equals("true"))
    	{ agreementAcknowledgementService.sendEmail();
    	  log.info("mail sent successfully");
          return new ResponseEntity<>( agreementAcknowledgementService.sendEmail(),HttpStatus.OK);}
    	else
        return new ResponseEntity<>( "Agreement is not signed",HttpStatus.BAD_REQUEST);
    		
   
    }
}