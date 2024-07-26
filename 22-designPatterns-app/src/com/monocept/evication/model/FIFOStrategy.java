package com.monocept.evication.model;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class FIFOStrategy<K, V> implements EvictionStrategy<K, V> {
	private final int capacity;
	private final Map<K, V> cache = new HashMap<>();
	private final Queue<K> order = new LinkedList<>();

	public FIFOStrategy(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public V get(K key) {
		return cache.get(key);
	}

	@Override
	public void put(K key, V value) {
		if (cache.size() >= capacity) {
			K oldestKey = order.poll();
			cache.remove(oldestKey);
		}
		cache.put(key, value);
		order.add(key);
	}
}
