package com.wetagustin.singleton;

public class SingletonExample {
    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.getId());

        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton1.getId());

        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton2.getId());
    }
}
