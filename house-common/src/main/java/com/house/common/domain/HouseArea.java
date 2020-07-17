package com.house.common.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * house_area
 * @author 
 */
@Data
public class HouseArea implements Serializable {
    private Integer id;

    private Integer pid;

    /**
     * 区域名称
     */
    private String name;

    private String nameCn;

    private Date createTime;

    private Date updateTime;

    private String createUser;

    private String updateUser;

    private String isOpen;

    private static final long serialVersionUID = 1L;
}