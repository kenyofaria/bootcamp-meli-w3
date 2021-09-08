package com.dh.meli.w3.oo.lesson6;

import java.util.Iterator;
import java.util.Vector;

public class VectorListExample {
	public static void main(String[] args) {
		
		Vector<String> array = new Vector<>();
		array.add("kenyo");
		array.add("mauri");
		array.add("filipe");
		array.add("joice");
		
		iterarPorLoop(array);
		iterarPorForEach(array);
		iterarPorIterator(array);
		
	}

	private static void iterarPorIterator(Vector<String> array) {
		System.out.println("\n\n\niterando por iterator");
		Iterator<String> iterator = array.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	private static void iterarPorForEach(Vector<String> array) {
		System.out.println("\n\n\niterando por foreach");
		for(String item: array) {
			System.out.println(item);
		}
	}

	private static void iterarPorLoop(Vector<String> array) {
		System.out.println("\n\n\niterando por loop");
		for(int i=0; i<array.size(); i++) {
			System.out.println(array.get(i));
		}
	}
}
