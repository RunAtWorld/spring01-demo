
package dev.lpf.demo.aop.user.service;

import dev.lpf.demo.aop.user.model.User;
import dev.lpf.demo.aop.user.mapper.UserMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User getUserById(Long id) throws Exception {
        User user = userMapper.selectByPrimaryKey(id);
        if (null == user) {
            throw new Exception("空指针 错误");
        }
        return user;
    }
}
