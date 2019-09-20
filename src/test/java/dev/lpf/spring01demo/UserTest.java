package dev.lpf.spring01demo;

import dev.lpf.demo.aop.user.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserTest {
    @Autowired
    private UserService userService;

    @Test
    public void getUserById() {
        try {
            System.out.println(userService.getUserById((long)234243));
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
