package com.wetagustin.strategy;

public class QuackSqueak implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("squeak squeak");
    }
}
