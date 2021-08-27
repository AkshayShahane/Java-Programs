package pack2;

public class StaticDemo 
{
	/* This program illustrate that every object have its seperate copy of instance variable*/    	

	static int a;	
	
	void display()
	{
		a++;
		System.out.println("Static Variable====>"+a);
	} 
	
	StaticDemo()
	{
		System.out.println("Constructor executed....");

	}
	public static void main(String[]args)
	{
		new StaticDemo().display();
		new StaticDemo().display();
		new StaticDemo().display();
	}
}
