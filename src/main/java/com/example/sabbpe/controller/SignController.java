package com.example.sabbpe.controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import AgreementEsign.ResponseUrl;
import AgreementEsign.SignRequest;

import com.example.sabbpe.DTO.AgreementDTO;
import com.example.sabbpe.service.SignService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/sign")
public class SignController {

    @Autowired
    private SignService signService;

    @PostMapping("/agree")
    public ResponseEntity<String> sendEsign(@RequestBody SignRequest signRequest) {
        return signService.sendSignRequest(signRequest);
    	
    }
    
    @PostMapping("/ping")
    public ResponseEntity<String> responseURL(@RequestBody ResponseUrl response) {
        // Convert the object to a string (if that's what you want to return)
        String responseBody = response.toString();

        // Return a proper ResponseEntity with String body
        return ResponseEntity.status(HttpStatus.OK).body(responseBody);
    }

}