package java_1_notes;
import java.util.Arrays;
import java.util.Scanner;

public class Class6HW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//Task 1
		//input 7 int and store into array A
		//use for loop to output one by one
		//output median
		int A[] = new int[7];
		for (int i=0; i<7; i++){
			A[i] = sc.nextInt();
		}
		Arrays.sort(A);
		System.out.println(A[3]);
		
		//Task 2
		//input 9 double and store into array B
		//use for loop to output one by one
		//output biggest
		double B[] = new double[9];
		for (int i=0; i<9; i++){
			B[i] = sc.nextDouble();
		}
		Arrays.sort(B);
		System.out.println(B[8]);
		
		sc.nextFloat();
		//Task 3
		//input 11 float into array C
		//use for loop output one by one
		//output smallest
		float C[] = new float[7];
		for (int i=0; i<7; i++){
			C[i] = sc.nextFloat();
		}
		Arrays.sort(C);
		System.out.println(C[0]);
		
		sc.nextLine();
		//Task 4
		//input String S
		//output length of S
		//for loop output one by one
		String S = sc.nextLine();
		System.out.println(S.length());
		for (int i=0; i<S.length(); i++){
			System.out.println(S.charAt(i));
		}
		//output amount of E with 2 methods
		//method 1
		String S1 = S.replace("E", "");
		System.out.println(S.length()-S1.length());
		
		//method 2
		int countE=0;
		for (int i=0; i<S.length(); i++){
			char e = S.charAt(i);
			if (e=='E'){
				countE++;
			}
		} System.out.println(countE);
		
		
	}

}
