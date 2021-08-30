package pack2;

public class TypeCasting 
{
	int meth1()
	{
		System.out.println("****Implicit Type Casting****");
		byte b=10;
		int i=b;
		float f=b;
		System.out.println("byte value==>"+b);
		System.out.println("int value==>"+i);
		System.out.println("float value==>"+f);
		char a='B';
		int z=a;
		System.out.println("char value==>"+a);
		System.out.println("int value==>"+z);
		return 'A';
	}
	void meth2()
	{
		System.out.println("****Explicit Type Casting****");
		int i=50;
		byte b=(byte)(i);
		System.out.println("int value==>"+i);
		System.out.println("byte value==>"+b);
		//minimumrange+(Result+maximumrange-1)
		float f=10.999f;
		byte b2=(byte)(f);
		System.out.println("float value==>"+f);
		System.out.println("byte value==>"+b2);
	}
	public static void main(String[] args) 
	{
		TypeCasting aobj=new TypeCasting();
		int result=aobj.meth1();
		System.out.println("--------------------------------------");
		aobj.meth2();
		System.out.println("----------------------------------------");
		System.out.println("result=>"+result);
	}
}
