package com.vtb.course.lessons2_dz.impl;

import com.vtb.course.lessons2_dz.Contestant;

public final class Robot implements Contestant {
	private final int maxDistance;
	private final int maxJmp;

	public Robot(int maxDistance, int maxJmp) {
		this.maxDistance = maxDistance;
		this.maxJmp = maxJmp;
	}

	@Override
	public boolean run(Treadmill treadmill) {
		if (treadmill.getDistance() <= maxDistance && treadmill.getDistance() >= 0) {
			System.out.println("Робот бежит");
			return true;
		} else {
			System.out.println("Робот не добежал");
		}
		return false;
	}


	@Override
	public boolean jump(Wall wall) {
		if (wall.getHeight() <= maxJmp && wall.getHeight() >= 0) {
			System.out.println("Робот допрыгнул");
			return true;
		} else {

			System.out.println("Робот не допрыгнул");
		}
		return false;
	}
}