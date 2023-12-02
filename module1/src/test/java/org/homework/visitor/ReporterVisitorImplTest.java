package org.homework.visitor;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.slf4j.Logger;

@ExtendWith(MockitoExtension.class)
class ReporterVisitorImplTest {
    @Mock(name = "org.homework.visitor.ReporterVisitorImpl")
    Logger logger;

    @InjectMocks
    ReporterVisitor reporter;

    @Test
    void visitCafe() {
        Place cafe = new Cafe();
        cafe.accept(reporter);

        Mockito.verify(logger).info("Performing revision of cafe.");
        Mockito.verify(logger).info("Performing revision of cafe.");
    }

    @Test
    void testHotel() {
        Place hotel = new Hotel();
        hotel.accept(reporter);
    }

}