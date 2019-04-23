package com.geeksword.sword.consul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author vbisowen
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SwordConsulCenterApplication {

  public static void main(String[] args) {
    SpringApplication.run(SwordConsulCenterApplication.class, args);
  }

}
