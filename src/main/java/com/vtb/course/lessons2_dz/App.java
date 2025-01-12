package com.vtb.course.lessons2_dz;

import com.vtb.course.lessons2_dz.impl.*;

public class App {
	public static void main(String[] args) {
		Obstacle[] obstacles = new Obstacle[]{
				new Wall(3),
				new Treadmill(10),
				new Wall(11)
		};

		Contestant[] contestants = new Contestant[]{
				new Cat(70, 4),
				new Human(449, 1),
				new Robot(1000, 20),
		};

		for (Contestant contestant: contestants ){
			for(Obstacle obstacle:obstacles ){
				if(!obstacle.contest(contestant)) break;
			}
		}
	}
}
