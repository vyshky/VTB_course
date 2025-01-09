package com.vtb.course.lessons2_oop.interfaces;

public final class Client implements Callback {

	@Override
	public void callback(int param) {
		System.out.println("param: " + param);
	}

	public void info() {
		System.out.println("Client Info");
	}
}
