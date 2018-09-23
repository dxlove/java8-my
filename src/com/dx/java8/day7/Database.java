package com.dx.java8.day7;

public class Database {
    public static Customer getCustomerById(int id) {

        return new Customer(id,"Test"+id,"M","18");
    }
}
