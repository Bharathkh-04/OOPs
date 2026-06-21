package com.bh.oops.Inheritance;

public class Main {
public static void main(String[] args)
{
//	Developer d1=new Developer("java");
//	System.out.println("Name: "+d1.name+"Salary: "+d1.salary+"Language :"+d1.language);
	
	
	Boxweight w1=new Boxweight();
	System.out.println(w1.breadth+" "+w1.height+" "+w1.length);
	
	Boxweight w2=new Boxweight(w1);
	System.out.println(w2.weight);
	
	
	Boxweight w3=new Boxweight(34,2);
	System.out.println("side"+w3.weight);
}
}
