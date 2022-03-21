package ru.usb.restlientssl.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ru.usb.restlientssl.config.SslConfiguration;

@Service
public class ServiceTemplate {

    Logger logger = LoggerFactory.getLogger(ServiceTemplate.class);

    @Autowired
    SslConfiguration sslConfiguration;
    @Autowired private RestTemplate restTemplateWithTrustStore;
    String fooResourceUrl = "https://127.0.0.1:8443";

    public void getTestSSL(){
        ResponseEntity<String> response
                = restTemplateWithTrustStore.getForEntity(fooResourceUrl + "/hello", String.class);

        System.out.println("Request >>>> ");
        System.out.println("<<<<<Response");
        System.out.println("getTestSSL:response :: "+response);
        System.out.println("body :: "+response.getBody());
        System.out.println("----");
    }


}
