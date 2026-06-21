package com.bh.oops.Inheritance;

public class Boxprice extends Boxweight {
int price;

Boxprice()
{
	super();
	this.price=500;
}

public Boxprice(Box other) {//copy constructor
	super(other);
	// TODO Auto-generated constructor stub
}

public Boxprice(int len, int breadth, int height, int weight) {
	super(len, breadth, height, weight);
	// TODO Auto-generated constructor stub
}

public Boxprice(int side, int weight) {
	super(side, weight);
	// TODO Auto-generated constructor stub
}

}
