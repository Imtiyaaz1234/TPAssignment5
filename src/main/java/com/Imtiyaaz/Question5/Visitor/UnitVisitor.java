package com.Imtiyaaz.Question5.Visitor;

/**
 * Created by Imtiyaaz on 2017/04/01.
 */
public interface UnitVisitor {
    void visitPerson(Person person);
    void visitAnother(AnotherPerson an);
}
