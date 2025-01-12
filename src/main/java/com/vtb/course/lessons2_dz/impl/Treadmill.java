package com.vtb.course.lessons2_dz.impl;

import com.vtb.course.lessons2_dz.Contestant;
import com.vtb.course.lessons2_dz.Obstacle;

public final class Treadmill implements Obstacle {
	private int distance;

	public Treadmill(int distance) {
		this.distance = distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public int getDistance() {
		return distance;
	}

	@Override
	public boolean contest(Contestant contestant) {
		return contestant.run(this);
	}
}
