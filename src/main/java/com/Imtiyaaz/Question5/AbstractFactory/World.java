package com.Imtiyaaz.Question5.AbstractFactory;

/**
 * Created by Imtiyaaz on 2017/04/01.
 */
public interface World {
    People createPeople();
    House createHouse();
    Boss createBoss();
    World createWorld();
}
