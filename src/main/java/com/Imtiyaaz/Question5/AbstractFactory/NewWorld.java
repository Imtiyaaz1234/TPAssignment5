package com.Imtiyaaz.Question5.AbstractFactory;

/**
 * Created by Imtiyaaz on 2017/04/01.
 */
public class NewWorld implements World {

    public People createPeople(){
        return new DifferentPeople();
    }

    public House createHouse(){
        return new DifferentHouse();
    }

    public Boss createBoss(){
        return new DifferentBoss();
    }

    public World createWorld() {
        return null;
    }

}
