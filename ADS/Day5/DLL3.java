class DLL3{
	
	Node head;

	static class Node{
		int data;
		Node next,prev;
		
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
		if(head != null)
			head.prev = new_node;
		head = new_node;
		
	}
	
		void append(int new_data)
	{
		Node new_node = new Node(new_data);
		Node last = head;
		new_node.next = null;//last node in the list
		if( head == null)
		{
			new_node.prev=null;//prerequisit for first node
			head = new_node;
			return;
		}
		while(last.next != null)
		{
			last=last.next;
		}
		last.next = new_node;
		new_node.prev = last;
			
		
		
	}
	
	void insertAfter(Node prev_node, int new_data)
	{
		if(prev_node == null)
		{
			System.out.println("Node cannot be exist.");
			return;
		}
		Node new_node = new Node(new_data);
		new_node.next = prev_node.next;
		prev_node.next = new_node;
		new_node.prev = prev_node;
		if( new_node.next != null)
			new_node.next.prev = new_node;
				
		
		
	}
	void display(Node n)
	{
		Node p = null;
		System.out.println("Forward direction:");
		while(n != null)
		{
			System.out.print(n.data+"---> ");
			p=n;
			n=n.next;
		}
		System.out.println("------------------------------");
		System.out.println();
		
		System.out.println("Backward direction:");
		while(p != null)
		{
			System.out.print(p.data+"---> ");
			p=p.prev;
		}
		
		
	}
	
	public static void main(String args[])
	{
		
		DLL3 d1 = new DLL3();
		//d1.display(d1.head);
		System.out.println("------------------------------**");
		
		d1.insert(10);
		//d1.display(d1.head);
		
		
		System.out.println();
		
		d1.insert(5);
		//d1.display(d1.head);
		
		System.out.println();
		d1.append(23);
		//d1.display(d1.head);
		
		System.out.println();
		d1.append(33);
		//d1.display(d1.head);
		
		System.out.println();
		d1.append(28);
		d1.display(d1.head);
		
		System.out.println();
		d1.insertAfter(d1.head.next, 45);
		d1.display(d1.head);
		
		System.out.println();
		d1.insertAfter(d1.head.next.next, 55);
		d1.display(d1.head);
		
		
		
	}
	
}