package com.lesson_6.variables;

public class Program {
    byte a; // 1 byte -2^7 - (2^7)-1
    short b; // 2 byte -2^15 - (2^15)-1
    int c; // 4 byte -2^31 - (2^31)-1
    long d; // 8 byte -2^63 - (2^63)-1
    float e = 12.523f; // 4 byte
    float e1 = (float) 12.523; // 4 byte
    double f = 12.523; // 8 byte
    boolean g; // true or false
    char h = '2';

    Human mom; // reference type - containing reference to object of Human in the program memory
    // Human dad = new Human(); - StackOverflow

    Car car = null;

    public static void main(String[] args) {

    }
}

class Human {
    int age = 20;

    // has 3 type of memory: stack, heap, perm space
    // Heap space: All live objects are allocated here.
    // Stack space: Stores references to the object for variable in method call or variable instantiation.
    // Perm space: Stores loaded classes information

    public Human(int age) {
        this.age = age;
        Car car = new Car();
    }

    // Heap: stores "new Car()"
    // Stack: stores information about "car"
    // Perm Space: stores information about Car class
}

class Car {
}