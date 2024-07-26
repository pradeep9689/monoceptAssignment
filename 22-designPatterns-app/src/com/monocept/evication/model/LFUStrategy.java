package com.monocept.evication.model;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class LFUStrategy<K, V> implements EvictionStrategy<K, V> {
	private final int capacity;
	private final Map<K, V> cache = new HashMap<>();
	private final Map<K, Integer> frequency = new HashMap<>();

	public LFUStrategy(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public V get(K key) {
		if (cache.containsKey(key)) {
			frequency.put(key, frequency.getOrDefault(key, 0) + 1);
			return cache.get(key);
		}
		return null;
	}

	@Override
	public void put(K key, V value) {
		if (cache.size() >= capacity) {
			K leastFreqKey = Collections.min(frequency.entrySet(), Map.Entry.comparingByValue()).getKey();
			cache.remove(leastFreqKey);
			frequency.remove(leastFreqKey);
		}
		cache.put(key, value);
		frequency.put(key, frequency.getOrDefault(key, 0) + 1);
	}
}