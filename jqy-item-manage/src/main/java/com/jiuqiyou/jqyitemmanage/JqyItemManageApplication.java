package com.jiuqiyou.jqyitemmanage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jiuqiyou.jqyitemmanage.mapper")
public class JqyItemManageApplication {

    public static void main(String[] args) {
        SpringApplication.run(JqyItemManageApplication.class, args);
    }

}
