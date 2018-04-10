package com.boce.mybatis.service;

import com.baomidou.mybatisplus.service.IService;
import com.boce.mybatis.entity.Student;

import java.util.List;
import java.util.Map;

/**
 * @author yangxc
 * @version V1.0
 * @Description:
 * @date 2018/4/9
 * @Copyright: www.boce.cn
 */
public interface StudentService extends IService<Student> {
    boolean deleteAll();
    List<Map<String, Object>> list();
    List<Map<String, Object>> list2();
}
