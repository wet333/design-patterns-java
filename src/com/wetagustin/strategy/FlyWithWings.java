package com.wetagustin.strategy;

public class FlyWithWings implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("Duck Flying...");
    }
}
