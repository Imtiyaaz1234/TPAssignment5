package com.Imtiyaaz.Question5.Proxy;

/**
 * Created by Imtiyaaz on 2017/04/01.
 */
public class HotelProxy extends Hotel {
    private static final int NUM = 3;

    private int numCust;

    @Override
    public void enter(Owner owner) {
        if (numCust < NUM) {
            super.enter(owner);
            numCust++;
        } else {
            System.out.println(owner + " is not allowed to enter!");
        }
    }
}
