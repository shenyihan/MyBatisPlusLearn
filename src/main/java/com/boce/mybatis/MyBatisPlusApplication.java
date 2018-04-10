package com.boce.mybatis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author yangxc
 * @version V1.0
 * @Description:
 * @date 2018/4/9
 * @Copyright: www.boce.cn
 */
@SpringBootApplication
public class MyBatisPlusApplication {
    public static void main( String[] args )
    {
        SpringApplication.run(MyBatisPlusApplication.class, args);
        System.out.println("================hello MyBatisPlusApplication====================");
    }
}
