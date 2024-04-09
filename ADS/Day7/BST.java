class BST{
		Node root;
	static class Node{
		int data;
		Node left, right;
		
		Node(int d)
		{
			data = d;
			left=right=null;
		}
	}
	
	BST()
	{
		root = null;
	}
	
	BST(int d)
	{
		root = new Node(d);
	}
	
	void printInorder(Node root)//LC,Root,RC
	{
		if(root == null)
			return;
		printInorder(root.left);
		System.out.print(root.data+ " ");
		printInorder(root.right);
	}
	void Inorder()
	{
		printInorder(root);//5
	}
	
	void printPreorder(Node root)//5
	{
		if(root == null)
			return;
		
		System.out.println(root.data+ " ");
		printPreorder(root.left);
		printPreorder(root.right);
	}
	void Preorder()
	{
		printPreorder(root);//5
	}
	void printPostorder(Node root)//5
	{
		if(root == null)
			return;
		
		printPreorder(root.left);
		printPreorder(root.right);
		System.out.println(root.data+ " ");
	}
	void Postorder()
	{
		printPreorder(root);//5
	}
	
	Node insertdata(Node root, int key)
{
	if(root == null)
	{	
		root = new Node(key);
		return root;
	}
	if(key <= root.data)
		root.left = insertdata(root.left,key);
	else
		root.right = insertdata(root.right, key);
	return root;
	
	
}

void insert(int key)
{
	root = insertdata(root,key);
}	

Node deletedata(Node root, int key)
{
	if(root == null)
		return root;
	if(key < root.data)
		root.left = deletedata(root.left,key);
	else if(key > root.data)
		root.right = deletedata(root.right, key);
	else{
		// case 1: Leaf node LC=RC=null e.g 3
		// case 2: Single child LC---RC, RC---LC eg 24, 44
		if(root.left == null)
			return root.right;
		if(root.right == null)	
			return root.left;
		// case 3: Two childrens e.g., 52
			root.data = minvalue(root.right);//Inorder ka succesor
			root.right = deletedata(root.right, root.data);
	
	
	}
	return root;
	
}

int minvalue(Node root)
{
	int x = root.data;
	while(root.left != null)
	{
		x = root.left.data;
		root=root.left;
	}
	return x;
}

void delete(int key)
{
	root = deletedata(root, key);
}
	
	public static void main(String args[])
	{
		BST t1 = new BST();
		t1.root = new Node(52);
		t1.root.left = new Node(36);
		t1.root.right = new Node(66);
		t1.root.left.left = new Node(24);
		t1.root.left.right = new Node(44);
		t1.root.left.right.left = new Node(40);
		t1.root.right.left = new Node(55);
		t1.root.right.right = new Node(72);
		
		t1.Inorder();
		System.out.println();
		t1.insert(83);
		t1.Inorder();
		t1.insert(53);
		t1.insert(50);
		t1.insert(3);
		System.out.println();
		t1.Inorder();
		t1.delete(3);
		t1.delete(44);
		t1.delete(52);
		System.out.println();
		t1.Inorder();
		
	}
}