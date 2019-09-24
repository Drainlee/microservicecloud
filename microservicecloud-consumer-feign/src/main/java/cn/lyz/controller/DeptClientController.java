package cn.lyz.controller;


import cn.lyz.entity.Dept;

import cn.lyz.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptClientController {


    @Autowired
    private DeptClientService deptClientService ;

    @RequestMapping(value = "/consumer/dept/add")
    public boolean add(Dept dept){
        return deptClientService.add(dept) ;
    }

    @RequestMapping(value = "/consumer/dept/list",method = RequestMethod.GET)
    public List<Dept> get(){
        return deptClientService.list() ;
    }

    @RequestMapping(value = "/consumer/dept/get/{id}",method = RequestMethod.GET)
    public Dept get(@PathVariable("id") Integer id){
        return deptClientService.get(id) ;
    }
//
//    @RequestMapping("/consumer/dept/client")
//    public Object discovery(){
//        return deptClientService
//    }
}
