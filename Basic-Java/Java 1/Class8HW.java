package java_1_notes;

import java.util.Arrays;
import java.util.Scanner;

public class Class8HW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//input 7 numbers
		//output sum average and median
		int[] A = new int[7];
		int sum = 0;
		for (int i=0; i<7; i++){
			A[i] = sc.nextInt();
			sum = sum + A[i];
		}
		Arrays.sort(A);
		System.out.println("The sum is "+sum+".");
		System.out.println("The average is "+(sum/7.0)+".");
		System.out.println("The median is "+A[3]+".");
		
		
		//input 9 numbers
		//output sum average and median
		int[] B = new int[9];
		int Sum = 0;
		for (int i=0; i<9; i++){
			B[i] = sc.nextInt();
			Sum = Sum + B[i];
		}
		Arrays.sort(B);
		System.out.println("The sum is "+Sum+".");
		System.out.println("The average is "+(Sum/9.0)+".");
		System.out.println("The median is "+B[4]+".");
		
		//input String S
		//use for loop to output char one by one
		String S = sc.nextLine();
		for (int i=0; i<S.length(); i++){
			System.out.println(S.charAt(i));
		}
		
		//A is 1 2 3 4
		//B is 5 6 7
		//output A and B's combination
		for (int a=1; a<5; a++){
			for (int b=5; b<8; b++){
				System.out.println(a+" "+b);
			}
		}
		
		
	}

}
