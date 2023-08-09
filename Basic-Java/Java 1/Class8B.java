package java_1_notes;

import java.util.Arrays;
import java.util.Scanner;

public class Class8B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//input 7 numbers store into array A
		//output the sum
		//output the average
		//output the smallest number
		int[] A = new int[7];
		int sum = 0;
		for (int i=0; i<7; i++){
			A[i] = sc.nextInt();
			sum = sum+A[i];
		}
		Arrays.sort(A);
		System.out.println(sum);
		System.out.println(sum/7.0);
		System.out.println(A[0]);
		
		//Percentage
		//% can get remainder
		System.out.println(5%3);
		System.out.println(7%9);
		
		//Task
		//input int N
		//if number is even output YES else NO
		int N = sc.nextInt();
		if (N%2==0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
		//input number a
		//if A can be divided by 3 and 5 output YES else NO
		int a = sc.nextInt();
		if (a%3==0 && a%5==0){
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
		//Combination
		//Group A = 0 1 2
		//Group B = 3 4 5
		//There are nine pairs of different combinations
		//for loop inside another for loop
		for (int q=0; q<=2; q++){
			for (int b=3; b<=5; b++){
				System.out.println(q+" "+b);
			}
		}
		
		//output combination for left and right hand
		//left  0 1 2 3 4 5
		//right 0 1 2 3 4 5
		for (int l=0; l<6; l++){
			for (int r=0; r<6; r++){
				System.out.println(l+" "+r);
			}
		}
		
		//daniel 5 6 7 8
		//jackie 9 10 11
		for (int d=5; d<9; d++){
			for (int j=9; j<12; j++){
				System.out.println(d+" "+j);
			}
		}
		
		//martin 7 8 9 10 11
		//alex 3 4 5
		//output the combinations
		for (int m=7; m<12; m++){
			for (int am=3; am<6; am++){
				System.out.println(m+" "+am);
			}
		}
		
	}

}
