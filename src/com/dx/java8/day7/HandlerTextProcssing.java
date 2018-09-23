package com.dx.java8.day7;

public class HandlerTextProcssing extends ProcessingObjet<String> {
    @Override
    protected String handleWork(String input) {
        return "哈喽大家好啊" + input;
    }
}
