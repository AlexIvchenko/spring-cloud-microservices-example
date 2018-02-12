package com.github.alexivchenko.scme.feignclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@EnableFeignClients
@RestController
@SpringBootApplication
public class FeignClientApplication {
    private final GreetingClient greetingClient;

    public FeignClientApplication(GreetingClient greetingClient) {
        this.greetingClient = greetingClient;
    }

    public static void main(String[] args) {
        SpringApplication.run(FeignClientApplication.class, args);
    }

    @RequestMapping("/helloAndGoodbye")
    public String helloAndGoodbye(@RequestParam(value = "name", required = false) String name) {
        return greetingClient.hello(name) + " and goodbye";
    }
}
