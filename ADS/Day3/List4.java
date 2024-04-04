//Insert at the begining
class Linkedlist5{
	
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
	
	
void append(int new_data)
{
	//new node is created
	Node new_node = new Node(new_data);
	//check list is empty ? 
	if(head == null)
		{
			head = new_node;
			return;
		}
	//if list is not empty
	new_node.next = null;//condition for last node in the list
	
	Node last = head;//traverse ke liya new reference create kiya hai
	//last.next: last node tak le jayega
	while(last.next != null)
	{
		last = last.next;// shifting to next node
	}
	last.next = new_node;// connect to new node
	return;
}

void insertAfter(Node prev_node,int new_data)
{
	//check list is empty ?
	if(prev_node == null)
	{
		System.out.println("Empty list !!!");
		return;
	}
	//if list is not empty
	Node new_node = new Node(new_data);
	new_node.next = prev_node.next;
	prev_node.next = new_node;
}



	
	public static void main(String args[]){
		
		Linkedlist5 L1 = new Linkedlist5();
		L1.head = new Node(9);
		
		L1.display();
		L1.insert(7);
		System.out.println();
		//L1.display();
		
		L1.display();
		L1.insert(5);
		System.out.println();
		//L1.display();
		
		L1.display();
		L1.insert(10);
		System.out.println();
		//L1.display();
		
		
		L1.insert(15);
		System.out.println();
		L1.display();
		
		L1.append(23);
		System.out.println();
		L1.display();
		
		L1.append(33);
		System.out.println();
		L1.display();
		
		L1.insertAfter(L1.head.next, 53);
		System.out.println();
		L1.display();
		
		L1.insertAfter(L1.head, 63);
		System.out.println();
		L1.display();
		
		L1.insertAfter(L1.head.next.next, 53);
		System.out.println();
		L1.display();
		
	
	
	}
}
