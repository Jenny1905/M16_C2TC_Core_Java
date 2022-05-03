package com.indiabix.collections;

import java.util.PriorityQueue;

public class Example2 {

	public static void main(String[] args) {
		PriorityQueue obj=new PriorityQueue();
		obj.add(17);
		obj.add(22);
		obj.add(5);
		System.out.println(obj);
		
		System.out.println(obj.element());
	}

}
