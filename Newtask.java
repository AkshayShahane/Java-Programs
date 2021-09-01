package homework;

/*A shop will give discount of 10% if the cost of purchased quantity
 * is more than 1000,take a parameterized method which give 
 * the quantity.suppose one unit will cost 100. Judge and print
 * total cost for user.*/
public class Newtask 
{
	void meth1(int unit)
	{	
		int quantity=unit * 100;
		if(quantity>=1000)
		{
			int result=((quantity*10)/100);
			int discountedamount=(1000-result);
			System.out.println("Your amount before discount is==>"+quantity);
			System.out.println("Your amount after discount is==>"+discountedamount);
			System.out.println("You got "+result+" Rs. discount.");
		}
	}
	public static void main(String[] args) 
	{
		Newtask obj=new Newtask();
		obj.meth1(10);
		
	}
}
