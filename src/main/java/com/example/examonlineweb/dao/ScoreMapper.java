package com.example.examonlineweb.dao;

import com.example.examonlineweb.entity.Score;

public interface ScoreMapper {
    int deleteByPrimaryKey(String sysId);

    int insert(Score record);

    int insertSelective(Score record);

    Score selectByPrimaryKey(String sysId);

    int updateByPrimaryKeySelective(Score record);

    int updateByPrimaryKey(Score record);
}