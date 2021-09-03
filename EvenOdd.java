package pack2;

public class EvenOdd 
{
	public void meth1(int n)
	{
		System.out.println("You entered in meth1()");
		System.out.println("You entered "+n);
		if(n%2==0)
		{
			System.out.println("Entered value is even...");
		}
		else
		{
			System.out.println("Entered value is odd....");
		}
		System.out.println("You are out from if-else block...");
	}
	
	
	public static void main(String[] args) 
	{
		System.out.println("You are in main()");
		System.out.println("--------------------------------------");
		EvenOdd obj=new EvenOdd();
		obj.meth1(24);
		System.out.println("Now,You are going out from main()");
	}
}
