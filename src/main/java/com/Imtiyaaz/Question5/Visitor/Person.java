package com.Imtiyaaz.Question5.Visitor;

/**
 * Created by Imtiyaaz on 2017/04/01.
 */
public class Person extends Unit {
    public Person(Unit... children) {
        super(children);
    }

    @Override
    public void accept(UnitVisitor visitor) {
        visitor.visitPerson(this);
        super.accept(visitor);
    }

    @Override
    public String toString() {
        return "commander";
    }
}
