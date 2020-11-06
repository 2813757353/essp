package com.xzzy.essp.service.impl;

import com.xzzy.essp.bean.Result;
import com.xzzy.essp.bean.Sp;
import com.xzzy.essp.bean.User;
import com.xzzy.essp.bean.Usp;
import com.xzzy.essp.mapper.UserMapper;
import com.xzzy.essp.mapper.UspMapper;
import com.xzzy.essp.service.UspService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * projectName: essp
 *
 * @author: 王子琦
 * time: 2020/11/6 17:05
 * description:商品服务的实现类
 */
@Service
public class UspServiceImpl implements UspService {
    @Autowired(required = false)
    private UspMapper uspMapper;
    @Autowired(required = false)
    UserMapper userMapper;
    @Override
    public Result getAll() {
        Result result=new Result();
        List<Usp> list= uspMapper.getAll();
        if (list == null) {
            result.setCode(0);
            result.setMassage("读取数据失败");
        }else{
            result.setCode(1);
            result.setMassage("成功");
            result.setData(list);
        }

        return result;
    }
    public Result getSpById(Usp usp){
        Result result=new Result();
        Usp usp1=uspMapper.getSpById(usp);
        if (usp1 == null) {
            result.setCode(0);
            result.setMassage("没有该数据");
        }else{
            result.setCode(1);
            result.setMassage("成功");
            result.setData(usp1);
        }
        return result;
    }
    @Override
    public Result getSpByUserId(User user) {
        Result result=new Result();
        List<Usp> list=uspMapper.getSpByUserId(user);
        if (list == null) {
            result.setCode(0);
            result.setMassage("没有该类型数据");
        }else {
            result.setCode(1);
            result.setMassage("成功");
            result.setData(list);
        }
        return result;
    }

    @Override
    public Result getSpByType(Sp sp) {
        Result result=new Result();
        List<Usp> list=uspMapper.getSpByType(sp);
        if (list == null) {
            result.setCode(0);
            result.setMassage("没有该类型数据");
        }else{
            result.setCode(1);
            result.setMassage("成功");
            result.setData(list);
        }
        return result;
    }

    @Override
    public Result getSpByName(Usp usp) {
        Result result=new Result();
        List<Usp> list=uspMapper.getSpByName(usp);
        if (list == null) {
            result.setCode(0);
            result.setMassage("没有该类型数据");
        }else{
            result.setCode(1);
            result.setMassage("成功");
            result.setData(list);
        }
        return result;
    }

    @Override
    public Result addUsp(Usp usp, Sp sp) {
        Result result=new Result();
        System.out.println(usp);
        System.out.println(sp);
        int rows= uspMapper.addUsp(usp,sp);
        if (rows!=0){
            result.setCode(1);
            result.setMassage("成功");
            User user=new User();
            user.setUserId(usp.getUserId());
            result.setData(getSpByUserId(user));
        }else {
            result.setCode(0);
            result.setMassage("数据库更新失败");
        }
        return result;
    }

    @Override
    public Result buyUsp(Usp usp,int count) {

        Result result=new Result();
        Result isHave=getSpById(usp);
        if(count<=0){
            result.setCode(0);
            result.setMassage("购买数量不能小于1");
        }else{
            if(isHave.getCode()!=0 && ((Usp)isHave.getData()).getUspCount()>=count){
                Usp cost=(Usp)isHave.getData();
                User user=new User();
                user.setUserId(usp.getUserId());
                User user1=userMapper.getUserById(user);
                if(user1.getUserMoney()>=cost.getUspCost()){
                    int rows=uspMapper.buyUsp(usp,count);
                    rows+=userMapper.buyUsp(cost,count);
                    if(rows>=2){
                        result.setCode(1);
                        result.setMassage("成功");
                        result.setData(userMapper.getUserById(user1));
                    }else{
                        result.setCode(0);
                        result.setMassage("数据库更新失败");
                    }
                }else{
                    result.setCode(0);
                    result.setMassage("余额不足");
                }
            }else{
                result.setCode(0);
                result.setMassage("商品不存在或余量不足");
            }
        }



        return result;
    }

    @Override
    public Result delUsp(Usp usp) {
        Result result=new Result();
        Usp usp1=uspMapper.getSpById(usp);
        int rows=uspMapper.delUsp(usp);
        if (rows ==0) {
            result.setCode(0);
            result.setMassage("失败");
        }else{
            result.setCode(1);
            result.setMassage("成功");
            User user=new User();
            user.setUserId(usp1.getUserId());
            result.setData(uspMapper.getSpByUserId(user));
        }
        return result;
    }
}
