package java_2_notes;

import java.util.LinkedList;

public class Class4A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Reviews for last class 
		//10/2
		
		//Create a linkedlist
		//Use two ways to add items
		//apple, banana
		LinkedList <String> l = new LinkedList <String>();
		l.add("apple");
		l.offer("banana");
		l.add("grape");
		
		//four ways to remove items from the top
		l.removeFirst();
		l.remove(0);
		l.poll();
		l.pop();
		
		
		//remove the last item from the linkedlist
		l.removeLast();
		
		
	}

}
