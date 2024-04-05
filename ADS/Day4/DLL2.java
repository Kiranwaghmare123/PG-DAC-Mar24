class DLL{
	
	Node head;
	static class Node{
	int data;
	Node prev;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
		prev = null;
	}
	}
	
	void insert(int new_data)
	{
		Node new_node = new Node(new_data);
		new_node.next = head;
		new_node.prev = null;
		if( head != null)
			head.prev = new_node;
		head = new_node;
	}
	
	void insertAfter(Node prev, int new_data)
	{
		if(prev == null)
			return;
		Node new_node = new Node(new_data);
		new_node.next = prev.next;
		prev.next = new_node;
		new_node.prev = prev;
		Node p = new_node.next;
		p.prev = new_node;

		
		
	}
	
	
	
	void display(Node n)
	{
		Node p=null;
		System.out.println("Forward printing:");
		while(n != null)
		{
			System.out.print(n.data+ " ");
			p=n;
			n=n.next;
			
		}
		System.out.println("--------");
		System.out.println("Backward printing:");
		while(p != null)
		{
			System.out.print(p.data+ " ");
			p=p.prev;
			
		}
		
		
	}
	public static void main(String args[])
	{
		DLL d1 = new DLL();
		d1.insert(5);
		d1.insert(10);
		d1.insert(15);
		d1.display(d1.head);
		System.out.println();
		d1.insertAfter(d1.head, 7);
		d1.display(d1.head);
	}
}