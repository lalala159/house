package com.house.info.service.impl;

import com.house.common.domain.HouseArea;
import com.house.info.dao.HouseAreaDao;
import com.house.info.service.HouseAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author HC
 * @Date 2020/7/17 16:54
 * @Version 1.0
 */
@Service
public class HouseAreaServiceImpl implements HouseAreaService {
    @Autowired
    private HouseAreaDao houseAreaDao;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return houseAreaDao.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(HouseArea record) {
        return houseAreaDao.insert(record);
    }

    @Override
    public int insertSelective(HouseArea record) {
        return houseAreaDao.insertSelective(record);
    }

    @Override
    public HouseArea selectByPrimaryKey(Integer id) {
        return houseAreaDao.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(HouseArea record) {
        return houseAreaDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(HouseArea record) {
        return houseAreaDao.updateByPrimaryKey(record);
    }

    @Override
    public List<HouseArea> getArea(Integer pid) {
        return houseAreaDao.getAreaByParent(pid);
    }
}
