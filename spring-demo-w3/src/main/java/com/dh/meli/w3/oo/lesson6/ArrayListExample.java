package com.dh.meli.w3.oo.lesson6;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	
	public static void main(String[] args) {
	
		ArrayList<String> array = new ArrayList<>();
		array.add("kenyo");
		array.add("mauri");
		array.add("filipe");
		array.add("joice");
		
		iterarPorLoop(array);
		iterarPorForEach(array);
		iterarPorIterator(array);
		
	}

	private static void iterarPorIterator(ArrayList<String> array) {
		System.out.println("\n\n\niterando por iterator");
		Iterator<String> iterator = array.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	private static void iterarPorForEach(ArrayList<String> array) {
		System.out.println("\n\n\niterando por foreach");
		for(String item: array) {
			System.out.println(item);
		}
	}

	private static void iterarPorLoop(ArrayList<String> array) {
		System.out.println("\n\n\niterando por loop");
		for(int i=0; i<array.size(); i++) {
			System.out.println(array.get(i));
		}
	}
}
