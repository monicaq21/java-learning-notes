package java_2_notes;

import java.util.Scanner;

public class Class2A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//Class 2 9/18
		//Practice 1
		//Ask user to input int number
		//if input=-1, stop
		//output the biggest number without using array
		System.out.println("Please input an integer:");
		int biggest = sc.nextInt();
		while (true){
			int A = sc.nextInt();
			if (A>biggest){
				biggest = A;
			}
			if (A==-1){
				break;
			}
		}
		System.out.println(biggest);
		
	}

}
