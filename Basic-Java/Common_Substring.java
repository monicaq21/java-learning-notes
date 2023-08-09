package java_3_notes;

import java.util.Scanner;

public class Common_Substring {
	
	
	public static int f(String a, String b, int al, int bl){
		if (al==0||bl==0){
			return 0;
		} else if (a.charAt(al-1)==b.charAt(bl-1)){
			a=a.substring(0,al-1);
			b=b.substring(0,bl-1);
			al--;
			bl--;
			//found one common letter, continue to search
			return (1+f(a,b,al,bl));
		} else {
			//return to find the answer (like parent)
			return k(f(a,b,al,bl-1), f(a,b,al-1,bl));
		}
	}
	
	public static int k(int a, int b){
		//see the longest substring from all branches
		return (a > b)? a : b;
//		if (a>b){
//			return a;
//		} else {
//			return b;
//		}
	}

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = "abcde";
		String b = "acdffekkk";
		int al = a.length();
		int bl = b.length();
		System.out.println(f(a,b,al,bl));

	}
}