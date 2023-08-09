package java_2_notes;

import java.util.Scanner;

public class ClassTenHW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
//		Input 10 numbers and store into Array A
//		Using for loop to output the index of 23.
//
//		for example:
//		1 2 3 4 5 23 6 7 8 9
//
//		output 5, since value 23 index is 5.
		int[] A = new int[10];
		for (int i=0; i<10; i++){
			A[i] = sc.nextInt();
		}
		for (int i=0; i<10; i++){
			if (A[i]==23){
				System.out.println(i);
			}
		}

		
	}

}
