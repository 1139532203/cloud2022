package com.lgl.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author lgl
 * @date 2022/9/23-09-23
 */
@SpringBootApplication
public class EurekaServerApplication7001 {
    public static void main(String[] args) {
        System.out.println("begin"+System.currentTimeMillis());
        System.out.println("hot fix fist commit");
        System.out.println("hot fix commit");
        SpringApplication.run(EurekaServerApplication7001.class,args);
    }
}
