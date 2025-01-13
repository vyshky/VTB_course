package com.vtb.course.lessons3_dz.exceptions;

public class MyArrayDataException extends NumberFormatException {
	public MyArrayDataException() {
		super("В ячейке массива лежит что-то не то");
	}

	public MyArrayDataException(String number) {
		super("В ячейке массива лежит что-то не то. {value=" + number + "}");
	}
}
