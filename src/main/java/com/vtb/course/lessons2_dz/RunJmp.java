package com.vtb.course.lessons2_dz;

import com.vtb.course.lessons2_dz.impl.Treadmill;
import com.vtb.course.lessons2_dz.impl.Wall;

public interface RunJmp {
	public boolean run(Treadmill treadmill);
	public boolean jump(Wall wall);
}
