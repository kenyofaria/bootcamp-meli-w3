package com.dh.meli.w3.oo.lesson9;

import java.util.HashMap;
import java.util.Map;

public class MainLambdaMap {

	
	public static void main(String[] args) {
		Map<String, Integer> nameMap = new HashMap();
		nameMap.put("Maria de Fatima", 10);
		nameMap.put("Maria das Dores", 3);
		nameMap.put("Thiago Luís", 2);
		nameMap.put("Kenyo Abadio", 1);
		nameMap.put("Arthur Filipe", 1);
		
		
		//Integer value = nameMap.computeIfAbsent("Antonio", s -> s.length());
		
		//nameMap.computeIfPresent("Maria", )
		//System.out.println(nameMap.computeIfPresent("Maria", s -> s.length()));
	}
}
