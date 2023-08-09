package java_1_notes;
import java.util.Arrays;
import java.util.Scanner;

public class Class6Quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//input String S
		//Use for loop to output char one by one forward from S
		String S = sc.nextLine();
		for (int i=0; i<S.length(); i++){
			System.out.println(S.charAt(i));
		}

		//input 11 int and store into array A
		//Use for loop to output elements from A one by one
		//output the median one from array A
		int A[] = new int[11];
		for (int i=0; i<11; i++){
			A[i] = sc.nextInt();
		}
		for (int i=0; i<11; i++){
			System.out.println(A[i]);
		}
		Arrays.sort(A);
		System.out.println(A[5]);
		

		
	}

}
