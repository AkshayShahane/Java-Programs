package pack2;

public class InstanceDemo 
{
	 int a;	
	
	void display()
	{
		a++;
		System.out.println("Instance Variable====>"+a);
	} 
	
	InstanceDemo()
	{
		System.out.println("Constructor executed....");

	}
	public static void main(String[]args)
	{
		new InstanceDemo().display();
		new InstanceDemo().display();
		new InstanceDemo().display();
	}
}
