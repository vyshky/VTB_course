package com.vtb.course.lessons5_collection_dz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Dictionary {
	HashMap<String, List<String>> list = new HashMap<>();

	public void add(String name, String phone) {
		List<String> listPhones;
		if (list.get(name) != null) {
			listPhones = list.get(name);
			listPhones.add(phone);
		} else {
			listPhones = new ArrayList<>(List.of(phone));
			list.put(name, listPhones);
		}
	}

	public List<String> get(String name) {
		return list.get(name);
	}
}
