package java_3_notes;

import java.util.Scanner;

public class Class4Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		//input String S
		//output all the possible substring from String S
		String s = sc.nextLine();
		for (int i=0; i<s.length(); i++){
			for (int l=i+1; l<=s.length(); l++){
				System.out.println(s.substring(i, l));
			}
		}
		
		//or
		
		for (int i=s.length(); i>=1; i--){
			for (int l=0; l<=s.length()-i; l++){
				System.out.println(s.substring(l,l+i));
			}
		}
		
		
		
		//input String S
		//if S is palindrome output YES
		//else output NO
		boolean flag = true;
		for (int i=0; i<s.length(); i++){
			if (s.charAt(i)!=s.charAt(s.length()-1-i)){
				flag=false;
				break;
			}
		}
		if (flag){
			System.out.println("YES");
		} else{
			System.out.println("NO");
		}
		
		
		
		
		
	}

}
