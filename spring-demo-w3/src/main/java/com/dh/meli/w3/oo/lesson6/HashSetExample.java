package com.dh.meli.w3.oo.lesson6;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	
	public static void main(String[] args) {
	
		Set<String> set = new HashSet<>();
		set.add("kenyo");
		set.add("mauri");
		set.add("filipe");
		set.add("joice");
		
		iterarPorForEach(set);
		iterarPorIterator(set);
		
	}

	private static void iterarPorIterator(Set<String> set) {
		System.out.println("\n\n\niterando por iterator");
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	private static void iterarPorForEach(Set<String> set) {
		System.out.println("\n\n\niterando por foreach");
		for(String item: set) {
			System.out.println(item);
		}
	}

}
