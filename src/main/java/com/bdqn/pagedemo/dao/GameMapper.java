package com.bdqn.pagedemo.dao;

import com.bdqn.pagedemo.pojo.Game;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GameMapper {
    List<Game> getGameListInfos(@Param("pageNo")Integer pageNo,@Param("pageSize")Integer pageSize,@Param("name")String name);
}
