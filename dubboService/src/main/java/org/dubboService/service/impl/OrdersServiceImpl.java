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
    	try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        System.out.println("调用了 server getOrderDesc");
        return "当前订单信息tid："+tid;
    }

	@Override
	public String getLogistics(String tid) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "订单tid："+tid+";物流信息";
	}
}
