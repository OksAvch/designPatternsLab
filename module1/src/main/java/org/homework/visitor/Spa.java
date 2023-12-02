package org.homework.visitor;

public class Spa implements Place {
    @Override
    public void accept(ReporterVisitor client) {
        client.visit(this);
    }
}
