package com.daida.www.thread.safety;

public class ReturnBean{

    //根据传入的对象返还一个线程安全的对象 根据java8的lambda生成
    public static <T> T getSafetyBean(T t){
        return ThreadLocal.withInitial(()-> t).get();
    }
}
