package com.wetagustin.factoryMethod.cakes;

public class CakeBanana implements Cake {
    @Override
    public String make() {
        return "New Banana Cake made";
    }

    @Override
    public double cost() {
        return 1200.00;
    }
}
