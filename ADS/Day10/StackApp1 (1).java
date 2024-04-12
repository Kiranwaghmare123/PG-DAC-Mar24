class Stack1
{
	static final int MAX =5;
	int top;
	int stack[] = new int[MAX];
	
	Stack1
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
}
class StackApp1
{
	
	public static void main(String args[])
	{
		
		Stack1 s1 = new Stack1();
		Scanner sc = new Scanner(System.in);
		
		do{
			System.out.println("Menu for stack program");
			System.out.println("1.PUSH");
			System.out.println("2.POP");
			System.out.println("3.PEEK");
			System.out.println("4.ISEMPTY");
			System.out.println("5.EXIT");
			System.out.println("Enter your choice:");
			switch(sc.next())
			{
				case 1: s1.push();
				break;
				case 2: s1.pop();
				break;
				case 3: s1.peek();
				break;
				case 4: s1.Isempty();
				break;
				default: SOP();
				break;
				
			}
			
		}while();
		
		
		System.out.println(s1.isEmpty());
		s1.push(20);
		s1.push(30);
		s1.push(40);
		s1.push(50);
		
		System.out.println("Delete element = "+s1.pop());
		System.out.println("Tos element = "+s1.peek());
		
	}
		
}