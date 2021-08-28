package pack2;

public class StaticDemo2 
{
	static int x=m1();
	public static void main(String[] args) 
	{
		System.out.println(StaticDemo2.x);
	}
	static
	{
		System.out.println(x);
		StaticDemo2.x=x+20;
	}
	static int m1()
	{
		StaticDemo2.x=50;
		return m2();
	}
	static int m2()
	{
		System.out.println(StaticDemo2.x);
		return 100;
	}
}
