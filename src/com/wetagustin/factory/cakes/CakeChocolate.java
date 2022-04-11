package com.wetagustin.factory.cakes;

public class CakeChocolate implements Cake{
    @Override
    public String make() {
        return "New Chocolate Cake made";
    }

    @Override
    public double cost() {
        return 2500.0;
    }
}
