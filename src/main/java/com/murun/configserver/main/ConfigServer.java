package com.murun.configserver.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@EnableConfigServer
@PropertySource("classpath:/properties/application.properties")

public class ConfigServer {

    public static void main(String[] arguments) {

        SpringApplication.run(ConfigServer.class, arguments);
    }
}