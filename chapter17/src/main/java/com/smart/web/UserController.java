package com.smart.web;

import com.smart.UserService;
import com.smart.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author jerry
 * @create 17/7/3 16:43
 */

//使用UserController成为处理请求的控制器; 处理来自/user URL的请求
@Controller
@RequestMapping("/user")
public class UserController {


    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    //处理/user的请求,不过请求的方法为POST
    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView createUser(User user) {
        userService.createUser(user);
        ModelAndView mav = new ModelAndView();
        mav.setViewName("user/createSuccess");
        mav.addObject("user", user);

        return mav;
    }

    @RequestMapping("/register")
    public String register() {
        return "user/register";
    }


}
