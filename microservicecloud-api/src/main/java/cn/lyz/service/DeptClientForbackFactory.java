package cn.lyz.service;

import cn.lyz.entity.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class DeptClientForbackFactory implements FallbackFactory<DeptClientService> {
    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public Dept get(Integer id) {
                return new Dept().setDeptno(id).setDname("该服务id"+id+"服务提供者已经停止服务，请从其他服务提供者索取服务").setDb_source("no such databse in mysql!");
            }

            @Override
            public List<Dept> list() {
                return null;
            }

            @Override
            public boolean add(Dept dept) {
                return false;
            }
        };
    }
}
