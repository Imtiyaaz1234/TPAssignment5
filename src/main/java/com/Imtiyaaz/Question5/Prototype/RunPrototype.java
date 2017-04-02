package com.Imtiyaaz.Question5.Prototype;

/**
 * Created by Imtiyaaz on 2017/04/01.
 */
public class RunPrototype {
    public static void main(String[]args)
    {
        Hero her;
        Beast beast;

        her = new HeroC(new GymBeast());

        beast = her.createBeast();

        System.out.println(beast);
    }

}
