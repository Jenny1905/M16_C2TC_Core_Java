package com.indiabix.collections;

import java.util.Vector;

public class Example5 {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(0,"Anurag");
		v.add(1,21);
		v.add(2,67.98);
		System.out.println(v);
		v.setElementAt(22,1);

		System.out.println(v);
	}

}
