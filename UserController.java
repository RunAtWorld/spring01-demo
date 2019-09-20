
package dev.lpf.demo.aop.user.controller;

import dev.lpf.demo.aop.user.model.User;
import dev.lpf.demo.aop.user.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(value = "/{id}")
    public User getUserById(@PathVariable(value = "id") Long id) throws Exception {
        return userService.getUserById(id);
    }
}
