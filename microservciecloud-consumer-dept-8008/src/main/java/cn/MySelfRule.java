package cn;


import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration                     //相当于spring中的applicationContext.xml文件
public class MySelfRule {

    @Bean
    public IRule iRule() {
       // return new RoundRobinRule() ;
        return new RoundRobinRule_LYZ() ;
    }
}
