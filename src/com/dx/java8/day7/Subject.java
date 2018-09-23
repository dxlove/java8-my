package com.dx.java8.day7;

import java.util.Observer;

public interface Subject {
    //注册观察者
    void registerObserver(Observer o);
    //通知它的观察者一个新闻到来
    void notifyObservers(String news);
}
