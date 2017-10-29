package com.shengsiyuan.jdk8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

interface IMessage {
   public void print () ;

        }



public class Test4 {
    public static void main(String[] args) {
        fun(() -> System.out.println("hello world"));

    }
   public static void fun (IMessage msg ) {
        msg.print () ;
   }
}
