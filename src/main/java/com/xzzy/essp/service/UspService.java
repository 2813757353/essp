package com.xzzy.essp.service;

import com.xzzy.essp.bean.Result;
import com.xzzy.essp.bean.Sp;
import com.xzzy.essp.bean.User;
import com.xzzy.essp.bean.Usp;

/**
 * projectName: essp
 *
 * @author: 王子琦
 * time: 2020/11/6 17:04
 * description:商品服务接口
 */
public interface UspService {
    Result getAll();

    Result getSpByUserId(User user);

    Result getSpByType(Sp sp);

    Result getSpByName(Usp usp);

    Result addUsp(Usp usp, Sp sp);

    Result buyUsp(Usp usp,int count);

    Result delUsp(Usp usp);
}
