package com.shengsiyuan.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Test1 {


    public static void main(String[] args) {
        List<Integer> list  = Arrays.asList(1,2,3,4,5);
        list.forEach(integer -> System.out.println(integer));

        list.forEach(System.out :: println);
        new Thread(() -> System.out.println("hello world")).start();

    }

}
