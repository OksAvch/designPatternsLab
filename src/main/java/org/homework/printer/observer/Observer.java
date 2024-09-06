package org.homework.printer.observer;


public interface Observer {
    void update(Event event);

    Event restore();
}
