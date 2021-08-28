package pack2;

public class StaticVarANDblock2 
{
	/*This program illustrate that in static block ,static variable and main
	 * method static variable and static block have same priority
	 * so as both have same priority those who come/written first will
	 * execute first(only applicable for static variable and static block)*/
	
	
	int meth1()
	{
		int a=10;
		System.out.println(a);
		System.out.println("Second");
		return 0;
	}
	
	public static void main(String[] args) 
	{
		System.out.println("main() is called");
		System.out.println("Last");
	}
	static
	{
		System.out.println("we are in static block");
		System.out.println("First");
	}
	static int a=new StaticVarANDblock2().meth1();
}
