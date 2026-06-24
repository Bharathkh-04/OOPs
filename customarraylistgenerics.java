package CustomArrayList;

import java.util.Arrays;

public class customarraylistgenerics <T>{


	private Object[] data;
	private static int default_size=10;
	private int size=0;
	
	
	
	
public customarraylistgenerics() {
		this.data = new Object[default_size];
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
	Object[]temp=new Object[data.length*2];
	
	for(int i=0;i<data.length;i++)
	{
		temp[i]=(T)(data[i]);
	}
	data=temp;
}

private boolean isFull() {
	// TODO Auto-generated method stub
	return size==data.length;
}

public T remove()
{
	T removed=(T)(data[--size]);
	return removed;
}

public T get(int index)
{
	return (T)(data[index]);
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
	 
	 customarraylistgenerics list2=new customarraylistgenerics();
	 list2.add(58);
	 list2.add(90);
	 System.out.println(list2);

}
}
