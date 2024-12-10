package org.homework.iterator;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class Order {
    private String name;
    private LocalDateTime pickUpdateTime;
    private boolean isHomeDelivery;
}
