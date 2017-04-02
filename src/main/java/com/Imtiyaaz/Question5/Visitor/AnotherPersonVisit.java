package com.Imtiyaaz.Question5.Visitor;

/**
 * Created by Imtiyaaz on 2017/04/01.
 */
public class AnotherPersonVisit implements UnitVisitor {

    public void visitAnotherPerson(AnotherPerson an) {
        System.out.println("Greetings " + an);
    }

    @Override
    public void visitPerson(Person person) {

    }

    @Override
    public void visitAnother(AnotherPerson an) {

    }
}
