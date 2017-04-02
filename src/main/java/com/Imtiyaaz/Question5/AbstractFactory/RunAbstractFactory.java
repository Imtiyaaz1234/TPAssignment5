package com.Imtiyaaz.Question5.AbstractFactory;

/**
 * Created by Imtiyaaz on 2017/04/01.
 */
public class RunAbstractFactory {
    public static void main(String[]args)
    {
       createWorld(new NewWorld());

    }

    public static void createWorld(World factory){
        Boss boss = factory.createBoss();
        House house = factory.createHouse();
        People people = factory.createPeople();
        System.out.println("Your business world was created.");
        System.out.println(boss);
        System.out.println(house);
        System.out.println(people);
    }
}
