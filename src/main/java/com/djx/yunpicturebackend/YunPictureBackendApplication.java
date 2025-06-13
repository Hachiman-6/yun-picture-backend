package com.djx.yunpicturebackend;

import org.apache.shardingsphere.spring.boot.ShardingSphereAutoConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(exclude = {ShardingSphereAutoConfiguration.class}) //为了方便快速部署测试，暂时关闭分库分表
@MapperScan("com.djx.yunpicturebackend.mapper")
@EnableAspectJAutoProxy(exposeProxy = true)
@EnableAsync
@EnableTransactionManagement
public class YunPictureBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(YunPictureBackendApplication.class, args);
    }

}
