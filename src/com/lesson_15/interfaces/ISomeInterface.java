package com.lesson_15.interfaces;

public interface ISomeInterface extends Bounceable {
    // interface can have constants
    // by default all fields of interface are final and has public and static modifier
    int MY_VARIABLE = 14;

    // by default all methods of interface are abstract with public modifier
    void someMethod();
}

interface Bounceable {
    void bounce();
}
