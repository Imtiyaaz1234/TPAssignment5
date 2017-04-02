package com.Imtiyaaz.Question5.Proxy;

/**
 * Created by Imtiyaaz on 2017/04/01.
 */
public class Owner {
    private String name;

    public Owner(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
