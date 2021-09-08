package com.dh.meli.w3.oo.lesson6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapExample {

	
	public static void main(String[] args) {
	
		HashMap<String, String> map = new HashMap<>();
		map.put("kenyo", "ciencia da computacao");
		map.put("joice", "ciencia da computacao");
		map.put("filipe", "eng. de computacao");
		map.put("mauri", "eng. de computacao");
		

		iterarPorForEach(map);
		iterarPorIterator(map);
		
	}

	private static void iterarPorIterator(HashMap<String, String> map) {
		System.out.println("\n\n\niterando por iterator");
		Iterator<Entry<String, String>> iterator = map.entrySet().iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	private static void iterarPorForEach(HashMap<String, String> map) {
		System.out.println("\n\n\niterando por foreach");
		for(Entry<String, String> item: map.entrySet()) {
			System.out.println(item);
		}
	}

}
