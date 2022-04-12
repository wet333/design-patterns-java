package com.wetagustin.singleton;

import java.util.Random;

public class Singleton {

    private static Singleton instance;

    private String id;

    private Singleton() {
        this.id = "singleton" + new Random().nextInt(100000);
    }

    public static synchronized Singleton getInstance() {
        if (instance == null){
            Singleton.instance = new Singleton();
        }
        return Singleton.instance;
    }

    public String getId() {
        return id;
    }
}
