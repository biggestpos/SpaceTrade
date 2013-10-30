package com.biggestpos.spacetrade;

/**
 * Created by robpayne on 10/29/13.
 */
public class Market implements CommerceIF {

    int fuel;
    int maxFuel;

    int food;
    int maxFood;

    int fun;
    int maxFun;

    int credits;

    public Market(int initFuel, int initFood, int initFun, int credits){

        this.fuel = initFuel;
        this.food = initFood;
        this.fun = initFun;

        this.credits = credits;
    }

    public boolean OfferToBuy(Commodity commType, int quantity, int totalCredits){



        return false;
    }

}
