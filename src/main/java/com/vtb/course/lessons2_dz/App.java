package com.vtb.course.lessons2_dz;

import com.vtb.course.lessons2_dz.impl.*;

public class App {
	public static void main(String[] args) {
		Wall[] walls = new Wall[]{
				new Wall(1),
				new Wall(2),
				new Wall(3),
				new Wall(4),
				new Wall(5),
				new Wall(6),
				new Wall(7),
				new Wall(8),
				new Wall(9),
				new Wall(10),
				new Wall(11),
				new Wall(12),
				new Wall(13)
		};

		Treadmill[] treadmills = new Treadmill[]{
				new Treadmill(10),
				new Treadmill(50),
				new Treadmill(100),
				new Treadmill(200),
				new Treadmill(300)
		};

		RunJmp[] objects = new RunJmp[]{
				new Cat(70, 4),
				new Human(300, 1),
				new Human(223, 2),
				new Human(449, 1),
				new Robot(1000, 6),
				new Robot(2000, 7),
				new Robot(3000, 8),
				new Robot(500, 9),
				new Robot(700, 11),
				new Robot(600, 2),
				new Cat(50, 4),
				new Cat(60, 4),
		};

		for (RunJmp obj: objects ){

			for (int i=0; i!= walls.length; ++i){
				if (!obj.jump(walls[i])){
					break;
				}
			}

			for (int i=0; i!= treadmills.length; ++i){
				if (!obj.run(treadmills[i])){
					break;
				}
			}
		}
	}
}
