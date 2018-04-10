package com.boce.mybatis.web;


import com.baomidou.mybatisplus.plugins.Page;
import com.boce.mybatis.entity.User;
import com.boce.mybatis.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author yangxc123
 * @since 2018-04-10
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;

    @RequestMapping("/test")
    public Page<User> test() {
        return userService.selectPage(new Page<User>(0, 3));
    }

    /**
     * AR 部分测试
     */
    @RequestMapping("/test1")
    public Page<User> test1() {
        User user = new User();
        user.setName("nihao");
        user.setCreatetime(new Date());
        user.insert();

        System.err.println("查询插入结果：" + user.selectById().toString());

        user.setName("mybatis-plus-ar");
        System.err.println("更新：" + user.updateById());
        return user.selectPage(new Page<User>(0, 3), null);
    }

}

