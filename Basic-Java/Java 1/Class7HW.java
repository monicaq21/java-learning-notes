package java_1_notes;

import java.util.Scanner;

public class Class7HW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//input 7 numbers and output the total of the 7 numbers
		int[] a = new int[7];
		for (int i=0; i<7; i++){
			a[i] =sc.nextInt();
		}
		System.out.println(a[0]+a[1]+a[2]+a[3]+a[4]+a[5]+a[6]);
		
		//intput 7 fruits and store into Array A
		//use for loop to output the 7 fruits one by one
		String[] A = new String[7];
		for (int i=0; i<7; i++){
			A[i] = sc.nextLine();
		}
		sc.nextLine();
		for (int i=0; i<7; i++){
			System.out.println(A[i]);
		}
		sc.nextLine();
		
		//use for loop to output 5 10 15 20 25 30
		//use for loop to output "%" 5 times
		for (int i=5; i<31; i=i+5){
			System.out.println(i);
		}
		for (int i=0; i<5; i++){
			System.out.print("%");
		}
		
		
	}

}
