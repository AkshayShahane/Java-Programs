package pack2;

public class RelationalOperatorDemo1 
{
	void meth1(int age)
	{
		if(age>=18)
		{
			System.out.println("Yes,you are eligible for Vote....");
		}
		else
		{
			System.out.println("Sorry!!! you are not eligible for Vote...");
		}
	}
	RelationalOperatorDemo1()
	{
		System.out.println("Non-parametrized constructor is called.");
	}
	public static void main(String[] args) 
	{
		RelationalOperatorDemo1 obj=new RelationalOperatorDemo1();
		System.out.println("---------------------------------");
		obj.meth1(32);
	}
}
