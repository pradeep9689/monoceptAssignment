package com.monocept.evication.test;

import com.monocept.evication.model.CustomMap;
import com.monocept.evication.model.EvictionStrategy;
import com.monocept.evication.model.FIFOStrategy;
import com.monocept.evication.model.LFUStrategy;
import com.monocept.evication.model.LRUStrategy;

public class evicationTest {
	private static CustomMap<String, Integer> customMap;

	public static void main(String[] args) {

		EvictionStrategy<String, Integer> strategy = new LFUStrategy<>(3);
		// EvictionStrategy<String, Integer> strategy = new FIFOStrategy<>(3);
		// EvictionStrategy<String, Integer> strategy = new LRUStrategy<>(3);

		CustomMap<String, Integer> customMap = new CustomMap<>(strategy);

		customMap.put("a", 1);
		customMap.put("b", 2);
		customMap.put("c", 3);

		System.out.println(customMap.get("a"));

		customMap.put("d", 4);

		System.out.println(customMap.get("a"));
		System.out.println(customMap.get("b"));
		System.out.println(customMap.get("c"));
		System.out.println(customMap.get("d"));
	}
}