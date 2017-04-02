package com.Imtiyaaz.Question5.Proxy;

/**
 * Created by Imtiyaaz on 2017/04/01.
 */
public class RunProxy {
    public static void main(String[]args)
    {
        HotelProxy tower = new HotelProxy();
        tower.enter(new Owner("Donald Trump"));
        tower.enter(new Owner("Barack Obama"));


    }
}
