package com.civen.civen_stumanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class CivenStuManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CivenStuManagerApplication.class, args);
    }

}
