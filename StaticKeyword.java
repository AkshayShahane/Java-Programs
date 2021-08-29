package pack2;

/*This program illustrate that static multiple static block executed
 * according to its order...*/

public class StaticKeyword 
{
	static 
	{
		System.out.println("This is first static block");
	}
	
	static
	{
		System.out.println("This is second static block");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("main() is executed after static block");
	}
	
	static
	{
		System.out.println("This is third static block ");
	}
}
