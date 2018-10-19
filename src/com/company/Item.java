package com.company;

public class Item {


    private String itemName;
    private int Quantity;
    private Double Price;
    private Double cost;
    boolean taxable;

    public Item() {
    }

    public Item(String itemName, int quantity, Double price, Double cost, boolean taxable) {
        this.itemName = itemName;
        Quantity = quantity;
        Price = price;
        this.cost = cost;
        this.taxable = taxable;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public boolean isTaxable() {
        return taxable;
    }

    public void setTaxable(boolean taxable) {
        this.taxable = taxable;
    }
}
