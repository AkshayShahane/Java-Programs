package pack2;

public class NewDemo 
{
	static int x=m1();
	public static void main(String[] args) 
	{
		System.out.println(NewDemo.x);
	}
	static
	{
		System.out.println(x);
	}
	static int m1()
	{
		NewDemo.x=50;
		return m2();
	}
	static int m2()
	{
		System.out.println(NewDemo.x);
		return 100;
	}
}
