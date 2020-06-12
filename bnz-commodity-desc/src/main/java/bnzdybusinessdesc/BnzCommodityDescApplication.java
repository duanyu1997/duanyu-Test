package bnzdybusinessdesc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@MapperScan("bnzdybusinessdesc.mapper")
@EnableEurekaClient
public class BnzCommodityDescApplication {

    public static void main(String[] args) {
        SpringApplication.run(BnzCommodityDescApplication.class, args);
    }

}
