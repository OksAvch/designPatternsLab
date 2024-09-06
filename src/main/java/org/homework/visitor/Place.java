package org.homework.visitor;

public interface Place {
    void accept(ReporterVisitor client);
}
