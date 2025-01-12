package com.vtb.course.lessons2_dz.impl;

import com.vtb.course.lessons2_dz.Contestant;

public final class Human implements Contestant {
	private final int maxDistance;
	private final int maxJmp;

	public Human(int maxDistance, int maxJmp) {
		this.maxDistance = maxDistance;
		this.maxJmp = maxJmp;
	}
	@Override
	public boolean run(Treadmill treadmill) {
		if (treadmill.getDistance() <= maxDistance && treadmill.getDistance() >= 0) {
			System.out.println("Человек бежит");
			return true;
		} else {
			System.out.println("Человек устал и не добежал");
		}
		return false;
	}

	@Override
	public boolean jump(Wall wall) {
		if (wall.getHeight() <= maxJmp && wall.getHeight() >= 0) {
			System.out.println("Человек допрыгнул");
			return true;
		} else {

			System.out.println("Человек не допрыгнул");
		}
		return false;
	}
}
