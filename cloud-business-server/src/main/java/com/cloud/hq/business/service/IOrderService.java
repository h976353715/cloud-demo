package com.cloud.hq.business.service;

import com.cloud.hq.business.model.Order;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author hq
 * @since 2019-07-29
 */
public interface IOrderService extends IService<Order> {

    int updateByTest();
}
