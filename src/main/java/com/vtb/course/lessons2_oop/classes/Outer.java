package com.vtb.course.lessons2_oop.classes;

public class Outer {
	class  Inner {
		private int innerVar;
		public Inner(int innerVar) {
			this.innerVar = innerVar;
		}
		void innerTest() {
			System.out.println("innerVar: " + innerVar);
			System.out.println("outerVar: " + outerVar);
		}
	}
	private int outerVar;
	public Outer(int outerVar) {
		this.outerVar = outerVar;
	}
	public void outerTest() {
		System.out.println("outerVar: " + outerVar);
// System.out.println("innerVar: " + innerVar); тут ошибка
		Inner io = new Inner(20);
		System.out.println("io.innerVar = " + io.innerVar);
	}
}

// var s = new Outer().new Inner(); - Так можно создавать Inner объект в не класса Outer, new.new. Чтобы это было возможным, нужно выставить нужный модификатор доступа для inner
// приватный, пакетный, наследуемый, публичный

// Из Outer класса есть доступ к приватным полям Inner класса, как буд-то бы он находится в Outer

// private - внутри этих классов есть доступ к любым полям Outer и Inner, private ни как их не скрывает доступ к внутренним полям

