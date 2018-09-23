package com.dx.java8.day5;

import com.dx.java8.day3.Dish;
import com.dx.java8.day3.Type;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;

public class Main {
    public static void main(String[] args) {
        List<Dish> menu = Arrays.asList(
                new Dish("猪肉炖粉条",false,800, Type.MEAT),
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

        Map<Type, List<Dish>> menuMap = menu.stream().collect(groupingBy(Dish::getType));
        System.out.println(menuMap.get(Type.FISH));
    }
}
