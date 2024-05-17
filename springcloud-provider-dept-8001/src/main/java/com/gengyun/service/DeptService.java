package com.gengyun.service;

import com.gengyun.pojo.Dept;

import java.util.List;

public interface DeptService {
    //增加一个部门
    boolean addDept(Dept dept);
 
    //根据id查询部门信息
    Dept queryById(Long id);
 
    //查询所有的部门信息
    List<Dept> queryAll();
}