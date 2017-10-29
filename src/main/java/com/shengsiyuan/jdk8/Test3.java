package com.shengsiyuan.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Test3 {
    public static void main(String[] args) {
        List languages = Arrays.asList("JAVA","C++","scala") ;
        filter(languages ,(str) -> str.startsWith("J"));
    }
    public static void filter (List<String> names , Predicate<String> a){
        names.stream().filter((x) -> (a.test(x))).forEach((x) -> {
            System.out.println(x );
        });

        names.parallelStream() ;

//        names.stream().map()
//         names.stream().filter( x -> x.startsWith("J")) ;
//        for (String name : names) {
//            if(a.test(name)){
//                System.out.println(name+ " ");
//            }
//        }
    }
}
