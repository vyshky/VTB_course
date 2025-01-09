package com.vtb.course.lessons2_oop.enums;

public enum Fruit {
	ORANGE(1), APPLE(2), BANANA(3), CHERRY(4);
	int value;

	private Fruit(int i) {
		value = i;
	}
}

// консруктор - по дефолту private
// поля - по умолчанию имеют модификатор доступа default, и доступны из пакета, сделал проверку в DefaultClass