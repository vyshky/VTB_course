package com.vtb.course.lessons1_oop.classes;

import com.vtb.course.lessons1_oop.classes.animals.AbstractClass;

public class PublicClass {
    AbstractClass abstractClass = new AbstractClass();

    void getPublicVariable() {
        String pub = abstractClass._public;
    }
}
