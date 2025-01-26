package com.vtb.course.lessons5_collection_dz;

import java.util.*;

public class App {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(List.of("1", "1", "2", "1", "4", "5", "6", "7", "7", "7"));
		printUnique(list);
		printCountElements(list);

//		Dictionary dictionary = new Dictionary();
//		dictionary.add("Alex", "89090001111");
//		dictionary.add("Alex", "89090001112");
//		dictionary.add("Dmitry", "89090001122");
//		dictionary.add("Ivan", "89090001133");
//		dictionary.add("Tom", "89090001144");
//		System.out.println(dictionary.get("Alex"));
	}

	private static <T> void printUnique(List<T> list) {
		System.out.println(new HashSet<T>(list));
	}

	private static <T> void printCountElements(List<T> list) {
		HashMap<T, Integer> map = new HashMap<>();
		for (int i = 0; i < list.size(); ++i) {
			int count = 0;
			T o = list.get(i);
			for (int y = 0; y < list.size(); ++y) {
				if (o.equals(list.get(y))) {
					++count;
				}
			}
			map.put(o, count);
		}
		System.out.println(map);
	}

}

//Set - уникальные значения
//Map - уникальные значения, хранится как ключ значение
//List - ссылка на массив элементов хранящийся в куче, элементы хранятся друг за другом, при удалении и добавлении, массив смещается и изменяется capasiti
//LinkedList - элементы хранятся в разных местах кучи, у каждого элемента есть ссылка на следующий и предыдущий элемент, при удалении просто меняется ссылка на элемент, без смещения всего массива

// Не уникальные значения
// HashМap, LinkedHashMap, TreeMap
// HashМap - hash map, это значит что есть массив хешей и в каждой ячейке есть список kay, value элементов, элементы хранятся как попало
// LinkedHashMap - то же самое, но элементы хранятся по порядку, в порядке добавления
// TreeMap - tree map, это дерево, которое хранит kay, value элементы

// Уникальные значения
// HashSet(быстрый), LinkedHashSet(средний), TreeSet(медленный)
// HashSet - hash set, это значит что есть массив хешей, и по одному хешу может храниться набор set, хранится не по порядку
// LinkedHashSet - то же самое, но хранится по порядку, в котором были добавлены
// TreeSet - tree set, дерево из сетов, без хешей. Реализует красно-чёрное дерево


// capacity(16) * loadFactor(0.75) - Эта формула по получению количества элементов после которого будет увеличен capacity * 2. Это дефолтные настройки для хешей, чем ниже loadFactor тем быстрее хеши, он может быть от 0.0-1, при больших значения хеши медленнее, но ячейки заполняется по максимуму, а не одним элементом в одной ячейке как при 0.1