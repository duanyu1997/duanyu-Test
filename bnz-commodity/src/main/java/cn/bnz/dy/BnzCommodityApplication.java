package cn.bnz.dy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@MapperScan("cn.bnz.dy.dao.mapper")
@EnableEurekaClient
public class BnzCommodityApplication {

    public static void main(String[] args) {
        SpringApplication.run(BnzCommodityApplication.class, args);
    }

}
