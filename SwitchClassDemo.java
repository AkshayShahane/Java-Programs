package pack2;

/*WAP to display the direction like North,East,West,South,by using switch
 * statement (take parameterized method with char datatype for the input)*/

public class SwitchClassDemo 
{
	public static void main(String[] args) 
	{
		SwitchClassDemo obj=new SwitchClassDemo();
		obj.meth1('N');
	}
	void meth1(char c)
	{
		switch(c)
		{
			case 'E':
				System.out.println("East direction");
				break;
			case 'N':
				System.out.println("North direction");
				break;
			case 'W':
				System.out.println("West direction");
				break;
			case 'S':
				System.out.println("South direction");
				break;
			default:
				System.out.println("Wrong direction");
				//break;
		}
		System.out.println("You are out of switch");
	}
}
