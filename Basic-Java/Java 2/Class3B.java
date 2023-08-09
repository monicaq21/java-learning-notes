package java_2_notes;

import java.util.LinkedList;

public class Class3B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList <Integer> l = new LinkedList <Integer>();

		//(l.add) is identical to (l.offer)
		//they both add elements into linkedlist
		l.add(1);
		l.offer(2);
		l.add(3);
		l.add(4);
		System.out.println(l); //it would be [1, 2]

		//with (l.peek()) you can read the first element from linkedlist
		System.out.println(l.peek()); //would be 1
		//peeklast is the last one
		System.out.println(l.peekLast()); //would be 4

		//you can use index number to read elements from linkedlist
		System.out.println(l.get(1)); //would be 2 because the index number is the second element

		//remove elements from the first
		System.out.println(l.poll()); //read (with System.out.println) and remove the first one
		l.remove(); //remove the first one (which would be 2 because 1 is already removed)
		System.out.println(l); //would be [3, 4]
		System.out.println(l.peek()); //would be 3

		//read and remove the last element
		System.out.println(l.removeLast()); //would be 4
		System.out.println(l); //would be [3]

		//remove the first element
		System.out.println(l.remove(0)); //would be 3
		System.out.println(l); //would be empty: []
		System.out.println(l.size()); //would be 0


	}
}
