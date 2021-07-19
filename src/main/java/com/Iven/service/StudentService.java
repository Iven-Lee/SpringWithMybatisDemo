package com.Iven.service;
//业务逻辑层，具体需要实现的业务

import com.Iven.sqlName.SqlName;

import java.util.List;

public interface StudentService {
    //添加学生
    int addStudent(SqlName sqlName);
    //查询学生
    List<SqlName> queryStudents();

}
