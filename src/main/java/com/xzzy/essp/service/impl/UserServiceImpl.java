package com.xzzy.essp.service.impl;

import com.xzzy.essp.bean.Result;
import com.xzzy.essp.bean.User;
import com.xzzy.essp.mapper.UserMapper;
import com.xzzy.essp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * projectName: essp
 *
 * @author: 王子琦
 * time: 2020/11/6 20:50
 * description:用户服务实现类
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired(required = false)
    private UserMapper userMapper;

    @Override
    public Result getUserById(User user) {
        Result result=new Result();
        User user1=userMapper.getUserById(user);
        if (user1 == null) {
            result.setCode(0);
            result.setMassage("失败");
        }else{
            result.setCode(1);
            result.setMassage("成功");
            result.setData(user1);
        }
        return result;
    }

    @Override
    public Result login(User user) {
        Result result=new Result();
        User user1=userMapper.getUserById(user);
        System.out.println(user1);
        System.out.println(user);
        if(user1.getUserPassword().compareTo(user.getUserPassword())!=0){
            result.setCode(0);
            result.setMassage("账号或密码错误");
        }else{
            result.setCode(1);
            result.setMassage("登录成功");
            user1.setUserPassword(null);
            result.setData(user1);
        }
        return result;
    }

    @Override
    public Result sign(User user) {
        Result result=new Result();
        User user1=userMapper.getUserById(user);
        if(user1!=null){
            result.setCode(0);
            result.setMassage("账号已存在");
        }else{
            int rows=userMapper.sign(user);
            if(rows!=0){
                result.setCode(1);
                result.setMassage("注册成功");
                User user2=userMapper.getUserById(user);
                user2.setUserPassword(null);
                result.setData(user2);
            }else{
                result.setCode(0);
                result.setMassage("注册失败");
            }
        }
        return result;
    }

}
