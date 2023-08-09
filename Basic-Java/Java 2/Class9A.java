package java_2_notes;

import java.util.Scanner;

public class Class9A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		//Nov. 6th, 2017

		//Task 1
		//input string s
		//output yes if palindrome
		String S = sc.nextLine();
		boolean flag = true;
		for (int i=0; i<S.length(); i++){
			if (S.charAt(i)!=S.charAt(S.length()-1-i)){
				flag=false;
			}
		}
		if (flag==true){
			System.out.println("YES");
		}


		//Task 2
		//input String s1/2/3
		//output s1,s2,s3 letters one by one backward: s1,s2,s3
		//5 letters for the strings

		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		String s3 = sc.nextLine();

		String[] sh = {s1,s2,s3};
		for (int l=0; l<5; l++){
			for (int i=0; i<3; i++){
				System.out.print(sh[i].charAt(4-l));
			}
		}


	}

}
