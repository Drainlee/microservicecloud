package cn.lyz;

import cn.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
@EnableDiscoveryClient
@RibbonClient(name = "MICROSERVICECLOUD-DEPT",configuration = MySelfRule.class)
public class DeptConsumer80_consumer {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80_consumer.class,args) ;
    }

}
