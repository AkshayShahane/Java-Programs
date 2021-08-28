package homework;

public class task 
{
	static int a=0;
	int b=0;
	task()
	{
		a++;
		b++;
		System.out.println("Static Variable==>"+a);
		System.out.println("Instance Variable==>"+b);
		System.out.println("------------------------");
	}
	void display()
	{
		System.out.println("**********Accessing static variable***********");
		System.out.println(task.a);
		System.out.println(a);
		System.out.println(new task().a);
	}
	public static void main(String[] args) 
	{
		new task();
		new task();
		new task();
		System.out.println("####################################");
		new task().display();
	}
}
