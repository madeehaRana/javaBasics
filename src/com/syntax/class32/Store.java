package com.syntax.class32;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Store {

	public static void main(String[] args) {
		Map<Integer, String> store = new LinkedHashMap();
		
		store.put(111222, "Printer");
		store.put(333444, "TV");
		store.put(555666, "Computer");
		store.put(777888, "PS");
		store.put(999000, "SterioSys");
		
	System.out.println("Store map "+store);
	
	Set<Entry<Integer,String>> entries = store.entrySet();
		System.out.println("First set entry objects: "+entries);
		
	for(Entry<Integer,String>ent:entries) {
		System.out.println(ent.getKey()+"       "+ent.getValue());
	}
	
	
	
	}

}
