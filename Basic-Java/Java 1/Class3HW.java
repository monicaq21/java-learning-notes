package java_1_notes;
import java.util.Scanner;

public class Class3HW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		//Homework 1
		//Question 1
		System.out.println("Please input an integer:");
		int N = sc.nextInt();
		if (N<10){
			System.out.println("single digit number");
		} else if (N>=10 && N<100){
			System.out.println("double digit number");
		} else if (N>=100 && N<1000){
			System.out.println("triple digit number");
		} else {
			System.out.println("I don't know");
		}
		
		//Question 2
		System.out.println("Please input an age:");
		int age = sc.nextInt();
		if (age<19){
			System.out.println("too young to drink wine");
		} else if (age>=19 && age <=65){
			System.out.println("you are OK to buy wine");
		} else if (age>65){
			System.out.println("you are too old to drink wine.");
		}
		
		//Question 3
		System.out.println("Please input a random integer");
		int n = sc.nextInt();
		if (n<10){
			System.out.println("A");
		} else if (n<=20 && n>=10){
			System.out.println("B");
		} else if (n<=30 && n>=20){
			System.out.println("C");
		} else if (n<=40 && n>=30){
			System.out.println("D");
		} else if (n<=50 && n>=40){
			System.out.println("E");
		}
		
		sc.nextLine();
		
		System.out.println("Please input anything");
		String S = sc.nextLine();
		String T = S.replace("e", "");
		System.out.println((S.length()) - (T.length()));
		
	}

}
