package com.gqb.dubbo.service;

import com.gqb.dubbo.domain.Order;

public interface OrderService {
    Order addOrder(Integer userId,String goodsName,Double price,Integer amount);
}
