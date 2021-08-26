package homework;

public class ArithmaticOperator 
{
	public void addition()
	{
		int value1=89;
		int value2=32;
		int result=value1+value2;
		System.out.println("Addition of 2 Number is==>"+result);
	}
	private int subtraction(int val1,int val2)
	{
		int temp=val1-val2;
		return temp;
	}
	protected double multiplication(double first,double second)
	{
		double result=first*second;
		ArithmaticOperator obj=new ArithmaticOperator();
		obj.division();
		return result;
	}
	void division()
	{
		int value1=45;
		int value2=96;
		int result=value1/value2;
		System.out.println(result);
	}
	public static void main(String[] args) 
	{
		ArithmaticOperator obj=new ArithmaticOperator();
		obj.addition();
		int output=obj.subtraction(100,60);
		System.out.println(output);
		double n=obj.multiplication(62.12,5.45);
		System.out.println(n);
	}
}
