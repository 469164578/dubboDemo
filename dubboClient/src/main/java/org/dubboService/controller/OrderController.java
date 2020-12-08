package org.dubboService.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.dubboService.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: fxy
 * @Date: 2020-12-08 17:35
 */
@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    private OrdersService ordersService;
    @RequestMapping("/desc")
    @ResponseBody
    public String orderDesc(String tid){
        return ordersService.getOrderDesc(tid);
    }
}
