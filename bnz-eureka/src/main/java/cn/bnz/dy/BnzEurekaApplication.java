package cn.bnz.dy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BnzEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(BnzEurekaApplication.class, args);
    }

}
