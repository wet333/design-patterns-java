package com.wetagustin.strategy;

public class QuackMute implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("... #silence# ...");
    }
}
