package com.vtb.course.lessons2_dz.impl;

import com.vtb.course.lessons2_dz.Contestant;
import com.vtb.course.lessons2_dz.Obstacle;

public final class Wall implements Obstacle {
	private int height;

	public Wall(int height) {
		this.height = height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getHeight() {
		return height;
	}

	@Override
	public boolean contest(Contestant contestant) {
		return contestant.jump(this);
	}
}
