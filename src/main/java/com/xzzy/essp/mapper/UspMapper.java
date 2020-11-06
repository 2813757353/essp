package com.xzzy.essp.mapper;

import com.xzzy.essp.bean.Sp;
import com.xzzy.essp.bean.User;
import com.xzzy.essp.bean.Usp;

import java.util.List;

/**
 * projectName: essp
 *
 * @author: 王子琦
 * time: 2020/11/6 17:07
 * description:商品mapper
 */

public interface UspMapper {
    List<Usp> getAll();

    List<Usp> getSpByUserId(User user);

    List<Usp> getSpByType(Sp sp);

    List<Usp> getSpByName(Usp usp);

    int addUsp(Usp usp, Sp sp);

    Usp getSpById(Usp usp);

    int buyUsp(Usp usp,int count);


    int delUsp(Usp usp);
}
