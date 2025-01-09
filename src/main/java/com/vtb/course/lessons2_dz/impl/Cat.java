package com.vtb.course.lessons2_dz.impl;

import com.vtb.course.lessons2_dz.RunJmp;

public final class Cat implements RunJmp {
	private final int maxDistance;
	private final int maxJmp;

	public Cat(int maxDistance, int maxJmp) {
		this.maxDistance = maxDistance;
		this.maxJmp = maxJmp;
	}

	@Override
	public boolean run(Treadmill treadmill) {

		if (treadmill.getDistance() <= maxDistance && treadmill.getDistance() >= 0) {
			System.out.println("Кошка бежит");
			return true;
		} else {
			System.out.println("Кошка устала и не добежала");
		}
		return false;
	}

	@Override
	public boolean jump(Wall wall) {
		if (wall.getHeight() <= maxJmp && wall.getHeight() >= 0) {
			System.out.println("Кошка допрыгнул");
			return true;
		} else {
			System.out.println("Кошка не допрыгнула");
		}
		return false;
	}
}
