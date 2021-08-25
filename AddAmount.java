package homework;

public class AddAmount 
{
	int a=500;
	
	AddAmount()
	{
		System.out.println(a);
	}
	AddAmount(int n)
	{
		int result = n + a;
		System.out.println(result);
	}
	public static void main(String[] args) 
	{
		System.out.println("No amount will be added then");
		new AddAmount();
		System.out.println("Amount to be added then");
		new AddAmount(200);
	}
}
