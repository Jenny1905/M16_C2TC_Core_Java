package com.indiabix.oops;

public class Example2 
{
	String name;
	//Parameterized constructor
	Example2(String Name)
	{
		name=Name;
	}
	void display()
	{
		System.out.println("This is "+name);
	}

	public static void main(String[] args) 
	{
		Example2 e1=new Example2("Audi");
		Example2 e2=new Example2("BMW");
		Example2 e3=new Example2("Mercedes-Benz");
		e1.display();
		e2.display();
		e3.display();
	}

}
