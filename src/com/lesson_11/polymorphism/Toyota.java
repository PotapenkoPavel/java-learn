package com.lesson_11.polymorphism;

public class Toyota extends Car {
    int numberOfSeats = 2;

    @Override
    public int getNumberOfSeats() {
        return 2;
    }
}
