package java_1_notes;

import java.util.Scanner;

public class Class9HW2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		//input int N
		//output all factors
		int N = sc.nextInt();
		for (int i=1; i<=N; i++){
			if (N%i==0){
				System.out.print(i+" ");
			}
		}

		//input int A
		//if A is RSA(4 factors) output YES else NO
		int A = sc.nextInt();
		int count = 0;
		for (int i=1; i<=A; i++){
			if (A%i==0){
				count++;
			}
		}
		if (count==4){
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

}
