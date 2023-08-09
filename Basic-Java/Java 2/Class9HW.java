package java_2_notes;

import java.util.Arrays;
import java.util.Scanner;

public class Class9HW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
		
//			Task 1:
//			Input String S
//			output all the possible substring of String S
			String S = sc.nextLine();
			for (int i=0; i<S.length()+1; i++){
				for (int l=i; l<S.length()+1; l++){
					System.out.println(S.substring(i, l));
				}
			}

//			Task 2:
//			Input String S1
//			output how many "A" inside String S1
			String S1 = sc.nextLine();
			int countA = S1.length()-S1.replace("A", "").length();
			System.out.println(countA);
			
//			Task 3:
//			Input String S2
//			output how many "^-^" inside String S2
			String S2 = sc.nextLine();
			int countsmile = S2.length()-S2.replace("^_^", "ab").length();
			System.out.println(countsmile);

//			Task 4:
//			Input 9 numbers
//			Using for loop to output the biggest number of the 9 numbers
//			Using for loop to output the smallest number of the 9 numbers
			int[] a = new int[9];
			for (int i=0; i<9; i++){
				a[i] = sc.nextInt();
			}
			int big = a[0];
			int small = a[0];
			
			for (int i=0; i<9; i++){
				if (a[i]>big){
					big = a[i];
				}
				if (a[i]<small){
					small = a[i];
				}
			}
			System.out.println(big+" "+small);
			

//			Task 5:
			String S3 = "123456789";
//			convert String S3 into integer array A
//			A should has elements 1,2, 3, 4, 5, 6, 7, 8, 9
			char[] abc = S3.toCharArray();
			int[] A = new int[S3.length()];
			for (int i=0; i<S3.length(); i++){

			}

//			Task 6:
//			Input 10 numbers
//			output the count of even number
			int counteven = 0;
			for (int i=0; i<10; i++){
				int k=sc.nextInt();
				if (k%2==0){
					counteven++;
				}
			}
			System.out.println(counteven);

//			Task 7:
//			Input int hour
//			input int minute
//			output the time 1 hour and 24 minute after the input time
//			output the time 1 hour and 24 minute before the input time
			int hour = sc.nextInt();
			int minute = sc.nextInt();
			
			int hour1 = hour+1;
			int minute1 = minute+24;
			if (minute1>=60){
				minute1=minute1-60;
				hour1++;
			}
			if (hour1>12){
				hour1=hour1-12;
			}
			System.out.printf("%02d:%02d", hour1,minute1);
			System.out.println();
			
			int hour2 = hour-1;
			int minute2 = minute-24;
			if (minute2<0){
				minute2=minute2+60;
				hour2--;
			}
			if (hour2<=0){
				hour2=hour2+12;
			}
			System.out.printf("%02d:%02d", hour2,minute2);

	}
}
