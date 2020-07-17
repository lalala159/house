package com.house.info.dao;

import com.house.common.domain.HouseArea;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HouseAreaDao {
    int deleteByPrimaryKey(Integer id);

    int insert(HouseArea record);

    int insertSelective(HouseArea record);

    HouseArea selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HouseArea record);

    int updateByPrimaryKey(HouseArea record);

    List<HouseArea> getAreaByParent(Integer pid);
}