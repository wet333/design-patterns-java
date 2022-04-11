package com.wetagustin.factory;

import com.wetagustin.factory.cakes.Cake;

public class FactoryDemo {
    public static void main(String[] args) {

        CakeFactory cakeFactory = new CakeFactory();

        Cake cake1 = cakeFactory.createCake("chocolate");
        Cake cake2 = cakeFactory.createCake("cream");
        Cake cake3 = cakeFactory.createCake("banana");
        Cake cake4 = cakeFactory.createCake("strawberry");
        Cake cake5 = cakeFactory.createCake("non-existent-type");

        System.out.println(cake1.make() + ", cost : $" + cake1.cost());
        System.out.println(cake2.make() + ", cost : $" + cake2.cost());
        System.out.println(cake3.make() + ", cost : $" + cake3.cost());
        System.out.println(cake4.make() + ", cost : $" + cake4.cost());
        System.out.println(cake5.make() + ", cost : $" + cake5.cost());

    }
}
