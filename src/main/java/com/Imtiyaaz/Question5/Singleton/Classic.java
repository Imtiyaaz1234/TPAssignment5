package com.Imtiyaaz.Question5.Singleton;

/**
 * Created by Imtiyaaz on 2017/04/01.
 */
public class Classic {

    private static Classic instance = new Classic();


    private Classic(){

    }


    public static Classic getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Example of a Singleton");
    }

}
