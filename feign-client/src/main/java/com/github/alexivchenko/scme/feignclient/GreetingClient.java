package com.github.alexivchenko.scme.feignclient;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Alex Ivchenko
 */
@FeignClient("eureka-client")
interface GreetingClient {
    @GetMapping("/hello")
    String hello(@RequestParam(value = "name", required = false) String name);
}
