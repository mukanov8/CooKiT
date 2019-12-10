package com.evan.demo.CooKiT.db.entity;

import com.evan.demo.CooKiT.models.IIngredient;

public class Ingredient implements IIngredient {
    private String name;
    private Double price, quantity;

    public Ingredient() {
        name = "";
        price = 0.0;
        quantity = 0.0;
    }

    public Ingredient(String name, Double price, Double quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public Double getQuantity() {
        return quantity;
    }

    public Double getPrice() {
        return price;
    }

    private void setQuantity(Double quantity) {this.quantity = quantity; }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void reduceQuantity(Double redQuantity) {
        if (redQuantity <= 0) return;
        Double pricePerIng = getPrice()/getQuantity();
        if (getQuantity() < redQuantity) {
            redQuantity = getQuantity();
        }
        setQuantity(getQuantity() - redQuantity);
        setPrice(getQuantity() * pricePerIng);
    }

    public void addQuantity(Double addQuantity) {
        if (addQuantity <= 0) return;
        Double pricePerIng = getPrice()/getQuantity();
        setQuantity(getQuantity() + addQuantity);
        setPrice(getQuantity() * pricePerIng);
    }
}
