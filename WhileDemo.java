package pack2;

public class WhileDemo 
{
	public void meth1()
	{
		System.out.println("***meth1()***");
		int a=20;
		while(a<=10)
		{
			System.out.println("count==>"+a);
			a++;
		}
		System.out.println("meth1() execution completed");
	}
	void meth2()
	{
		System.out.println("***meth2()***");
		int a=1;
		while(a<=5)
			//int x=100;	CE	
			System.out.println("count==>"+a);
			a++;
			System.out.println("meth2() execution completed");
	}
	void meth3()
	{
		System.out.println("***meth3()***");
		int a=1;
		while(true)
		{
			System.out.println("count==>"+a);
			a++;
		}
		//System.out.println("meth3() execution completed");
	}
	void meth4()
	{
		System.out.println("***meth4()***");
		int a=20;
		do
		{
			System.out.println("count==>"+a);
		}while(a<=5);
		System.out.println("meth4() execution completed");
	}
	public static void main(String[] args) 
	{
		WhileDemo obj=new WhileDemo();
//		obj.meth1();
//		obj.meth2();
//		obj.meth3();
		obj.meth4();
	}
	
}
