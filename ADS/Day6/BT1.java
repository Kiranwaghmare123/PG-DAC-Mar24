class BT1{
	Node root;
	
	static class Node{
		int data;
		Node left,right;
		
		Node(int d){
			data = d;
			left = right= null;
		}
	}
	
	BT1(){
		root = null;
	}
	BT1(int d){
		root = new Node(d);
	}
	
//Inorder:
 void printInorder(Node n)
 {
	if(n == null)
		return;
	
	printInorder(n.left);
	System.out.print(n.data + " ");
	printInorder(n.right);
 }
 
 void inorder()
 {
	 printInorder(root);
 }
 
 //preorder
  void printPreorder(Node n)
 {
	if(n == null)
		return;
	
	System.out.print(n.data + " ");
	printPreorder(n.left);
	printPreorder(n.right);
 }
 
void preorder()
 {
	printPreorder(root);
 }	
 
  //postorder
 void printPostorder(Node n)
 {
	if(n == null)
		return;
	
	
	printPostorder(n.left);
	printPostorder(n.right);
	System.out.print(n.data + " ");
 }
 
 void postorder()
 {
	printPostorder(root);
 }	
 
		
	public static void main(String args[])
	{
		BT1 t1 = new BT1();
		t1.root = new Node(20);
		t1.root.left = new Node(25);
		t1.root.right = new Node(56);
		t1.root.right.right = new Node(12);
		
		System.out.println("Inorder---->");
		t1.inorder();
		
		System.out.println();
		System.out.println("Preorder---->");
		t1.preorder();
		
		System.out.println();
		System.out.println("Postorder---->");
		t1.postorder();
		
	}
}