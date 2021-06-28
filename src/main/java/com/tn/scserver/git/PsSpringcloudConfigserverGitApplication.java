package com.tn.scserver.git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
/**
 * Pluralsight: Java Microservices with Spring Cloud: Developing Services
 * */
@EnableConfigServer
@SpringBootApplication
public class PsSpringcloudConfigserverGitApplication {

    public static void main(String[] args) {
        SpringApplication.run(PsSpringcloudConfigserverGitApplication.class, args);
    }

}
