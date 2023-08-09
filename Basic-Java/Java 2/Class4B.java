package java_2_notes;

import java.util.Scanner;

public class Class4B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//use sc.next if there's no space in a string
		//(enter is okay)
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int i=0; i<T; i++){
			int N = sc.nextInt();
			N = Math.abs(N);
			String S = Integer.toString(N);
			System.out.println(S.length());
		}
		
		//Relationship Table
		//2x2
		boolean[][] A = new boolean[2][2];
		A[0][1] = true;
		for (int row=0; row<2; row++){
			for (int col=0; col<2; col++){
				System.out.println(A[row][col]);
			}
		}
	}

}
