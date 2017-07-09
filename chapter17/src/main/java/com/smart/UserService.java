package com.smart;

import com.smart.domain.User;
import org.springframework.stereotype.Service;

/**
 * @author jerry
 * @create 17/7/3 17:02
 */
//业务层
@Service
public class UserService {

    public void createUser(User user) {
        System.out.println("save user.");
    }

    public User getUserById(String userId) {
        User user = new User();
        user.setUserId(userId);
        user.setUserName("test");
        return user;
    }
}
