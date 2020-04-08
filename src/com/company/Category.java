package com.company;

import java.util.ArrayList;

public class Category {
    private String name;
    private ArrayList<Product> products;

    public Category() {
        this.name="Main Category";
        this.products = new ArrayList<>();
    }

    public Category(String name) {
        this.name = name;
        this.products=new ArrayList<>();
    }

    public Category(String name, ArrayList<Product> products) {
        this.name = name;
        this.products = products;
    }


    public void addProduct(Product newProduct)
    {
        if(ifProductExists(newProduct)==false) {
            products.add(newProduct);
        }
    }

    public void deleteProduct(Product oldProduct)
    {
        products.remove(oldProduct);
    }

    public int getNofProducts()
    {
       return products.size();
    }

    public boolean ifProductExists(Product product){
        for(Product p: products){
        if(p.getName().equals(product.getName())){
            return true;
            }
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setName(String name) {
        this.name = name;
    }
}
