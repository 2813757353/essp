package com.xzzy.essp.mapper;

import com.xzzy.essp.bean.User;
import com.xzzy.essp.bean.Usp;

/**
 * projectName: essp
 *
 * @author: 王子琦
 * time: 2020/11/6 20:52
 * description:
 */
public interface UserMapper {
    User getUserById(User user);

    int buyUsp(Usp usp, int count);

    int sign(User user);
}
