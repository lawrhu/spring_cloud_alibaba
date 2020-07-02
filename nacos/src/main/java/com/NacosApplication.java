package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author:hujc
 * @description:
 * @date: 2020/6/17
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosApplication {

  public static void main(String[] args) {

    SpringApplication.run(NacosApplication.class, args);
  }
}
