package ru.usb.restlientssl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.usb.restlientssl.service.ServiceTemplate;

/*
https://java-online.ru/keystore-keytool.xhtml
http://itech-notes.blogspot.com/2013/02/keytool.html
https://javascopes.com/disable-skip-ssl-validation-in-springboot-resttemplate-1ec2-6355f5ca/
*
*/


@SpringBootApplication
public class RestlientsslApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(RestlientsslApplication.class, args);
    }

    @Autowired
    ServiceTemplate serviceTemplate;

    @Override
    public void run(String... args) throws Exception {
        serviceTemplate.getTestSSL();
    }
}
