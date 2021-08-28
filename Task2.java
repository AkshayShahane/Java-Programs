package homework;

public class Task2 
{
	static int i=10;
	static
	{
		display();
		System.out.println("First Static block"+i);
	}
	Task2()
	{
		System.out.println("This is static flow");
	}
	public static void main(String[] args) 
	{
		display();
		System.out.println("Main Method");
	}
	static void display()
	{
		System.out.println("This is display method");
	}
	static
	{
		new Task2();
		System.out.println("Second static block"+j);
	}
	static int j=20;
}
