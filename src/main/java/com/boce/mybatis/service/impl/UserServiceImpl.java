package com.boce.mybatis.service.impl;

import com.boce.mybatis.entity.User;
import com.boce.mybatis.mapper.UserMapper;
import com.boce.mybatis.service.IUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yangxc123
 * @since 2018-04-10
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
