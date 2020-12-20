package cn.chang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.chang.mapper")
public class ApiControllerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiControllerApplication.class, args);
    }

}
