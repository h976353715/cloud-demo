package com.cloud.hq.business.model;

import com.alibaba.fastjson.JSON;

/**
 * @author huangqi
 * @Package com.cloud.hq.business.model
 * @Description: 基础entity
 * @date 2019/7/28 14:41
 */
public class BaseEntity {

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
