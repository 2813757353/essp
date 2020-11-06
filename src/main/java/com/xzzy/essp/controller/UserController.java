package com.xzzy.essp.controller;

import com.xzzy.essp.bean.Result;
import com.xzzy.essp.bean.User;
import com.xzzy.essp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * projectName: essp
 *
 * @author: 王子琦
 * time: 2020/11/6 20:40
 * description:用户控制器
 */
@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("getUserById")
    public Result getUserById(User user){
        Result result=userService.getUserById(user);
        return result;
    }
    @PostMapping("login")
    public Result login(User user){
        Result result=userService.login(user);
        return result;
    }
    @PostMapping("sign")
    public Result sign(User user){
        Result result=userService.sign(user);
        return result;
    }

}
