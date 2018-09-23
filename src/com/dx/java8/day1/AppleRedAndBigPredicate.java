package com.dx.java8.day1;

public class AppleRedAndBigPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return "red".equals(apple.getColor()) && apple.getWeight() > 80;
    }
}
