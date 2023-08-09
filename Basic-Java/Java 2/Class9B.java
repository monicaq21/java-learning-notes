package java_2_notes;

import java.util.Scanner;

public class Class9B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		1
//		input int n
//		if n can be divided by 3 and 5 output yes else no
		int N = sc.nextInt();
		if (N%3==0 && N%5==0){
			System.out.println("YES");
		} else{
			System.out.println("NO");
		}
		
		
		
//		2
//		input int n1,2,3
//		don't use array to output the middle number of n1 n2 and n3
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		if (n3>n2&&n3>n1){
			if (n1>n2){
				System.out.println(n1);
			} else{
				System.out.println(n2);
			}
		} else if (n2>n3&&n2>n1){
			if (n1>n3){
				System.out.println(n1);
			} else{
				System.out.println(n3);
			}
		} else {
			if (n2>n3){
				System.out.println(n2);
			} else{
				System.out.println(n3);
			}
		}
		
		
		
		
	}

}
