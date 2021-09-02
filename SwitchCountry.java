package pack2;

public class SwitchCountry 
{
	public static void main(String[] args) 
	{
		System.out.println("You are in main");
		SwitchCountry obj=new SwitchCountry();
		obj.country("India");
	}
	void country(String country)
	{
		switch(country)
		{
			case "India":
				System.out.println("You are Indian");
				break;
			case "Russia":
				System.out.println("You are Russian");
				break;
			case "America":
				System.out.println("You are American");
				break;
			case "Canada":
				System.out.println("You are Canadian");
				break;
			default:
				System.out.println("You are from "+country);
		}
		System.out.println("You are out from switch block");
	}
}
