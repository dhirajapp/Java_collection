



###. Without Generics Throws classcastException.

class Pair
{
	Object x;
	Object y;

}

class Test
{
	public static void main(String args[])
	{
		Pair p=new Pair();

		p.x=12;
		p.y="Dhiraj";

		String str=(String)p.x;
		System.out.print(str);
	}
}


