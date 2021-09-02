package pack2;

public class SwitchClass 
{
	void meth1()
	{
		System.out.println("Implementing switch case");
		int a=65;
		byte b1=30;
		final byte b2=40;
		switch(b1+10)
		{
			//System.out.println("Hi");	CE
			default:
					System.out.println("Number is not in the range");
					break;
			case 'A':
					System.out.println("case 65 executed");
			case 20:
					System.out.println("case 20 executed");
			case 300-270:
					System.out.println("case 30 executed");
			case b2:
					System.out.println("case 40 executed");
		}
		System.out.println("compiler come out from switch case");
	}
	public static void main(String[] args) 
	{
		SwitchClass obj=new SwitchClass();
		obj.meth1();
		
	}
}
