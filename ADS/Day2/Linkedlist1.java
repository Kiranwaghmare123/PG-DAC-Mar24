
class Linkedlist1
{
	Node head;//starting point of list
	
	static class  Node{
		int data;//data value
		Node next;//link for node
		
		Node(int d)//constructor for default values
		{
			data = d;
			next = null;
		}

	}
	
	public void display()
	{
		Node n = head;
		
		while(n != null)
		{
		System.out.print(n.data+"----> ");
		n=n.next;// traversing next node
		}
		
	}
	
	public static void main(String args[])
	{
		Linkedlist1 l1 = new Linkedlist1();
		
		l1.head = new  Node(11);// linkedlist with first node is created
		Node first = new Node(22);
		Node second = new Node(33);
		
		l1.head.next = first;// next node 22 is connected
		first.next = second;//next node 33 is connect
		
		l1.display();
		
		
	}
}
