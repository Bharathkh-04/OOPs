package CustomArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class customarraylist {
	private int[] data;
	private static int default_size=10;
	private int size=0;
	
	
	
	
public customarraylist() {
		this.data = new int[default_size];
	}

public void add(int num) {
	if(this.isFull())
	{
		resize();
	}
	data[size++]=num;
}



private void resize() {
	// TODO Auto-generated method stub
	int []temp=new int[data.length*2];
	
	for(int i=0;i<data.length;i++)
	{
		temp[i]=data[i];
	}
	data=temp;
}

private boolean isFull() {
	// TODO Auto-generated method stub
	return size==data.length;
}

public int remove()
{
	int removed=data[--size];
	return removed;
}

public int get(int index)
{
	return data[index];
}

public int size()
{
	return size;
}
public void set(int index,int value)
{
	data[index]=value;
}


@Override
public String toString() {
	return "customarraylist [data=" + Arrays.toString(data) + ", size=" + size + "]";
}

public static void main(String[] args) {
	//ArrayList list=new ArrayList();
	 customarraylist list=new customarraylist();
	 list.add(5);
	 list.add(8);
	 list.add(56);
	 System.out.println(list);
}
}
