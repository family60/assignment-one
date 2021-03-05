package com.kovunov.model;

public abstract class Game {
    private String name;
    private Double price;
    private int quantity;
    private String company;

    public Game(String name, Double price, int quantity, String company) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
