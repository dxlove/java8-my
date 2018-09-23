package com.dx.java8.day1;

import java.util.ArrayList;
import java.util.List;

public class AppleUtils {
    //根据抽象条件筛选
    public static List<Apple> filterApples(List<Apple> apples, ApplePredicate p){
        List<Apple> result = new ArrayList();
        for(Apple apple : apples){
            if(p.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }

    public static void printApple(List<Apple> apples,AppleFormater af) {
        for (Apple apple : apples) {
            String output = af.accept(apple);
            System.out.println(output);
        }
    }

}
