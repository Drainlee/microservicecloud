package cn.lyz;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@EnableAutoConfiguration
@ComponentScan(value = "cn.lyz")
public class DeptProvider8003 {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8003.class,args) ;
    }
}
