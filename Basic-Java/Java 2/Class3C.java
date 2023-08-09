package java_2_notes;

import java.util.Scanner;

public class Class3C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		//Final Quiz

		//input b1
		//input n1
		//convert b1 number n1 to a base 10 number
		int b1 = sc.nextInt();
		String n1 = sc.next();
		int bn = Integer.valueOf(n1,b1);
		System.out.println(bn);

		//convert base 10 number 11 to base 2 number
		//output the base 2 number
		//toString is changing from base 10 to another number
		//valueOf is changing other number to base 10
		String bn1 = Integer.toString(11,2);
		System.out.println(bn1);

	}

}
