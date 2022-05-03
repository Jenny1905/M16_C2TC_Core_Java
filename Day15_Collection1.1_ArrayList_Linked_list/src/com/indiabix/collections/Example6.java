package com.indiabix.collections;

import java.util.Stack;

public class Example6 {

	public static void main(String[] args) {
		Stack s=new Stack();
		s.add(1);
		s.add(2);
		s.add(3);
		System.out.println(s);
		s.pop();
		s.pop();
		System.out.println(s);

	}

}
