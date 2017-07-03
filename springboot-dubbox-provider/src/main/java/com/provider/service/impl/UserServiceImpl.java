package com.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.domain.User;
import com.provider.service.IUserService;

/**
 * 用户服务接口实现
 * Created by wangyong on 2017/7/2.
 */
@Service(version = "1.0.0", group = "userGroup",
        interfaceClass = IUserService.class)
public class UserServiceImpl implements IUserService {

    @Override
    public User getUser() {
        User user = new User();
        user.setUserName("admin");
        user.setEmail("admin@126.com");
        return user;
    }
}
