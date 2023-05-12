package com.yangnan.reggie;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@Slf4j
@SpringBootApplication
@ServletComponentScan
public class ReggieApplication {
    public static void main(String[] args) {
        SpringApplication.run(ReggieApplication.class,args);
        //log.info("项目启动成功");
        log.info("http://localhost:8080/backend/page/login/login.html");
    }

    //解决清空空闲60秒以上的连接，导致”discard long time none received connection“的问题
    static {
        System.setProperty("druid.mysql.usePingMethod","false");
    }
}
