package com.company;

public class Counter {
    private int count;

    public Counter() {
        this.count = 0;
    }

    public int inc(){
        return ++this.count;
    }
}
