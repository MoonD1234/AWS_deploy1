package com.lec.spring;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class HomeControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;


    @Test
    void hellO(){
      ResponseEntity<String> response =  restTemplate.getForEntity("/aws/v1",String.class);
       assertEquals("<h2>AWS 배포 v1</h2>", response.getBody());
    }

















} // Test class end