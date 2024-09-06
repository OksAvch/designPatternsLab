package org.homework.visitor;

public class Hotel implements Place {
    @Override
    public void accept(ReporterVisitor visitor) {
        visitor.visit(this);
    }
}
