package com.Iven;

import static org.junit.Assert.assertTrue;

import com.Iven.service.StudentService;
import com.Iven.sqlName.SqlName;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * 插入操作
     */
    @Test
    public void testServiceInsert(){
        String config="applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        //获取spring容器中的dao对象
        StudentService service = (StudentService) ctx.getBean("studentService");
        SqlName sqlName = new SqlName();
        sqlName.setUserId(3);
        sqlName.setUserName("li");
        sqlName.setPword("789");
        sqlName.setSex("男");
        sqlName.setEmail("li@qq.com");
        int nums = service.addStudent(sqlName);
        //spring和mybatis整合在一起使用，事务是自动提交的。 无需执行SqlSession.commit();
        System.out.println("nums="+nums);
    }
    /**
     * 查询操作
     */
    @Test
    public void testServiceSelect(){

        String config="applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        //获取spring容器中的dao对象
        StudentService service = (StudentService) ctx.getBean("studentService");

        List<SqlName> students = service.queryStudents();
        for (SqlName stu:students){
            System.out.println(stu);
        }
    }
}
