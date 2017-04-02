package com.Imtiyaaz.Question5.Strategy;

/**
 * Created by Imtiyaaz on 2017/04/01.
 */
public class RunStrat {
    public static void main(String[]args)
    {
        FootballStrategy foot = new FootballStrategy(new DefensiveStrat());
        foot.FullAttack();
        foot.changeStrategy(new TeamPressing());
        foot.FullAttack();
    }
}
