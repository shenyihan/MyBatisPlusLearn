package com.boce.mybatis.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.boce.mybatis.entity.Student;
import com.boce.mybatis.mapper.StudentMapper;
import com.boce.mybatis.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author yangxc
 * @version V1.0
 * @Description:
 * @date 2018/4/9
 * @Copyright: www.boce.cn
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper,Student> implements StudentService  {

    @Resource
    private StudentMapper studentMapper;

    @Override
    public boolean deleteAll() {
        return retBool(baseMapper.deleteAll());
    }

    @Override
    public List<Map<String, Object>> list() {
        return baseMapper.list();
    }
    @Override
    public List<Map<String, Object>> list2() {
        return studentMapper.list();
    }
}
