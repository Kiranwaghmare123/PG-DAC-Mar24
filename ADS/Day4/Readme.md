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
    


# Traversal 


