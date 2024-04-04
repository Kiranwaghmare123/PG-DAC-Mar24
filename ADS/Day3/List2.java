//Insert an element at the begining
List2{
	
	Node head;//instance
	static class Node{
		
		int data;
		Node next;
		
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	
	void display()
	{
	Node n = head;
	while(n!= null)
	{
		System.out.print(n.data+ "---> ");
		n=n.next;
	}
	}

	void insert(int new_data)
	{
		
	Node new_node = new Node(new_data);
	new_node.next = head;
	head = new_node;
	}
	
	public static void main(String args[]){
		
		Linkedlist2 L1 = new Linkedlist2();
		L1.head = new Node(5);
		Node second = new Node(7);
		Node third = new Node(9);
		
		L1.head.next = second;
		second.next = third;
		
		L1.display();
		L1.insert(10);
		System.out.println();
		L1.display();
		
		L1.insert(15);
		System.out.println();
		L1.display();
	
	}
}
