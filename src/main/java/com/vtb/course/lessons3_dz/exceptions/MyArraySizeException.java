package com.vtb.course.lessons3_dz.exceptions;

import java.io.Closeable;

public class MyArraySizeException extends ArrayIndexOutOfBoundsException {
	public MyArraySizeException() {
		super("Неправильный размер массива");
	}
}
