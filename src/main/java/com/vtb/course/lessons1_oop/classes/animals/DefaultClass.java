package com.vtb.course.lessons1_oop.classes.animals;

public class DefaultClass {
    AbstractClass abstractClass = new AbstractClass();

    void getDefaultVariable() {
        String def = abstractClass._default;
        String pro = abstractClass._protected;
        String pub = abstractClass._public;
    }
}
