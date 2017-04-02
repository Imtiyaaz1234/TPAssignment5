package com.Imtiyaaz.Question5.Visitor;

/**
 * Created by Imtiyaaz on 2017/04/01.
 */
public class AnotherPerson extends Unit {
    public AnotherPerson(Unit... children) {
        super(children);
    }

    @Override
    public void accept(UnitVisitor visitor) {
        visitor.visitAnother(this);
        super.accept(visitor);
    }

    @Override
    public String toString() {
        return "Some other person";
    }
}
