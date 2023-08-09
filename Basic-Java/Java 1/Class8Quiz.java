package java_1_notes;

import java.util.Arrays;
import java.util.Scanner;

public class Class8Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//input int N
		//if N can be divided by 3 5 and 10 output YES else NO
		int N = sc.nextInt();
		if (N%3==0 && N%10==0){
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
		//input 5 double numbers
		//output sum, average, and median
		double[] A = new double[5];
		double sum = 0;
		for (int i=0; i<5; i++){
			A[i] = sc.nextDouble();
			sum = sum+A[i];
		}
		Arrays.sort(A);
		System.out.println("The sum is "+sum+".");
		System.out.println("The average is "+(sum/5.0)+".");
		System.out.println("The median is "+A[2]+".");
		
		
	}

}
