package pack2;

public class control 
{
	void meth1(int a,int b,int c)
	{
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("a is greater");
			}
			else
			{
				System.out.println("c is greater");
			}
		}
		else
		{
			if(b>c)
			{
				System.out.println("b is greater");
			}
			else
			{
				System.out.println("c is greater");
			}
		}
	}
	public static void main(String[] args) 
	{
		control obj=new control();
		System.out.println("Enter in main()");
		obj.meth1(9200,3265,845);
		System.out.println("Exit in main()");
	}
}
