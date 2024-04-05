Date: 05/04/2024
--------------------------------------------
# ADS Day 4: Doubly Linked List
--------------------------------------------
    Topic: 
    	-Linked List


# Doubly Linked List:DLL
---------------------
    DLL is a variation of Linked list in which navigation is possible in both ways, either forward and backward directions as compared to single linked list.
    
# Operations on DLL:
------------------
    1.Insertion
    	a.At first
    	b.At Last
    	c.In between
    2.Deletion
    	a.At first
    	b. At last
    	c. In between
    3.Traversing
    	-Forward (next)
    	-Backward (prev)
    	
# DLL Node structure
------------------
    class Node{
    	int data;
    	Node prev;
    	Node next;
    	
    	Node(int d)
    	{
    		data = d;
    		prev = next = null;
    	}
    }


# Insertion operation:
--------------------
    1.Insertion : At first
    //Insettion at the begining
    
    Node new_node = new Node(new_data);
    new_node.next = head;
    new_node.prev = null;
    if(head != null)
    	head.prev = new_node;
    head = new_node;
    
    2. Insertion: Insert after a node
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

# Traversal 

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
     
