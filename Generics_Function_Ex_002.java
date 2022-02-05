###  Demonstrate working of generic function



import java.util.*;

class MyGen<T>
{
	T x;
	static int count;
	MyGen()
	{
		count++;
	}
}

class Test
{
	public static void main(String args[])
	{
		MyGen<Integer> m1=new MyGen<Integer>();

		MyGen<Integer> m2=new MyGen<Integer>();

		System.out.println(MyGen.count);
	}
}




### output : 2
