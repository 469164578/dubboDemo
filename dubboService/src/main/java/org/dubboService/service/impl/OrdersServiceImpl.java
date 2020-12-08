package org.dubboService.service.impl;

import org.dubboService.service.OrdersService;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * @Author: fxy
 * @Date: 2020-12-08 15:30
 */
@Service
public class OrdersServiceImpl implements OrdersService {

    @Override
    public String getOrderDesc(String tid) {
        return "当前订单信息tid："+tid;
    }
}
