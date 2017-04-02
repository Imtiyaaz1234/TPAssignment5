package com.Imtiyaaz.Question5.Strategy;

/**
 * Created by Imtiyaaz on 2017/04/01.
 */
public class FootballStrategy implements Strat {
    private Strat strategy;

    public FootballStrategy(Strat strategy)
    {
        this.strategy = strategy;
    }

    public void changeStrategy(Strat strategy) {
        this.strategy = strategy;
    }


    public void FullAttack() {
        strategy.execute();
    }

    @Override
    public void execute() {

    }
}
