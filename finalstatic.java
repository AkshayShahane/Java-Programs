package pack2;

/*This program illustrate that we can use static block as purpose of initialization
 * of final static variable*/

public class finalstatic 
{
	
	final static int a;
	static
	{
		a=50;
		System.out.println(a);
		System.out.println("Entered in Static Block");
	}
	public static void main(String[] args) 
	{
		System.out.println("In main()");
	}
}
