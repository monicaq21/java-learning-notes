package java_3_notes;

import java.util.Scanner;

public class BinaryTree {
	
	public static class Node {
		int value; //its value
		Node left; //its left child (which is a Node)
		Node right; //right child

		public Node(int v) { //constructor (has to have same name as class)
			value = v;
			left = null;
			right = null;
			//left and right can be inputted
			//if not, then it's a leave or one child
		}
		
		//breaks down and stores the tree
		public Node(Node l, Node r){
			value = 0;
			left = l;
			right = r;
		}

	}


	//Recursion
	//repeat until see the leaves
	//three orders to output
	//it could be any one of them (three ways to access data)
	//goes from leftmost to rightmost, not from top to bottom



	//pre-order: value left right
	public static void printPreOrder(Node node){
		if (node!=null){
			System.out.print(node.value+" ");
			printPreOrder(node.left);
			printPreOrder(node.right);
		}
	}

	//inorder: left value right
	public static void printInOrder(Node node){
		if (node!=null){
			printInOrder(node.left);
			System.out.print(node.value+" ");
			printInOrder(node.right);
		}
		//		if (node!=null){
		//			if (node.left!=null){
		//			System.out.print(node.left.value+" ");
		//			}
		//			if (node.right!=null){
		//			System.out.print(node.right.value+" ");
		//			}
		//			printInOrder(node.left);
		//			printInOrder(node.right);
		//		}
	}

	//postorder: left right value
	public static void printPostOrder(Node node){
		if (node!=null){
			printPostOrder(node.left);
			printPostOrder(node.right);
			System.out.print(node.value+" ");
		}
	}
	
	//convert the string into nodes
	public static Node createTreeNode(String s){
//		doesn't start with bracket: just one leaf
		if (!s.startsWith("(")){
			return new Node(Integer.parseInt(s));
		} else {
			//remove outer bracket
			s = s.substring(1,s.length()-1).trim(); //also removes the space
			int index = -1;
			if (s.startsWith("(")){
				//left side is Node
				int count = 1; //one (, string starts with beginning bracket
				for (int i=1; i<s.length(); i++){
					if (s.charAt(i)=='('){
						count++;
					} else if (s.charAt(i)==')'){
						count--;
					}
					if (count==0){ //same amount of ( and )
						index = i+1;
						break;
					}
				}
			} else {
				//left side is leaf
				//find the space to split the two integers
				index = s.indexOf(" ");
			}
			String left = s.substring(0,index);
			String right = s.substring(index+1);
			System.out.println("left: "+left);
			System.out.println("right: "+right);
			return new Node(createTreeNode(left),createTreeNode(right));
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		

		String s = sc.nextLine();
		//if isn't in a bracket: leaf
		int growth = sc.nextInt();
		Node root = createTreeNode(s);
		


		
		//		Node root = new Node(1);
		//		root.left = new Node(2);
		//		root.right = new Node(3);
		//		root.right.left = new Node(4);
		//		root.right.right = new Node(5);
		//		root.left.right = new Node(12);
		//		root.right.right.left = new Node(11);
		//		printInOrder(root);

		//	      tree
		//	      ----
		//	       1    <-- root
		//	     /   \
		//	    2      3  
		//	      \   /  \
		//	      12 4    5    
		//				 /
		//				11   <-- leave 






	}

}
