package com.example.HelloWorldWeb.unitetests;

import com.example.HelloWorldWeb.HelloWorldWebApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.*;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;
import static org.springframework.http.HttpStatus.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {HelloWorldWebApplication.class}, webEnvironment = RANDOM_PORT)
public class HelloWorldUnitTest {

    @Autowired
    TestRestTemplate restTemplate;

    @Test
    public void testHelloWorld() {
        ResponseEntity<String> responseEntity = restTemplate.getForEntity("/hello", String.class);
        assertThat(responseEntity.getStatusCode()).isEqualTo(OK);
        assertThat(responseEntity.getBody()).isEqualTo("Failing this test");
    }
}
