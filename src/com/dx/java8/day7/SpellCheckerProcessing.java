package com.dx.java8.day7;

public class SpellCheckerProcessing extends ProcessingObjet<String> {
    @Override
    protected String handleWork(String input) {
        return input.replace("哈喽","hello,");
    }
}
