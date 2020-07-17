package com.house.info.controller;

import com.house.common.utils.Result;
import com.house.info.service.HouseAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author HC
 * @Date 2020/7/17 17:48
 * @Version 1.0
 */
@RestController
@RequestMapping(value = "houseArea")
public class HouseAreaController {
    @Autowired
    private HouseAreaService houseAreaService;

    @GetMapping(value = "/getArea")
    public Result getArea(Integer pid){
        return Result.success(houseAreaService.getArea(pid));
    }
}
