package com.dx.java8.day7;

public class Loan extends Product {
    private String value;

    public Loan(String value) {
        this.value = value;
    }


    public Loan() {

    }

    @Override
    public String toString() {
        return "Loan{" +
                "value='" + value + '\'' +
                '}';
    }
}
