package com.dx.java8.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class Main2 {
    public static void main(String[] args) {
        List<String> l = map(Arrays.asList("lambdas","in","action"),(String s) -> "string:"+ s + "  len:" + s.length());
        System.out.println(l);


        //避免自动装箱
        IntPredicate evenNumbers = (int i) -> i % 2 == 0;
        System.out.println(evenNumbers.test(1000));

        //会造成装箱
        Predicate<Integer> evenNumbers2 = (Integer i) -> i % 2 == 0;
        System.out.println(evenNumbers2.test(1000));
    }

    public static <T,R> List<R> map(List<T> list, Function<T,R> f){
        List<R> result= new ArrayList<>();
        for(T s: list){
            result.add(f.apply(s));
        }
        return result;
    }
}
