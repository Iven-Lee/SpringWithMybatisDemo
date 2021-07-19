package com.Iven.service;

import com.Iven.dao.StudentDao;
import com.Iven.sqlName.SqlName;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    //引用类型
    private StudentDao studentDao;

    //使用set注入，赋值
    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public int addStudent(SqlName sqlName) {
        int nums = studentDao.insertStudent(sqlName);
        return nums;
    }

    @Override
    public List<SqlName> queryStudents() {
        List<SqlName> students = studentDao.selectStudents();
        return students;
    }
}
