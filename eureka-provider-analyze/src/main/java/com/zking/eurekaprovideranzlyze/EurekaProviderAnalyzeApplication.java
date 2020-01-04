package com.zking.eurekaprovideranzlyze;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableEurekaClient
@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.zking.eurekaprovideranzlyze.mapper")
@EnableScheduling
public class EurekaProviderAnalyzeApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaProviderAnalyzeApplication.class, args);
    }

}