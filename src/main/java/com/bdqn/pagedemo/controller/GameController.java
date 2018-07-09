package com.bdqn.pagedemo.controller;

import com.alibaba.fastjson.JSON;
import com.bdqn.pagedemo.pojo.Game;
import com.bdqn.pagedemo.service.GameService;
import com.bdqn.pagedemo.util.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/game")
public class GameController {
    @Resource
    GameService gameService;
    //进入jindex页面
    @RequestMapping("index.html")
    public  String intoIndex(){
        return "index";
    }
    //显示页面信息
    @RequestMapping("page.action")
    @ResponseBody
    public Object showInfo(Integer index,String name){

        Page<Game> page = new Page<Game>();
        if (index==0){
            index=1;
        }
        page.setPageNo(index);
        page.setPageSize(2);
        page.setPageCount(gameService.getGameListInfos(0,0,name).size());
        page.setInfoList(gameService.getGameListInfos((index-1)*2,2,name));
        return JSON.toJSONString(page);

    }
}
