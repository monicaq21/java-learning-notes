package java_2_notes;

import java.util.LinkedList;
import java.util.Stack;

public class ClassZ11A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//STACK:
		//storing horizontally: the output would be backward of linkedlist
		//pop in both is getting the value one by one
		//linkedlist would be the order stored
		//stack would be the reversed order
		
//		linkedlist:
//		----------------
//		in----------->>out
//		----------------
		
		
//		stack:
//		|	in  /\ |
//		|	|	|  |
//		|	|	|  |
//		|	|	|  |
//		|   \/	out|
//		------------
		
		
		
//		Create linkedlist
//		add 1 2 3
//		
//		use for loop to output elements
		LinkedList <Integer> l = new LinkedList <Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		for (int i=0; i<3; i++){
			System.out.println(l.pop());
		}
		
		
//		create stack
//		push 1 2 3
//		use for loop to output elements
		Stack <Integer> s = new Stack <Integer>();
		s.push(1);
		s.push(2);
		s.push(3);
		for (int i=0; i<3; i++){
			System.out.println(s.pop());
		}
		
	}

}
