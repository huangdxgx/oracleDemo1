package com.dongxi.software.dao.mapper;

import com.dongxi.software.entity.User;

public interface IUserDao {
    int deleteByPrimaryKey(Short userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Short userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}