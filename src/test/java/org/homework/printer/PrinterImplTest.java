package org.homework.printer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.homework.printer.editor.EditInput;
import org.homework.printer.editor.GenerateBadgeLevel3;
import org.homework.printer.editor.GenerateMonthEmployeeBadge;
import org.homework.printer.entity.User;
import org.homework.printer.observer.EditorObserver;
import org.homework.printer.observer.Event;
import org.homework.printer.observer.Observer;
import org.homework.server.entity.AccessLevel;
import org.junit.jupiter.api.Test;

class PrinterImplTest {
    private final Observer observer = new EditorObserver();
    private final BadgePrinter sut = new BadgePrinterImpl(observer);

    @Test
    void shouldGenerateLevel1Badge() {
        String result = sut.printUserBadge(new User("Bob", AccessLevel.L3, true));
        assertEquals("==== THIS MONTH BEST 'Senior manager Bob' ====", result);

        EditInput actualInput = new EditInput(null, null);

        Event editorMonthEmployee = observer.restore();
        actualInput.restoreMemento(editorMonthEmployee.getMemento());
        assertEquals(GenerateMonthEmployeeBadge.class.getName(),
                editorMonthEmployee.getModification());
        assertEquals("Senior manager Bob", actualInput.getResult());

        editorMonthEmployee = observer.restore();
        actualInput.restoreMemento(editorMonthEmployee.getMemento());
        assertEquals(GenerateBadgeLevel3.class.getName(), editorMonthEmployee.getModification());
        assertEquals("", actualInput.getResult());
    }

}