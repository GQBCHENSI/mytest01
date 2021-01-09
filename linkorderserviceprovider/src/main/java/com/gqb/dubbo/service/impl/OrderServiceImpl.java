package com.gqb.dubbo.service.impl;

import com.gqb.dubbo.domain.Order;
import com.gqb.dubbo.service.OrderService;

import java.util.UUID;

public class OrderServiceImpl implements OrderService {
    @Override
    public Order addOrder(Integer userId, String goodsName, Double price, Integer amount) {
        Order order = new Order();
        String orderId = UUID.randomUUID().toString().replaceAll("-","").toString();
        order.setId(orderId);
        order.setGoodsName(goodsName);
        order.setPrice(price);
        order.setAmount(amount);
        return order;
    }
}
