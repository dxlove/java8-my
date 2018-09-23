package com.dx.java8.day2;

import com.dx.java8.day1.Apple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Apple> apples = Arrays.asList(
                new Apple(1,"green",18.0),
                new Apple(2,"yellow",36d),
                new Apple(3,"red",42d),
                new Apple(4,"green",15d),
                new Apple(5,"red",90d),
                new Apple(6,"red",16d)
        );

        Predicate<Apple> greenApplePredicate = (Apple apple) -> "green".equals(apple.getColor());
        List<Apple> greenApple = filter(apples,greenApplePredicate);

        System.out.println(greenApple);

        List<Apple> bigApple = filter(apples,(Apple apple) -> apple.getWeight() > 30d);
        System.out.println(bigApple);
    }

    //定义过滤方法 接受一个Predicate<T>
    public static <T> List<T> filter(List<T> list, Predicate<T> p) {
        List<T> result = new ArrayList<>();
        for(T e : list){
            if(p.test(e)){
                result.add(e);
            }
        }
        return result;
    }
}
