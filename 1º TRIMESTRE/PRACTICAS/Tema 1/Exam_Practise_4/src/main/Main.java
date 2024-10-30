package main;

public class Main {

	public static void main(String[] args) {
		MyHashMap <String, Integer> list = new MyHashMap<>();
		list.put("apple", 1);
		list.put("banana", 2);
		
		System.out.println(list.get("apple"));
		System.out.println(list.get("orange"));
		
		list.put("apple", 3);
		
		System.out.println(list.get("apple"));
		System.out.println(list.remove("banana"));
		
		System.out.println(list.size());
		System.out.println(list.isEmpty());

	}

}
