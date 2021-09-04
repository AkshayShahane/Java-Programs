package pack2;

public class ForDemo 
{
	void meth1()
	{
		System.out.println("**meth1**");
		for(int i=1;i<=5;i++)
		{
			System.out.println("i value==>"+i);
		}
		System.out.println("meth1() executed completed");
	}
	void meth2()
	{
		System.out.println("**meth2**");
		int i=1;
		for(;i<=10;i++)
		{
			System.out.println("i value ===>"+i);
			i--;
		}
		System.out.println("meth2() executed completed");
	}
	void meth3()
	{
		System.out.println("***meth3**");
		int i=1;
		for(System.out.println("Java is awesome");i<=5;i++)
		{
			System.out.println("i value==>"+i);
		}
		System.out.println("meth3 execution completed");
	}
	void meth4()
	{
		System.out.println("meth4() execution completed");
	}
	void meth5()
	{
		System.out.println("**meth5()**");//condtion always true
		int i=1;
		for(;;)
		{
			i++;
		}
		//System.out.println("meth5() execution completed");
	}
	public static void main(String[] args) 
	{
		ForDemo aobj=new ForDemo();
//		aobj.meth1();
//		aobj.meth2();
		aobj.meth3();
//		aobj.meth4();
//		aobj.meth5();
	}
}
