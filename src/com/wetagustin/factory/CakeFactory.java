package com.wetagustin.factory;

import com.wetagustin.factory.cakes.*;

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
