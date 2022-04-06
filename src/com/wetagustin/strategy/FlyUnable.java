package com.wetagustin.strategy;

public class FlyUnable implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("Duck cannot fly...");
    }
}
