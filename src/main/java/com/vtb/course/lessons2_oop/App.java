package com.vtb.course.lessons2_oop;

import com.vtb.course.lessons2_oop.classes.Outer;
import com.vtb.course.lessons2_oop.enums.Fruit;

public class App {
	public static void main(String[] args) {
		System.out.println("Все элементы перечисления:");
		for (Fruit fruit : Fruit.values()) {
			System.out.println(fruit);
		}
		System.out.println("Поиск по названию: " + Fruit.valueOf("BANANA"));

	}
}
