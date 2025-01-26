package com.vtb.course.lessons4_collection_generic_oop.generics;

import java.util.List;

public class Calculator<T extends Number> {
	public double plus(T a, T b) {
		return a.doubleValue() + b.doubleValue();
	}

	public <E extends Number> double minus(E a, T b) {
		return a.doubleValue() - b.doubleValue();
	}

	public <E extends String> E equals(E a, E b) {
		boolean flag = a.equals(b);
		if (flag) {
			return a;
		} else return b;
	}

	public <T> T getElementAtIndex(List<T> list, int index) {
		if (index < 0 || index >= list.size()) {
			throw new IndexOutOfBoundsException("Invalid index: " + index);
		}
		return list.get(index);
	}

	public <E> void list(List<? super String> a, List<? super String> b) {
	}

	public void minus(List<? extends Number> a, List<? extends Number> b) {
	}


}

//<T extends Cat> - одиночные
//<T extends Person & Accountable> - множественные ограничения
//List<? super Integer>
//List<?>

// & - чтобы ограничить для нескольких типов
// ?(wildcard) - любой тип, передавать не нужно, этоот символ отвечает только за, то что принимается в аргументах. Используется только в функциях
// T - тип который передается при создании объекта, можно передавать в классы и в функции
// (? или любая буква) extend type - можно все что наследуется от типа с права
// super - тип должен быть либо указанным классом, либо его суперклассом. Используется только совместно с ? + super
// extends - типы, которые являются подклассами
