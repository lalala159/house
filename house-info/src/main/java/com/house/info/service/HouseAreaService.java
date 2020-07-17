package com.house.info.service;

import com.house.common.domain.HouseArea;

import java.util.List;

/**
 * @Author HC
 * @Date 2020/7/17 16:54
 * @Version 1.0
 */
public interface HouseAreaService {
    
    public int deleteByPrimaryKey(Integer id);

    public int insert(HouseArea record);

    public int insertSelective(HouseArea record);

    public HouseArea selectByPrimaryKey(Integer id);

    public int updateByPrimaryKeySelective(HouseArea record);

    public int updateByPrimaryKey(HouseArea record);

    public List<HouseArea> getArea(Integer pid);
}
