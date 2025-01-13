package com.vtb.course.lessons1_oop.classes;

import com.vtb.course.lessons1_oop.classes.animals.AbstractClass;

public class ProtectClass extends AbstractClass {
    AbstractClass abstractClass = new AbstractClass();
    void getProtectVariable() {
        String pro = _protected;
        String pub = _public;
    }
}
