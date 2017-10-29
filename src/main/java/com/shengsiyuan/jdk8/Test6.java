package com.shengsiyuan.jdk8;

import java.util.stream.Stream;

/**
 * 实现方法的引用
 * @param <P> 引用发的参数类型
 * @param <R> 饮用方法的返回类型
 */
@FunctionalInterface
interface IMessagea<P,R>{

   public R zhuanhuan(P p) ;
}


public class Test6 {
    public static void main(String[] args) {
    IMessagea<Integer ,String > msg = String :: valueOf ;

    }
}
