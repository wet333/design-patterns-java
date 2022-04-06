package com.wetagustin.strategy;

public abstract class AbstractDuck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public AbstractDuck() {
    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performSwim() {
        System.out.println("All ducks swim or float");
    }

    public void setFlyBehavior(FlyBehavior f) {
        this.flyBehavior = f;
    }

    public void setQuackBehavior(QuackBehavior q) {
        this.quackBehavior = q;
    }

}
