package com.wetagustin.factoryMethod;

import com.wetagustin.factoryMethod.cakes.*;

public class CakeFactory {

    public Cake createCake(String cakeType) {
        switch (cakeType) {
            case "chocolate" :
                return new CakeChocolate();

            case "strawberry" :
                return new CakeStrawberry();

            case "banana" :
                return new CakeBanana();

            case "cream" :
            default :
                return new CakeCream();
        }
    }

}
