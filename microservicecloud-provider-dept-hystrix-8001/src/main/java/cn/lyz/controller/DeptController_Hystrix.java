package cn.lyz.controller;


import cn.lyz.entity.Dept;
import cn.lyz.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeptController_Hystrix {

    @Autowired
    private DeptService service ;

    @RequestMapping("/dept/get/{id}")
    @HystrixCommand(fallbackMethod = "hystrixOfGet")
    public Dept get(@PathVariable("id") Integer id){
        Dept dept = service.get(id) ;
        if(dept == null){
            throw new RuntimeException("用户不存在");
        }
        return dept ;

    }

    public Dept hystrixOfGet(@PathVariable("id") Integer id){
        return new Dept().setDeptno(id).setDname("不存在").setDb_source("No such database in mysql") ;
    }
}
