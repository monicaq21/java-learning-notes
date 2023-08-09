package java_1_notes;

import java.util.Arrays;
import java.util.Scanner;

public class Class9A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		//Review for last class
		//Task 1
		//input 7 float numbers
		//output the sum, average, and median
		float[] A = new float[7];
		float sum = 0;
		for (int i=0; i<7; i++){
			A[i] = sc.nextFloat();
			sum = sum+A[i];
		}
		Arrays.sort(A);
		System.out.println("The sum is "+sum+".");
		System.out.println("The average is "+sum/7+".");
		System.out.println("The median is "+A[3]+".");

		sc.nextLine();
		//Task 2
		//input String S
		//use for loop to output char one by one
		String S = sc.nextLine();
		for (int i=0; i<S.length(); i++){
			System.out.println(S.charAt(i));
		}

		//Task 3
		//input int N
		//if N can be divided by 3,5,11 output YES else NO
		int N = sc.nextInt();
		if (N%3==0 && N%5==0 && N%11==0){
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

		//Task 4
		//A is 5 6 7 8
		//B is 7 8 9
		//output all combinations
		for (int i=5; i<9; i++){
			for (int l=7; l<10; l++){
				System.out.println(i+" "+l);
			}
		}
		

	}

}
