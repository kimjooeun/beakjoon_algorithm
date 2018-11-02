package practice;

import java.util.Arrays;

public class practice implements Comparable<practice>{
	public String name;
	public int quantity;
	public practice(String name, int quantity) {
		this.name = name;
		this.quantity = quantity;
	}
	
	public int compareTo(practice other) {
		return quantity - other.quantity;
	}

	
	public static void main(String[] args) {
		practice[] fruits = new practice[3];
		fruits[0] = new practice("pineapple", 70);
		fruits[1] = new practice("apple", 100);
		fruits[2] = new practice("orange", 80);
		
		Arrays.sort(fruits);
		
		for(practice name: fruits) {
			System.out.println(name);
		}
		
	}
}
