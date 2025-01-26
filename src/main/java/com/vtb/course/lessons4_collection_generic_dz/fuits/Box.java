package com.vtb.course.lessons4_collection_generic_dz.fuits;

import java.util.ArrayList;

public class Box<T extends Fruits> implements Comparable<Box<?>> {
	ArrayList<T> fruits;
	float weight;

	public int getSize() {
		return fruits.size();
	}

	public ArrayList<T> getFruits() {
		return fruits;
	}

	public float getWeight() {
		return weight;
	}

	public void add(T fruit) {
		fruits.add(fruit);
		weight += fruit.getWeight();
	}

	public void pourOver(Box<T> box) {
		box.fruits.addAll(this.fruits);
		this.fruits.clear();
	}


	public Box() {
		fruits = new ArrayList<>();
	}

	@Override
	public int compareTo(Box<?> box) {
		if (this == box) {
			return 0;
		}
		int result = Integer.compare(this.fruits.size(), box.fruits.size());
		for (int i = 0; i < getSize(); ++i) {
			result = Double.compare(this.getWeight(), box.getWeight());
		}
		return result;
	}
}

//      == : 0
//      left : -1
//      right :  1
