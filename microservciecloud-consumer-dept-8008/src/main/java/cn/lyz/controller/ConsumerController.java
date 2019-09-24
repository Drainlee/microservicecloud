package cn.lyz.controller;

import cn.lyz.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.config.client.ConfigClientProperties;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class ConsumerController {

    //private static final String REST_URL_PREFIX = "http://localhost:8001" ;
    private static final String REST_URL_PREFIX = "http://MICROSERVICECLOUD-DEPT" ;

    @Autowired
    private RestTemplate restTemplate ;
    @Autowired
    private DiscoveryClient client ;

    @RequestMapping(value = "/consumer/dept/add")
    public boolean add(Dept dept){
        return restTemplate.postForObject(REST_URL_PREFIX+"/dept/add",dept,Boolean.class);
    }

    @RequestMapping(value = "/consumer/dept/list")
    public List<Dept> get(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/list",List.class) ;
    }

    @RequestMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Integer id){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/get/"+id,Dept.class) ;
    }

    @RequestMapping("/consumer/dept/client")
    public Object discovery(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/client",Object.class) ;
    }
}
