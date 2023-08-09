package java_1_notes;
import java.util.Arrays;
import java.util.Scanner;

public class Class6C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//Create an array A with 3 elements
		int A[] = new int[3];
		
		//input 3 numbers and store into array
		A[0] = sc.nextInt();
		A[1] = sc.nextInt();
		A[2] = sc.nextInt();
		
		
		
		//This uses for loop to both input and output an array
		for (int i=0; i<3; i++){
			A[i] = sc.nextInt();
		}
		for (int i=0; i<3; i++){
			System.out.println(A[i]);
		}

	
		//Task
		//input 5 numbers and store into array B
		//use for loop to output elements one by one from B
		int B[] = new int[5];
		for (int i=0; i<5; i++){
			B[i] = sc.nextInt();
		}
		for (int i=0; i<5; i++){
			System.out.println(B[i]);
		}
		
		//Arrays.sort(A); sorts elements from smallest to biggest
		//0 is smallest, 1 is bigger, etc.
		
		//Task 2
		//input 7 numbers(double)
		//output the median one
		double median[] = new double[7];
		for (int i=0; i<7; i++){
			median[i] = sc.nextDouble();
		}
		Arrays.sort(median);
		System.out.println(median[3]);
		
		//Task 3
		//input 9 Strings
		//output the median one
		//sc.nextLine doesn't work but sc.next does
		String S[] = new String[9];
		for (int i=0; i<9; i++){
			S[i] = sc.next();
		}
		Arrays.sort(S);
		System.out.println(S[4]);
	}

}
