package com.wetagustin.factoryMethod.cakes;

public class CakeCream implements Cake{
    @Override
    public String make() {
        return "New Cream Cake just baked";
    }

    @Override
    public double cost() {
        return 1400.00;
    }
}
