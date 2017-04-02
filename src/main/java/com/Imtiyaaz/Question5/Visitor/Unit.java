package com.Imtiyaaz.Question5.Visitor;

/**
 * Created by Imtiyaaz on 2017/04/01.
 */
public abstract class Unit {
    private Unit[] children;

    public Unit(Unit... children) {
        this.children = children;
    }

    public void accept(UnitVisitor visitor) {
        for (Unit child : children) {
            child.accept(visitor);
        }
    }
}
