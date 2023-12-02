package org.homework.visitor;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ReporterVisitorImpl implements ReporterVisitor {
    @Override
    public void visit(Place place) {
        log.info("Performing revision of not specified place. Following default instructions.");
    }

    @Override
    public void visit(Cafe place) {
        log.info("Performing revision of cafe.");
    }

    @Override
    public void visit(Hotel place) {
        log.info("Performing revision of Hotel.");
    }
}
