package com.lesson_16.modifiers.one;

public class TestClass {
    // private variable is only visible within the class which it is declared
    private int i = 5;
    // protected variable is visible only in extended classes and within
    // the package in which it is declared
    protected int j = 6;
    // variable with default modifier (package visible) are same as protected. Often used with utility classes
    int k = 7;
    // variable with public modifier is accessible from anywhere
    public int h = 8;

    public TestClass() {
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(h);
    }
}

// using
class ExtendedClass extends TestClass {
    void someMethod() {
        System.out.println(j);
        System.out.println(k);
        System.out.println(h);
    }
}
