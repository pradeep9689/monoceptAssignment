package com.monocept.evication.model;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class LRUStrategy<K, V> implements EvictionStrategy<K, V> {
	private final int capacity;
	private final Map<K, V> cache = new HashMap<>();
	private final Map<K, Long> accessTime = new HashMap<>();

	public LRUStrategy(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public V get(K key) {
		if (cache.containsKey(key)) {
			accessTime.put(key, System.nanoTime());
			return cache.get(key);
		}
		return null;
	}

	@Override
	public void put(K key, V value) {
		if (cache.size() >= capacity) {
			K leastRecentKey = Collections.min(accessTime.entrySet(), Map.Entry.comparingByValue()).getKey();
			cache.remove(leastRecentKey);
			accessTime.remove(leastRecentKey);
		}
		cache.put(key, value);
		accessTime.put(key, System.nanoTime());
	}
}