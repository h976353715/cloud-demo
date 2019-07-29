package com.cloud.hq.business.service.impl;

import com.cloud.hq.business.model.Order;
import com.cloud.hq.business.mapper.OrderMapper;
import com.cloud.hq.business.service.IOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author hq
 * @since 2019-07-29
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements IOrderService {

    @Override
    public int updateByTest() {
        Order order = new Order();
        order.setUserId("1");
        order.setCommodityCode("1");
        order.setCount(1);
        order.setMoney(100);
        save(order);
        return 0;
    }
}
