package com.example.sabbpe.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

import com.example.sabbpe.DTO.AgreementDTO;

import AgreementEsign.SignRequest;

@Service
public class SignService {

    @Autowired
    private RestTemplate restTemplate;

   public ResponseEntity<String> sendSignRequest(SignRequest request) {
        String url = "https://test.zoop.one/contract/esign/v5/init";
    
     HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("app-id", 
        		"6639f27f6b65030028e3ff56");
        headers.set("api-key", "FY37WQX-Z3MMYC2-MF46Q4F-3445VJQ");

       HttpEntity<SignRequest> entity = new HttpEntity<>(request, headers);

       try {
           // your logic
           ResponseEntity<String> response = restTemplate.postForEntity(url, entity, String.class);
           return response; // ✅ return the response
       } catch (HttpServerErrorException e) {
           // log and return the error
           return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                   .body("API call failed: " + e.getResponseBodyAsString());
       }

  }
    }
