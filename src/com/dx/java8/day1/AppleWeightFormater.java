package com.dx.java8.day1;

public class AppleWeightFormater implements AppleFormater {
    @Override
    public String accept(Apple a) {
        return "这是一个" + a.getColor() + "的" + (a.getWeight() > 32 ? "大" : "小") + "苹果";
    }
}
