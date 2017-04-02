package com.Imtiyaaz.Question5.Singleton;

/**
 * Created by Imtiyaaz on 2017/04/01.
 */
public class RunClassic {
   public static void main(String[]args)
   {
       Classic message = Classic.getInstance();


       message.showMessage();
   }

}
