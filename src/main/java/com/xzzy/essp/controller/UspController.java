package com.xzzy.essp.controller;

import com.xzzy.essp.bean.Result;
import com.xzzy.essp.bean.Sp;
import com.xzzy.essp.bean.User;
import com.xzzy.essp.bean.Usp;
import com.xzzy.essp.service.UspService;
import org.apache.ibatis.builder.ResultMapResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * projectName: essp
 *
 * @author: 王子琦
 * time: 2020/11/6 17:00
 * description:商品控制器
 */
@RestController
@RequestMapping("usp")
public class UspController {
    @Autowired
    private UspService uspService;

    @PostMapping("getAll")
    public Result getAll(){
        Result result=uspService.getAll();
        return  result;
    }
    @PostMapping("getSpByUserId")
    public Result getSpByUserId(User user){
        Result result=uspService.getSpByUserId(user);
        return result;
    }
    @PostMapping("getSpByType")
    public Result getSpByType(Sp sp){
        Result result =uspService.getSpByType(sp);
        return result;
    }
    @PostMapping("getSpByName")
    public Result getSpByName(Usp usp){
        Result result=uspService.getSpByName(usp);
        return result;
    }
    @PostMapping("addUsp")
    public Result addUsp(Usp usp,Sp sp){
        Result result=uspService.addUsp(usp,sp);
        return result;
    }
    @PostMapping("buyUsp")
    public Result buyUsp(Usp usp,int count){
        Result result=uspService.buyUsp(usp,count);
        return result;
    }
    @PostMapping("delUsp")
    public Result delUsp(Usp usp){
        Result result=uspService.delUsp(usp);
        return result;
    }
}
