package com.lesson_11.polymorphism;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.getNumberOfSeats());

        Car toyota = new Toyota();
        System.out.println(toyota.getNumberOfSeats());
    }
}
