package com.dx.java8.day7;

public class Bond extends Product {
    private String name;

    public Bond(String name) {
        this.name = name;
    }

    public Bond() {

    }

    @Override
    public String toString() {
        return "Bond{" +
                "name='" + name + '\'' +
                '}';
    }
}
