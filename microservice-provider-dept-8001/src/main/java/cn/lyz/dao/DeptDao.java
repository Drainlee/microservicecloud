package cn.lyz.dao;

import java.util.List ;

import cn.lyz.entity.Dept;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface DeptDao
{
	public boolean addDept(Dept dept);

	public Dept findById(Integer id);

	public List<Dept> findAll();
}
