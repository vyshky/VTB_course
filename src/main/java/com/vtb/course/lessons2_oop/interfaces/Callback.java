package com.vtb.course.lessons2_oop.interfaces;

public interface Callback {
	public static final int psf = 0;
	public void callback(int param);
	default void callback(){}
}

// public static final - все поля по дефолту
// public - все функции по дефолту public
// default - ключевое слово default, дефолтные функции это их реализация по дефолту