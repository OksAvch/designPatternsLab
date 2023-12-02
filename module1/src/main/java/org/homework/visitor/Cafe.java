package org.homework.visitor;

public class Cafe implements Place {
    @Override
    public void accept(ReporterVisitor client) {
        client.visit(this);
    }
}
