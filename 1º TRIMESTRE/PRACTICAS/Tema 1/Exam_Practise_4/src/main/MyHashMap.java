package main;

import java.util.HashMap;

public class MyHashMap<K, V> {

	private HashMap<K, V> list;

	public MyHashMap() {
		this.list = new HashMap<>();
	}

	public void put(K key, V value) {
		this.list.put(key, value);
		System.out.println("El valor ha sido añadido/actualizado con éxito");
	}

	public V get(K key) {
		if (this.list.containsKey(key)) {
			return this.list.get(key);
		} else {
			return null;
		}
	}

	public V remove(K key) {
		if (this.list.containsKey(key)) {
			return this.list.remove(key);
		} else {
			return null;
		}
	}

	public int size() {
		return this.list.size();
	}

	public boolean isEmpty() {
		if (size() == 0) {
			return true;
		} else {
			return false;
		}
	}
}
