package com.dx.java8.day7;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Main2 {
    public static void main(String[] args) {
        ProcessingObjet<String> p1 = new HandlerTextProcssing();
        ProcessingObjet<String> p2 = new SpellCheckerProcessing();
        p1.setSuccessor(p2);
        String result = p1.handle("你说啥？");
        System.out.println(result);

        UnaryOperator<String> headerProcessing = (String text) -> "哈喽大家好啊" + text;
        UnaryOperator<String> spellCheckerProcessing = (String text) -> text.replace("哈喽","hello,");
        Function<String,String> pipeline = headerProcessing.andThen(spellCheckerProcessing);
        String result1 = pipeline.apply("你说啥？");
        System.out.println(result1);
    }
}
