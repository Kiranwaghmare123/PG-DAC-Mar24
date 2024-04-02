public class Recursion1{
	static int i=0;
	static void show()
	{
		++i;
		if(i<=5)
		{
			System.out.println("Hello Girls !!");
			show(); //function call for infinite loop
		}
	}
	
	public static void main(String args[])
	{
		show();
	}
}