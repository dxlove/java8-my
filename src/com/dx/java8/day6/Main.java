package com.dx.java8.day6;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.stream.LongStream;

public class Main {
    public static void main(String[] args) {
        long[] numbers = LongStream.rangeClosed(1,100).toArray();
        Arrays.stream(numbers).forEach(s-> System.out.print(s + ".") );
        ForkJoinTask<Long> task = new ForkJoinSumCalculator(numbers);
        System.out.println(new ForkJoinPool().invoke(task));
    }
}
