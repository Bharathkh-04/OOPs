package Polymorphism;

import accessmodifiers.A;

public class Main {
public static void main(String[] args) {
//	shape s=new shape();
//	s.area();
//	
//	Circle c=new Circle();
//	c.area();
	
	shape s1=new Triangle();
	s1.area();
	
	A a=new A(38,"antony");
//	
//	System.out.println(a.getNum());
	
	int b=a.num;
	System.out.println(b);
}
}
