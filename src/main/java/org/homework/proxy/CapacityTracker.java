package org.homework.proxy;

public class CapacityTracker {
    private static final int MAX_COUNT = 10;

    private static int counter;

    public static boolean hasCapacity(){
        if(counter < MAX_COUNT){
            counter++;
            return true;
        }
        else return false;
    }
}
