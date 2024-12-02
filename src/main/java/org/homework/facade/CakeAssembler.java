package org.homework.facade;

public class CakeAssembler {
    public String makeCake(String sponge, String filling, String cream) {
        return String.format("%s - %s - %s", sponge, filling, cream);
    }
}
