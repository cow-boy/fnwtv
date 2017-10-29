package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
// mapper 接口类扫描包配置
@MapperScan("com.tv.dao")
@EnableSwagger2
public class FnwtvLiveServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FnwtvLiveServiceApplication.class, args);
	}
}
