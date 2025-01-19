package com.vtb.course.lessons4_dz.classes;

import java.util.ArrayList;
import java.util.List;

public class Collections {
	public <T> void regroupElements(List<T> list, int index1, int index2) {
		if (list.size() > index1 && list.size() > index2 && index1 != index2) {
			List<T> tempList = new ArrayList<>();
			tempList.add(list.get(index1));
			T element = list.get(index2);
			list.set(index1, element);
			list.set(index2, tempList.get(0));
		}
	}

	public <T> ArrayList<T> transformArray(T[] arr) {
		return new ArrayList<>(List.of(arr));
	}

}
