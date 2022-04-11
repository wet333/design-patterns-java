package com.wetagustin.factoryMethod.cakes;

public class CakeStrawberry implements Cake{
    @Override
    public String make() {
        return "A delicious Strawberry cake";
    }

    @Override
    public double cost() {
        return 2100.00;
    }
}
