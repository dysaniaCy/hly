package com.example.sakura;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@Component
public class chenyang {

    @Value("chenyang")
    private String name;

    @Override
    public String toString() {
        return "chenyang{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {

//        Runnable runnable = () -> {
//
//        };
//
//        ILike iLike = System.out::println;
//
//        iLike.lamdba("666");



        Singleton singleton1 = Singleton.INSTANCE;
        Singleton singleton2 = Singleton.INSTANCE;
        System.out.println(Singleton3.getInstance());
        System.out.println(Singleton3.getInstance());

    }

}


interface ILike{
    void lamdba(String aa);
}


class Like implements ILike{

    @Override
    public void lamdba(String aa) {
        System.out.println("like");
    }
}
