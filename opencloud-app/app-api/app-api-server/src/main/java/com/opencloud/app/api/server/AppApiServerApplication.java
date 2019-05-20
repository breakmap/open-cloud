package com.opencloud.app.api.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = {"com.opencloud"})
@SpringBootApplication(scanBasePackages = "com.opencloud")
@EnableDiscoveryClient
public class AppApiServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppApiServerApplication.class, args);
    }

}
