package com.monocept.evication.model;

public interface EvictionStrategy<K, V> {
	V get(K key);

	void put(K key, V value);

}
