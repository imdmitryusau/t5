package com.company;

public class Product {
    private String name;
    private long price;
    private String product_code;
    private long n_of_items=0;

    public Product(String name, long price, String product_code) {
        this.name = name;
        this.price = price;
        this.product_code = product_code;
    }

    public Product(String name, long price, String product_code, long n_of_items) {
        this.name = name;
        this.price = price;
        this.product_code = product_code;
        this.n_of_items = n_of_items;
        if (n_of_items<0) throw new IllegalArgumentException("less than 0");
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public long getN_of_items() {
        return n_of_items;
    }

    public void setN_of_items(long n_of_items) {
        this.n_of_items = n_of_items;
        if (n_of_items<0) throw new IllegalArgumentException("less than 0");
    }

    public String getProduct_code() {
        return product_code;
    }


}
