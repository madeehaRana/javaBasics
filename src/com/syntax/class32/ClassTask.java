package com.syntax.class32;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ClassTask {

	public static void main(String[] args) {
		Map<String, String> countries = new TreeMap<>();
		countries.put("DC", "USA");
		countries.put("Islamabad", "Pakistan");
		countries.put("Cairo", "Egypt");
		countries.put("Rome","Italy");
		
		Set<String> keys = countries.keySet();
		System.out.println("========With loop============");
		for(String k:keys) {
			System.out.println(k+"-----"+countries.get(k));
		}
		System.out.println("-----------With iterator-----------");
		Iterator<String>k=keys.iterator();
		while(k.hasNext()) {
			String key=k.next();
			System.out.println(key+"*********"+countries.get(key));
		}
		System.out.println(" ==========with loop just values");
		Collection<String> values = countries.values();
		for(String v:values) {
			System.out.println(v);
		}
		System.out.println(" ---------with iterator just values");
		Iterator<String>v=values.iterator();
		while(v.hasNext()) {
			String val=v.next();
			System.out.println(val);
		}

	}

}
