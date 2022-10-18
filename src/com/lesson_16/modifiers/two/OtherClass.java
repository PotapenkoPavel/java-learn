package com.lesson_16.modifiers.two;

import com.lesson_16.modifiers.one.TestClass;

public class OtherClass extends TestClass {
    public OtherClass() {
        TestClass testClass = new TestClass();
        // we can get only public variable from other package
        System.out.println(testClass.h);
        // but since we are extending from TestClass, we have access to protected variable
        System.out.println(j);

    }
}
