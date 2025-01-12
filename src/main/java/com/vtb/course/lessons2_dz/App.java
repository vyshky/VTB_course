package com.vtb.course.lessons2_dz;

import com.vtb.course.lessons2_dz.impl.*;

public class App {
	public static void main(String[] args) {
		Obstacles[] obstacles = new Obstacles[]{
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
			for (int i=0; i!= obstacles.length; ++i){
				if (!obstacles[i].contest(contestant)){
					break;
				}
			}
		}
	}
}
