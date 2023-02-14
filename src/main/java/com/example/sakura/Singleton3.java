package com.example.sakura;

import java.io.Serializable;

public class Singleton3 implements Serializable {

    private Singleton3(){

    }

    private static class Holder{
        static Singleton3 INSTANCE = new Singleton3();
    }

    public static Singleton3 getInstance(){
        return Holder.INSTANCE;
    }

}
