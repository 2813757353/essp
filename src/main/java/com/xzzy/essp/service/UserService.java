package com.xzzy.essp.service;

import com.xzzy.essp.bean.Result;
import com.xzzy.essp.bean.User;

/**
 * projectName: essp
 *
 * @author: 王子琦
 * time: 2020/11/6 20:49
 * description:
 */
public interface UserService {
    Result getUserById(User user);

    Result login(User user);

    Result sign(User user);
}
