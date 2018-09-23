package com.dx.java8.day1;

public class AppleColorFormater implements AppleFormater {
    @Override
    public String accept(Apple a) {
        return "一个" + a.getColor() + "的苹果";
    }
}
