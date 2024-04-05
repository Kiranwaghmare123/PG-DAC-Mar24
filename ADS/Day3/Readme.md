Date: 04/04/2024
--------------------------------------------
# ADS Day 3: Linked List
--------------------------------------------
Topic: 
	-Linked List
	
# Linked List:
--------------
    class Node{
    	int data;
    	Node link;
    	
    	Node(int d)
    	{
    		data=d;
    		link=null;
    	}
    }

# Operations of Linked List:
-------------------------
    1. Insertion
    	a. Insertion at the begining
    	b. Insertion in between two node
    	c. Insertion at the end
    2. Deletion
    	a. Deletion at the begining
    	b. Deletion in between two node
    	c. Deletion at the end
    	d. Deletion at the position
    3. Traverse
    4. Search
    5. Sorting


# a. Insertion at the begining
------------------------------
    public insert(int new_data)
    {
    	Node new_node = new Node(new_data);
    	new_node.link = head;
    	head = new_node;
    	
    	
    }

# b. Insertion in between two node
    public void insertAfter(Node prev_node,  int new_data)
    {
    	Node new_node = new Node(new_data);
    	new_node.link = prev_node.link;
    	prev_node.link = new_node;
    	
    	
    }

# c. Insertion at the end

    public void append(int new_data)
    {
    	Node new_node = new Node(new_data);
    	if(head == null)
    	{
    			head = new Node(new_data);
    			return;
    	}
    	new_node.link = null;
    	Node last = head;
    	while(last.link != null)
    		last=last.link;
    	last.link = new_node;
    	return;
    	
    	
    }
# Delete node by Key value
      public void deleteNode(int key)//key = 43
      {
      	Node temp = head, prev = null;
      	//Deletion at the begining
      	if( temp != null && temp.data == key)
      	{
      		head = temp.link;
      		return;
      		
      	}
        # //In between node deletion
          	while(temp != null && temp.data != key)
          	{
          		prev =temp;
          		temp = temp.link;		
          	}
          	//deletion at the end
          	if (temp == null)
          		return;
          	prev.link = temp.link;
          	
          	
          }

# //Deletion with position value
    void deleteNode(int pos)
    {
    	if(head == null)
    		return;
    		
    	Node temp = head;
    	
    	//Deletetion at begining with pos=0.
    	if(pos == 0)
    	{
    		head = temp.link;
    		return;
    	}
    	
    	for(int i=0; temp != null && i < pos-1;i++)
    		temp = temp.link;
    	if(temp == null || temp.link == null)
    		return;
    	Node n = temp.link.link;
    	temp.link = n;
    		
    	
    		
    }

# Count the number of nodes in linked list.

	public int count(Node temp)
	{
		Node temp= head;
		int c = 0;
		while(temp != null)
		{
			c++;
			temp=temp.link;
		}
		return c;
		
	}
	
# Recursive function:
	-------------------
	public int countRecursive(Node temp)
	{
		//Base condition
		if( temp == null)
			return 0;
		
		return 1 + countRecursive(temp.link);
	}
				
				

# //Search a node element in a linked list
    key = 12
    
    public 	search(Node temp, int x)
    {
    	Node temp = head;
    	while(temp != null)
    	{
    		if(temp.data == x)
    			return true;//search is successful
    		temp = temp.link;	
    	}
    	return false;
    }

# //Reverse a linked list
    prev: to track prev node
    curr: to track current node whose link is required to revese
    next: to track next node
    node = head: starting point of list
    
    void reverse(Node node)
    {	node = head;
    	Node prev = null;
    	Node curr = node;
    	Node next = null;
    	while(curr != null)
    	{
    		next = curr.link;
    		curr.link = prev;
    		prev = curr;
    		curr = next;
    	}
    	head = prev;
    	
    }

# //Function to get the nth node of the Linked kist

     int nelement(int pos)
     {
    	Node temp = head;
    	int c=0;
    	while(temp != null)
    	{
    		if( c == pos)
    			return temp.data;
    		c++;
    		temp = temp.link;
    	}
    	assert(false);
    	return 0;
     }
# //Identify the center element of the linked list

    void centerelement()
    {
    	Node ptr1=head;
    	Node ptr2=head;
    	
    	while(ptr2 != null && ptr2.next != null)
    	{
    		ptr1 = ptr1.link;//Need the value of center element
    		ptr2 = ptr2.link.link;
    	}
    	
    	System.out.println(ptr1.data);
    	
    	
    	
    }

