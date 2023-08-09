package java_1_notes;

import java.util.Arrays;
import java.util.Scanner;

public class Class8A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		//Review Questions
		//input 7 Strings and store into array A
		//use for loop to output the 7 strings from array A
		String[] A = new String[7];
		for (int i=0; i<7; i++){
			A[i] = sc.nextLine();
		}
		for (int i=0; i<7; i++){
			System.out.println(A[i]);
		}


		//input 5 numbers and store into array B
		//output the sum, average and median of the 5 numbers
		int[] B = new int[5];
		int Sum = 0;
		for (int i=0; i<5; i++){
			B[i] = sc.nextInt();
			Sum = Sum+B[i];
		}
		Arrays.sort(B);
		System.out.println("The sum is "+Sum+".");
		System.out.println("The average is "+(Sum/5.0)+".");
		//To get a decimal it has to be divided by a decimal.
		//If it's only Sum/5 then the outcome would only be an integer.
		System.out.println("The median is "+B[2]+".");

		sc.nextLine();

		//input String S
		//if S only contains A E I O U output YES
		//else output NO
		String S = sc.nextLine();
		S = S.replace("A","");
		S = S.replace("E","");
		S = S.replace("I","");
		S = S.replace("O","");
		S = S.replace("U","");
		if (S.length()==0){
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

		//input 9 doubles and store into array A
		//output the sum, average, and biggest number
		double[] K = new double[9];
		double sum = 0;
		for (int i=0; i<9; i++){
			K[i] = sc.nextDouble();
			sum = sum+K[i];
		}
		Arrays.sort(A);
		System.out.println("The sum is "+sum+".");
		System.out.println("The average is "+(sum/9.0)+".");
		System.out.println("The biggest number is "+K[8]+".");

		//

	}

}
