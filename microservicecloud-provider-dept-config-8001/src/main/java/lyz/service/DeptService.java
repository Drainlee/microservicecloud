package lyz.service;

import cn.lyz.entity.Dept;

import java.util.List;


public interface DeptService {
    public boolean add(Dept dept);

    public Dept get(Integer id);

    public List<Dept> list();
}
