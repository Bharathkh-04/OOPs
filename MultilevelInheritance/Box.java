package com.bh.oops.Inheritance;

public class Box {
int length,breadth,height;

Box()//default constructor
{
	super();// object class
	this.length=2;
	this.breadth=2;
	this.height=2;
}

Box(int len,int breadth,int height)//parameterized cnostructor
{
	this.height=height;
	this.breadth=breadth;
	this.length=len;
}

Box(int side)//cube
{
	this.length=side;
	this.breadth=side;
	this.height=side;
}

Box(Box old)//copy constructor
{
	this.length=old.length;
	this.breadth=old.breadth;
	this.height=old.height;
}
}
