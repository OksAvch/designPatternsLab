package org.homework.visitor;

public interface ReporterVisitor {
    void visit(Place place);

    void visit(Cafe place);

    void visit(Hotel place);
}
