package com.bdqn.pagedemo.service;

import com.bdqn.pagedemo.pojo.Game;

import java.util.List;

public interface GameService {
    List<Game> getGameListInfos(Integer pageNo, Integer pageSize, String name);
}
