package com.gqb.dubbo.domain;

import java.io.Serializable;

public class Order implements Serializable {
    private String id;
    private String goodsName;
    private Double price;
    private Integer amount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", goodsName='" + goodsName + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }
}
