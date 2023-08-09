package java_2_notes;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class ClassZ11B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//Palindrome using stack
		
		//input string s
		//use for loop to read the chars one by one
		//add into linkedlist A
		//add into stack b
		//use for loop to read item for A and B
		//compare them. if they are different
		//then it isn't a palindrome
		LinkedList <Character> A = new LinkedList <Character>();
		Stack <Character> B = new Stack <Character>();
		boolean flag = true;
		
		String S = sc.nextLine();
		for (int i=0; i<S.length(); i++){
			A.add(S.charAt(i));
			B.push(S.charAt(i));
		}
		for (int i=0; i<S.length(); i++){
			if (A.pop()!=B.pop()){
				flag=false;
				break; //this makes the running time shorter
			}
		}
		if (flag){ //this without ==true is already true
			System.out.println("PALINDROME");
		} else {
			System.out.println("NOT PALINDROME");
		}
		
		
	}

}
