package com.lesson_14.abstractClass;


// we cannot use protected and private modifiers with class;
// use only public or default modifier

// java file may contain only one class with public modifier
// and the name of this class must match the name of the file
public class ExampleClass {
    public static void main(String[] args) {
        Ferrari ferrari = new Ferrari();

        System.out.println(ferrari.getSpeed());
        ferrari.run();
        System.out.println(ferrari.getSpeed());
        ferrari.stop();
        System.out.println(ferrari.getSpeed());
    }
}

abstract class Car {
    // field cannot be abstract
    float speed = 0;

    // abstract methods cannot be private of final
    abstract public void run();

    abstract public void stop();
}

class Ferrari extends Car {
    @Override
    public void run() {
        speed = 320f;
    }

    @Override
    public void stop() {
        speed = 0f;
    }

    public float getSpeed() {
        return speed;
    }

}


// we cannot extend from final class
final class MyFinalClass {}

//class ExtendingClass extends MyFinalClass {}

