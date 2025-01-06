package com.vtb.course.lessons1_oop.classes.animals;

public class AbstractClass {
    public String _public;
    private String _private;
    String _default;
    protected String _protected;

    void getPrivateVariable(){
        String pub = _public;
        String pri = _private;
        String def = _default;
        String pro = _protected;
    }
}