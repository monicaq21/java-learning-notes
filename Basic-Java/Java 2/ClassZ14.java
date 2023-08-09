package java_2_notes;

import java.util.Scanner;

public class ClassZ14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//palindrome
		boolean flag = true;
		
		String s = sc.nextLine();
		
		for (int i=0; i<s.length(); i++){
			if (s.charAt(i)!=s.charAt(s.length()-1-i)){
				flag=false;
			}
		}
		if (flag==true){
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
		
	}

}
