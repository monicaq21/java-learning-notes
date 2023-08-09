package java_1_notes;
import java.util.Arrays;
import java.util.Scanner;

public class Class7Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//1. Use for loop to output 3 6 9 12 15 18
		for (int i=3; i<19; i=i+3){
			System.out.println(i);
		}
		
		//2. Use for loop to output 6 stars one by one
		//print instead of println makes everything on the same line
		for (int i=0; i<6; i++){
			System.out.print("*");
		}
		
		//3. Use for loop to output 5 spaces one by one
		for (int i=0; i<5; i++){
			System.out.print(" ");
		}
		
		//4. Input String S
		//Use for loop to output char one by one
		String S = sc.nextLine();
		for (int i=0; i<S.length(); i++){
			System.out.println(S.charAt(i));
		}
		
		//5. Input 5 numbers and store into array A
		//Use for loop to output elements one by one from A
		//output the biggest number
		int[] A = new int[5];
		for (int i=0; i<5; i++){
			A[i] = sc.nextInt();
		}
		for (int i=0; i<5; i++){
			System.out.println(A[i]);
		}
		Arrays.sort(A);
		System.out.println(A[4]);
		
	}

}
