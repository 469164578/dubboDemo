package org.dubboService.service.impl;

import org.dubboService.service.OrdersService;

/**
 * @Author: fxy
 * @Date: 2020-12-08 15:30
 */
public class OrdersServiceImpl implements OrdersService {

    @Override
    public String getOrderDesc(String tid) {
        return "当前订单信息tid："+tid;
    }
}
