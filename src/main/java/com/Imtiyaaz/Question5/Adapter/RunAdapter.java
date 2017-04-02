package com.Imtiyaaz.Question5.Adapter;

/**
 * Created by Imtiyaaz on 2017/04/01.
 */
public class RunAdapter {
    public static void main(String[]args)
    {
        CarMechanic mech = new CarMechanic() {
            @Override
            public void operateDevice() {
                super.operateDevice();
            }
        };
        mech.operateDevice();
    }

}
