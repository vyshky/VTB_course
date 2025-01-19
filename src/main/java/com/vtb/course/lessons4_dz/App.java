package com.vtb.course.lessons4_dz;

import com.vtb.course.lessons4_dz.classes.Collections;
import com.vtb.course.lessons4_dz.fuits.Apple;
import com.vtb.course.lessons4_dz.fuits.Box;
import com.vtb.course.lessons4_dz.fuits.Fruits;
import com.vtb.course.lessons4_dz.fuits.Orange;

public class App {
	public static void main(String[] args) {
		Collections collections = new Collections();

		// 1
//		List<String> list = new ArrayList(List.of("apple", "banana", "orange", "dog","cat","home","green"));
//		collections.regroupElements(list,5,1);
//		System.out.println(list);

		// 2
//		Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//		System.out.println(collections.transformArray(arr));

		// 3
//		Box<Apple> appleBox = new Box<>();
//		appleBox.add(new Apple());
//		appleBox.add(new Apple());
//		appleBox.add(new Apple());
//		appleBox.add(new Apple());
//		appleBox.add(new Apple());
//		appleBox.add(new Apple());
//		System.out.println(appleBox.getWeight());
//
//		Box<Orange> orangeBox = new Box<>();
//		orangeBox.add(new Orange());
//		orangeBox.add(new Orange());
//		orangeBox.add(new Orange());
//		orangeBox.add(new Orange());
//		System.out.println(orangeBox.getWeight());
//
//		System.out.println(orangeBox.compareTo(appleBox) == 0 ? "true" : "false");

		// 4
		// Пересыпаем из одной в другую
		Box<Apple> appleBox = new Box<>();
		appleBox.add(new Apple());
		appleBox.add(new Apple());
		appleBox.add(new Apple());
		appleBox.add(new Apple());
		appleBox.add(new Apple());
		appleBox.add(new Apple());

		Box<Apple> emptyBox = new Box<>();
		appleBox.pourOver(emptyBox);
		System.out.println(emptyBox.getSize());
		System.out.println(appleBox.getSize());

	}
}


//List.of - immutableList
//new ArrayList<>(List.of("Первый", "Второй")); - mutableList