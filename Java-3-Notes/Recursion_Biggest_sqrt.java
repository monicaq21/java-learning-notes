package java_3_notes;

import java.util.Scanner;

public class Recursion_Biggest_sqrt {

	public static int f(int x){
		if (x==0||x==1){
			return x;
		} else {
			int start = 1;
			int end = x;
			int mid = (start+end)/2;
			if (mid*mid==end){
				return mid;
			} else if (mid*mid>end){
				mid--;
			} else {
				mid++;
			}
			return f(mid);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		System.out.println(f(x));
		
		
	}

}
