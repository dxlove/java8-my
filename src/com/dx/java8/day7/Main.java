package com.dx.java8.day7;

public class Main {
    public static void main(String[] args) {
        new OnlineBanking().processCustomer(1,customer -> System.out.println("VIP 客户"+customer.getName()));
    }
}
