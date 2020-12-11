package org.dubboService.controller;

import java.util.concurrent.Future;

import org.dubboService.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.rpc.RpcContext;

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
    	String orderInfo = ordersService.getOrderDesc(tid);
    	Future<String> orderInfoFuture = RpcContext.getContext().getFuture();
    	System.out.println("调用完方法：orderInfo："+orderInfo);
    	String logistics = ordersService.getLogistics(tid);
    	Future<String> logisticsFuture = RpcContext.getContext().getFuture();
    	System.out.println("调用完方法：logistics："+logistics);
    	try {
    		orderInfo = orderInfoFuture.get();
    		System.out.println("get调用完方法：orderInfo："+orderInfo);
        	logistics = logisticsFuture.get();
        	System.out.println("get调用完方法：logistics："+logistics);
		} catch (Exception e) {
			e.printStackTrace();
		}
        return orderInfo+logistics;
    }
}
