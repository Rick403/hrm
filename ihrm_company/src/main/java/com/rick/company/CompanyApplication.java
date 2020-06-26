package com.rick.company;

import com.rick.common.utils.IdWorker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;

// springboot 包扫描
@SpringBootApplication(scanBasePackages = "com.rick.company")
// jpa注解扫描
@EntityScan("com.rick.domain.company")
public class CompanyApplication {
    // 启动方法
    public static void main(String[] args) {
        SpringApplication.run(CompanyApplication.class,args);
    }

    @Bean
    public IdWorker idWorker(){
        return new IdWorker(1,1);
    }
}
