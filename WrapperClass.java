package pack2;

public class WrapperClass 
{
	void meth1()
	{
		System.out.println("***Implementing Auto-Boxing***");
		int i=10;
		Integer ival=Integer.valueOf(i);
		System.out.println("int PDT value==>"+i);
		System.out.println("Integer WCO value==>"+ival);
		byte b=20;
		Byte bval=Byte.valueOf(b);
		System.out.println("--------------------------");
		System.out.println("byte PDT value==>"+b);
		System.out.println("Byte WCO value==>"+bval);
		Integer x1=Integer.valueOf(100);
		Integer x2=Integer.valueOf("100");
		System.out.println(x1);
		System.out.println(x2);
		Character cval=Character.valueOf((char)65);
		System.out.println(cval);
	}
	void meth2()
	{
		System.out.println("Implementing Auto-Unboxing");
		Byte bval=Byte.valueOf((byte)50);
		byte b1=bval.byteValue();
		Integer ival=Integer.valueOf(100);
		//Integer i1=ival.IntegerValue();
		System.out.println("Byte WCO==>"+bval);
		//boolean result=flag1.booleanvalue();
		//System.out.println("Boolean WCO==>"+flag1);
		//System.out.println("boolean PDT==>"+result);
	}
	public static void main(String[]args)
	{
		WrapperClass obj=new WrapperClass();
		obj.meth1();
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		obj.meth2();
	}
}
