package com.evan.demo.CooKiT.models;

public interface IIngredient {
    String getName();
    Double getPrice();
    Double getQuantity();
    void setName(String name);
    void setPrice(Double price);
    void addQuantity(Double quantity);
    void reduceQuantity(Double quantity);
}
