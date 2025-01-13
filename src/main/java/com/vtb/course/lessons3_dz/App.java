package com.vtb.course.lessons3_dz;

import com.vtb.course.lessons3_dz.exceptions.MyArrayDataException;
import com.vtb.course.lessons3_dz.exceptions.MyArraySizeException;

// TODO:: Создать свои исключения

public class App {
	public static void main(String[] args) {
		String[][] array = new String[][]{
				new String[]{"1", "2", "3", "0"},
				new String[]{"4", "5", "6", "0"},
				new String[]{"7", "8", "9", "0"},
				new String[]{"10", "11", "12", "0"}
		};
		try {
			test4x4Matrix(array);
			int sum = strToIntMatrix(array);
			System.out.println(sum);
		} catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println(e);
		}
	}

	private static void test4x4Matrix(String[][] matrix) throws MyArraySizeException {
		if (matrix.length != 4) {
			throw new MyArraySizeException();
		}
		for (String[] arr: matrix){
			if (arr.length != 4) {
				throw new MyArraySizeException();
			}
		}
	}

	private static int strToIntMatrix(String[][] matrix) throws MyArrayDataException {
		int sum = 0;
		for (String[] arr : matrix) {
			for (int i = 0; i < matrix.length; ++i) {
				if (tryParseInt(arr[i])) {
					sum += Integer.parseInt(arr[i]);
				} else {
					throw new MyArrayDataException(arr[i]);
				}
			}
		}
		return sum;
	}

	private static boolean tryParseInt(String number) {
		try {
			Integer.parseInt(number);
			return true;
		} catch (NumberFormatException ignored) {
			return false;
		}
	}

}