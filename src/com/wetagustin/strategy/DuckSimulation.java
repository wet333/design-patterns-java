package com.wetagustin.strategy;

public class DuckSimulation {
    public static void main(String[] args) {

        FarmDuck farmDuck = new FarmDuck("robert");

        farmDuck.performFly();
        farmDuck.performQuack();
        farmDuck.performSwim();

        farmDuck.setFlyBehavior(new FlyWithWings());

        farmDuck.performFly();
        farmDuck.performQuack();
        farmDuck.performSwim();

    }
}
