package com.dongxi.software.dao.mapper;

import com.dongxi.software.entity.Addr;

public interface IAddrDao {
    int insert(Addr record);

    int insertSelective(Addr record);
}