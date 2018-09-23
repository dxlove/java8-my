package com.dx.java8.day7;

public class Main3 {
    public static void main(String[] args) {
        Product p = ProductFactory.createProduct("loan");
        System.out.println(p);
    }

}
