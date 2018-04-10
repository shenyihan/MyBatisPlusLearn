package com.boce.mybatis.controller;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.boce.mybatis.entity.Student;
import com.boce.mybatis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author yangxc
 * @version V1.0
 * @Description:
 * @date 2018/4/9
 * @Copyright: www.boce.cn
 */
@RestController
@RequestMapping("/student")
public class Studentcontroller {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/test")
    public Page<Student> test() {
        return studentService.selectPage(new Page<Student>(0, 3));
    }

    /**
     * AR 部分测试
     */
    @RequestMapping("/test1")
    public Page<Student> test1() {
        Student user = new Student("testAr", new Date());
        user.insert();

        System.err.println("查询插入结果：" + user.selectById().toString());

        user.setStuName("mybatis-plus-ar");
        System.err.println("更新：" + user.updateById());
        return user.selectPage(new Page<Student>(0, 3), null);
    }

    /**
     * 增删改查 CRUD
     */
    @Transactional
    @GetMapping("/test2")
    public Student test2() {
        System.err.println("删除一条数据：" + studentService.deleteById(1));
        System.err.println("deleteAll：" + studentService.deleteAll());
        //System.err.println("插入一条数据：" + studentService.insert(new Student("张三", new Date())));
        Student user = new Student("张三", new Date());
        boolean result = studentService.insert(user);
        // 自动回写的ID
        int id = user.getId();
        System.err.println("插入一条数据：" + result + ", 插入信息：" + user.toString());
        System.err.println("查询：" + studentService.selectById(id).toString());
        System.err.println("更新一条数据：" + studentService.updateById(new Student( "三毛", new Date())));
        for (int i = 0; i < 5; ++i) {
            studentService.insert(new Student( "张三" + i, new Date()));
        }
        return studentService.selectById(1);
    }

    @GetMapping("/like")
    public Object like() {
        JSONObject result = new JSONObject();
        Student user = new Student();
        //user.setStuName("三");
        result.put("result", studentService.selectList(new EntityWrapper<Student>(user).eq("stu_name","三")));
        return result;
    }

    @GetMapping("/getStudent1")
    public Object getStudent1() {
        JSONObject result = new JSONObject();
        result.put("result", studentService.list());
        return result;
    }

    @GetMapping("/getStudent")
    public Object getStudent() {
        JSONObject result = new JSONObject();
        result.put("result", studentService.list2());
        return result;
    }
}
