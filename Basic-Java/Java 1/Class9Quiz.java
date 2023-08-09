package java_1_notes;

import java.util.Scanner;

public class Class9Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//input N
		//if N can be divided by 7 and 8 output YES else NO
		int N = sc.nextInt();
		if (N%7==0 && N%8==0){
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
		//A is 7 8 9 10
		//B is 1 2 3 4 5 6 7
		//output how many combinations A+B equals to 11
		int count = 0;
		for (int i=7; i<11; i++){
			for (int l=1; l<8; l++){
				if (i+l==11){
					count++;
				}
			}
		}
		System.out.println(count);
		
	}

}
