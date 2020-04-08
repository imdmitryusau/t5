package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        /*
        User g1 = new User("guyest1@gmail.com", UserType.GUEST);
        User g2 = new User("guest2@gmail.com", UserType.GUEST);
        User u1 = new User("Arya", "Toufanian","user1@gmail.com" , 12345678, UserType.USER );
        User u2 = new User("Arya", "Toufanian","user2@gmail.com" , 12345678, UserType.USER );
        */

        Product p4=new Product("Apple", 900, "N4", 10);
        Product p5=new Product("Samsung", 700, "N5", 17);
        Product p6=new Product("LG", 20, "N56", 19);


        Category c=new Category();
        System.out.println(c.getName());

        c.addProduct(p4);
        c.addProduct(p5);
        c.addProduct(p6);
        System.out.println("There are " + c.getNofProducts() + " products");

        c.deleteProduct(p4);
        System.out.println("There are " + c.getNofProducts() + " products");

        c.setName("Not Main Category");
        System.out.println(c.getName());

        Category c1=new Category("Phones");
        c1.addProduct(p4);
        c1.addProduct(p5);


        Category c2=new Category("Phones", c1.getProducts()); //getting products from c1
        System.out.println("There are " + c2.getNofProducts() + " products in the 3rd category");


        Busket b= new Busket();
        Busket b1= new Busket(UserType.GUEST);
        b1.addProduct(p4);
        b1.addProduct(p5);
        b1.setWho(UserType.USER);
        b1.deleteProduct(p4);

        Busket b2= new Busket(UserType.GUEST, b1.getProducts());//getting products from b1





        /*
        System.out.println("Before:");
        System.out.println(g2.getWho());
        System.out.println(g2.getEmail());

        g2.setWho(UserType.USER);
        g2.setName("Alex");
        g2.setLastname("Miami");
        g2.setPassword(87654321);
        System.out.println("");

        System.out.println("After:");
        System.out.println(g2.getWho());
        System.out.println(g2.getName());
        System.out.println(g2.getLastname());
        System.out.println(g2.getEmail());
        System.out.println(g2.getPassword());

        Product p1 = new Product("Hoodie", 200, "N1", 12);
        Product p2 = new Product("Jeans", 250, "N2");
        Product p3 = new Product("Cap", 50, "N3", 32);

        System.out.println("Price and number of the 1st product before the modification of them:");
        System.out.println(p1.getPrice());
        System.out.println(p1.getN_of_items());

        p1.setPrice(300);
        p1.setN_of_items(5);

        System.out.println("Price and number of the 1st product after the modification of them:");
        System.out.println(p1.getPrice());
        System.out.println(p1.getN_of_items());
        */
        


    }
}
