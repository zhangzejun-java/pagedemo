package com.bdqn.pagedemo.service.impl;

import com.bdqn.pagedemo.dao.GameMapper;
import com.bdqn.pagedemo.pojo.Game;
import com.bdqn.pagedemo.service.GameService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
@Service
public class GameServiceImpl implements GameService {
    @Resource
    GameMapper gameMapper;
    @Override
    public List<Game> getGameListInfos(Integer pageNo, Integer pageSize, String name) {

        return gameMapper.getGameListInfos(pageNo,pageSize,name);
    }
}
