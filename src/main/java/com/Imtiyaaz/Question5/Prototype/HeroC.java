package com.Imtiyaaz.Question5.Prototype;

/**
 * Created by Imtiyaaz on 2017/04/01.
 */
public class HeroC implements Hero {

    private Beast beast;
    public HeroC(Beast beast)
    {
        this.beast = beast;
    }
    public Beast createBeast() {
        try {
            return beast.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
