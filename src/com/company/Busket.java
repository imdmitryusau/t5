package com.company;

import java.util.ArrayList;

public class Busket {
    private UserType who;
    private ArrayList<Product> products;

    public Busket() {
        this.products = new ArrayList<>();
    }

    public Busket(UserType who) {
        this.who = who;
        this.products = new ArrayList<>();
    }

    public Busket(UserType who, ArrayList<Product> products) {
        this.who = who;
        this.products = products;
    }

    public void addProduct(Product p)
    {
        products.add(p);
    }


    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setWho(UserType who) {
        this.who = who;
    }

    public void deleteProduct(Product p)
    {
        products.remove(p);
    }
}
