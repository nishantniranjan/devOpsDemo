package com.cg.devOpsDemo.controllers;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CustomControllerTest {
    @Autowired
    private CustomController customController;

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate testRestTemplate;


    @Test
    void contextLoads() {
        assertNotNull(customController, ()->"CustomController should not be null");
    }

    @Test
    public void responseShouldBeContainLoginPage(){
        assertTrue(testRestTemplate.getForObject("http://localhost:"+port,String.class).toLowerCase().contains("login page".toLowerCase()),
                ()->"Response should contain login page");
    }
}
