package com.dx.java8.day7;

import java.util.function.Consumer;

public class OnlineBanking {
    public void processCustomer(int id, Consumer<Customer> makeCustomerHappy){
        Customer c = Database.getCustomerById(id);
        makeCustomerHappy.accept(c);
    }
}
