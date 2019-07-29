package com.cloud.hq.business.controller;


import com.cloud.hq.business.model.BizResult;
import com.cloud.hq.business.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author hq
 * @since 2019-07-29
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private IOrderService iOrderService;


    @GetMapping("/update")
    public BizResult update() {
        iOrderService.updateByTest();
        return BizResult.ok();
    }

}

