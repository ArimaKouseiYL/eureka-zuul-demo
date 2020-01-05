package com.yilei.eurekazuulclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class EurekaZuulClientApplication {

    /**
     * @EnableZuulProxy 开启 Zuul
     */

    public static void main(String[] args) {
        SpringApplication.run(EurekaZuulClientApplication.class, args);
    }

}
