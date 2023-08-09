package java_1_notes;

import java.util.Scanner;

public class ClassTen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		//Switch case
		//Switch satement is a multi-way decision
		//similar to 'if...else' but in a cleaner format
		//There is no range, only equals are allowed
		//default = else
		String S = "A";
		switch (S){
		case "A": 
			System.out.println("Apple");
			break;
		case "B":
			System.out.println("Banana");
			break;
		case "C":
			System.out.println("Carrot");
			break;
		default:
			System.out.println("Hungry");
		}
		
		
		
		
		
		
	}

}
