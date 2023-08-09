package java_3_notes;

import java.util.Scanner;

public class Recursion{
	public static int factorial(int n){
		if (n<=1) return 1;
		else return (n*factorial(n-1));
	}

	public static void main(String[] args){
		
		//use recursion to find factorial
		//recursion:
		//1. create a function to find the value
		//2. if the number isn't within the range, output the exception
		//3. else output the value with the function of the next value (added or multiplied
		//   based on the problem)
		
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		System.out.println(factorial(n));
		
	}
}