package com.vtb.course.lessons2_oop.enums;

public class DefaultClass {
	Fruit s = Fruit.APPLE;

	DefaultClass() {
	}

	void getDefaultVariable() {
		int def = s.value;
	}
}

// конструкторы - по умолчанию имеют модификатор доступа default, и доступны из пакета
// методы - по умолчанию имеют модификатор доступа default, и доступны из пакета
// поля - по умолчанию имеют модификатор доступа default, и доступны из пакета