package com.monocept.evication.model;

public class CustomMap<K, V> {
	private final EvictionStrategy<K, V> strategy;

	public CustomMap(EvictionStrategy<K, V> strategy) {
		this.strategy = strategy;
	}

	public V get(K key) {
		return strategy.get(key);
	}

	public void put(K key, V value) {
		strategy.put(key, value);
	}
}
