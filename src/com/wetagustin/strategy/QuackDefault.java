package com.wetagustin.strategy;

public class QuackDefault implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("quack quack");
    }
}
