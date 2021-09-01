package pack2;

public class Selection 
{
	void meth1(int i)
	{
		System.out.println("***meth1***");
		if(i<10)
		{
			System.out.println("if block executed");
		}
		System.out.println("meth1 execution completed");
	}
	void meth2(int i)
	{
		System.out.println("***meth2***");
		if(i<10)
			System.out.println("hi");
			System.out.println("hello");
			System.out.println("meth2 executed");
	}
	void meth3(int i)
	{
		System.out.println("***meth3***");
		if(i<10)
		
			//int x=30; //compile time error
			System.out.println("hi");
		System.out.println("meth3 execution completed");
	}
	void meth4(int i)
	{
		System.out.println("***meth4***");
		if(i<=10)
		{
			System.out.println("if block executed");
		}
		else
		{
			System.out.println("else block executed");
		}
		System.out.println("meth4 execution completed");
	}
	void meth5(int i)
	{
		System.out.println("***meth5***");
		if(true)
		{
			System.out.println("if block executed");
		}
		else
		{
			System.out.println("else block executed");
		}
		System.out.println("meth5 execution completed");
	}
	void meth6(int i)
	{
		System.out.println("****meth6***");
		if(i>0)
			System.out.println(i+" positive");
		else if(i<0)
			System.out.println(i+" negative");
		else
			System.out.println(i+" is equal to 0");
		System.out.println("meth6 execution completed");
}
	public static void main(String[] args) 
	{
		Selection aobj=new Selection();
		aobj.meth1(5);
		aobj.meth2(99);
		aobj.meth4(100);
		aobj.meth5(5);
		aobj.meth6(0);
	}
}