package pack2;

public class Smallest 
{
	public static void main(String[] args) 
	{
		Smallest obj=new Smallest();
		obj.meth1(912,54,876);
	}
	public void meth1(int a,int b,int c)
	{
		if(a<b)
		{
			if(a<c)
			{
				System.out.println("a is smaller");
			}
			else
			{
				System.out.println("c is smaller");
			}
		}
		else if(b<a)
		{
			if(b<c)
			{
				System.out.println("b is smaller");
			}
			else
			{
				System.out.println("c is smaller");
			}
		}
		
	}
}
