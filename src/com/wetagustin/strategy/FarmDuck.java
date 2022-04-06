package com.wetagustin.strategy;

public class FarmDuck extends AbstractDuck{

    public String name;

    public FarmDuck(String name) {
        this.flyBehavior = new FlyUnable();
        this.quackBehavior = new QuackDefault();
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("Im a farm duck");
    }

}
