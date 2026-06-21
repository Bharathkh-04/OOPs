package com.bh.oops.Inheritance;

public class Boxweight extends Box{
int weight;

Boxweight()
{
	super();
	this.weight=1;
}

Boxweight(int len,int breadth,int height,int weight)
{
	super(len,breadth,height);
	this.weight=weight;
}

Boxweight(int side,int weight)
{
	super(side);
	this.weight=weight;
}

Boxweight(Box other)
{
	this.height=other.height;
}
}
