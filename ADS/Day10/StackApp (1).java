class StackApp
{
	static final int MAX =5;
	int top;
	int stack[] = new int[MAX];
	
	StackApp()
	{
		top = -1;
	}
	
	 boolean isEmpty()
	 {
		return (top < 0);//true
	 }
 

	 boolean push(int x)
	 {
		if(top >= (MAX -1))
		{
			System.out.println("Overflow !");
			return false;
		}
		else
		{
			stack[++top] = x;
			System.out.println(x+ " Push ...");
			return true;
			
		}
	 }
 
	 int pop()
	 {
		if(top < 0)
		{
			System.out.println("Underflow!");
			return 0;
		}
		else{
			int x = stack[top--];
			return x;
		}
	 }
 
	 int peek()
	 {
		if(top<0)
		{
			System.out.println("Underflow!");
			return 0;
		}
		else{
			int x = stack[top];
			return x;
		}
	 }
	public static void main(String args[])
	{
		StackApp s1 = new StackApp();
		System.out.println(s1.isEmpty());
		s1.push(20);
		s1.push(30);
		s1.push(40);
		s1.push(50);
		
		System.out.println("Delete element = "+s1.pop());
		System.out.println("Tos element = "+s1.peek());
		
	}
		
}