package com.dx.java8.day2;

import com.dx.java8.day1.Apple;

import java.util.function.Supplier;

public class Main3 {
    public static void main(String[] args) {
        //无参构造函数
        Supplier<Apple> c1 = Apple::new;
        //调用Supplier的get方法产生一个新的Apple
        Apple a1 = c1.get();
        System.out.println(a1);
    }
}
