package com.dx.java8.day3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Main {
    public static void main(String[] args) {

        List<Dish> menu = Arrays.asList(
                new Dish("猪肉炖粉条",false,800,Type.MEAT),
                new Dish("小炒牛肉",false,700,Type.MEAT),
                new Dish("宫保鸡丁",false,400,Type.MEAT),
                new Dish("地三鲜",true,530,Type.OTHER),
                new Dish("水煮菠菜",true,350,Type.OTHER),
                new Dish("拔丝地瓜",true,120,Type.OTHER),
                new Dish("拔丝地瓜",true,120,Type.OTHER),
                new Dish("拔丝地瓜",true,120,Type.OTHER),
                new Dish("火山下雪",true,550,Type.OTHER),
                new Dish("水煮鱼",false,330,Type.FISH),
                new Dish("于是乎",false,450,Type.FISH)
        );


       List<String> names = menu.stream().filter(s -> s.getCalories() < 500)
               .sorted(Comparator.comparing(Dish::getCalories))
               .map(s->s.getName() + ":" + s.getCalories() + ":" + s.getType())
               .distinct()
               .limit(3)
               .collect(toList());

        System.out.println(names);

        List<Integer> nums1 = Arrays.asList(1,2,3,4,5);

        int reduceSum = nums1.stream().reduce(0, (a, b) -> a + b);
        System.out.println(reduceSum);

        System.out.println(nums1.stream().reduce(Integer::max).get());
    }
}
