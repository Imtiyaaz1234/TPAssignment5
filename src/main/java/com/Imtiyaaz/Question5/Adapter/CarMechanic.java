package com.Imtiyaaz.Question5.Adapter;

/**
 * Created by Imtiyaaz on 2017/04/01.
 */
public abstract class CarMechanic implements Engineer {

    private Vehicle veh;

    public CarMechanic()
    {
        veh = new Vehicle();
    }

    public void operateDevice() {
        veh.starts();
        veh.gainSpeed();
        veh.accelerate();
    }
}
