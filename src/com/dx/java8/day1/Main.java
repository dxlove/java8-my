package com.dx.java8.day1;

import java.util.Arrays;
import java.util.List;

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

        List<Apple> greenApple = AppleUtils.filterApples(apples,new AppleGreenColorPredicate());
        System.out.println(greenApple);

        List<Apple> bigApple = AppleUtils.filterApples(apples,new AppleHeavyWeightPredicate());

        System.out.println(bigApple);

        List<Apple> bigAndRedApple = AppleUtils.filterApples(apples,new AppleRedAndBigPredicate());

        System.out.println(bigAndRedApple);

        AppleUtils.printApple(apples,new AppleColorFormater());
        AppleUtils.printApple(apples,new AppleWeightFormater());

        AppleUtils.printApple(apples, new AppleFormater() {
            @Override
            public String accept(Apple a) {
                return "哇塞，这是一个" + (a.getWeight() > 32 ? "大" : "小") + "苹果啊？";
            }
        });

        AppleUtils.printApple(apples, (Apple a) -> "He,He ...哇塞，这是一个" + (a.getWeight() > 32 ? "大" : "小") + "苹果啊？");


        System.out.println("before:"+apples);
        apples.sort((Apple a1,Apple a2) -> a1.getWeight().compareTo(a2.getWeight()));
        System.out.println("sort:"+apples);
    }


}
