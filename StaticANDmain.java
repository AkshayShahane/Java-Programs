package pack2;

public class StaticANDmain 
{
	/*This program illustrate that in static Block and main method static Block have
	 * more priority than main() */
	
	public static void main(String[] args) 
	{
		System.out.println("main() is executed");
		System.out.println("2");
	}
	
	static
	{
		System.out.println("Static Block is executed");
		System.out.println("1");
	}
}
