package com.Imtiyaaz.Question5.Prototype;

/**
 * Created by Imtiyaaz on 2017/04/01.
 */
public class GymBeast extends Beast {

    public GymBeast() {
    }

    public GymBeast(GymBeast beast) {
    }

    @Override
    public Beast clone() throws CloneNotSupportedException {
        return new GymBeast(this);
    }

    @Override
    public String toString() {
        return "TheMan eagle";
    }

}
