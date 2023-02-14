package com.example.sakura;

public enum Singleton {
    INSTANCE;

    @Override
    public String toString(){
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }

}
