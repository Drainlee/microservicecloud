package lyz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableAutoConfiguration
//@EnableEurekaClient //本服务启动后会自动注册进eureka服务中
//@EnableDiscoveryClient //服务发现
@ComponentScan(value = "lyz")
@EnableDiscoveryClient
public class DeptProvider8001_App
{
	public static void main(String[] args)
	{
		SpringApplication.run(DeptProvider8001_App.class, args);
	}
}
