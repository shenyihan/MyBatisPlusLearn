package com.boce.mybatis.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.boce.mybatis.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author yangxc
 * @version V1.0
 * @Description:
 * @date 2018/4/9
 * @Copyright: www.boce.cn
 */
@Repository
public interface StudentMapper extends BaseMapper<Student> {
    /**
     * 自定义注入方法
     */
    int deleteAll();

    List<Map<String, Object>> list();
}
