package java_2_notes;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Class8Review {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//30 Oct 2017

		String S = "A B C MOM RES";
		//Use S.split to split s into string array

		String[] s = S.split(" ");
		for (int i=0; i<s.length; i++){
			System.out.println(s[i]);
		}

		String A = "11 25 59 45 78";
		//Use stringtokenizer to split string a into integer array b
		StringTokenizer st = new StringTokenizer(A," ");
		int[] B = new int[5];
		int k = 0;
		while (st.hasMoreTokens()){
			B[k] = Integer.parseInt(st.nextToken());
			k++;
		}
		String S0 = "ABCDE";
		String S1 = "FGHIJ";
		String S2 = "KLMNO";

		//store the strings into string array c
		//use for loop to output the string vertically
		//final output will be:
		//AFK
		//BGL
		//CHM
		//DIN
		//EJO
		String[] C = {S0,S1,S2};

		for (int i=0; i<5; i++){
			for (int l=0; l<3; l++){
				System.out.print(C[l].charAt(i));
			}
			System.out.println();
		}


		String D = "ABCDEFGH";
		//Convert string d to one d array e
		//Use for loop to output element one by one from array e
		for (int i=0; i<D.length(); i++){
			char[] E = new char[D.length()];
			E[i] = D.charAt(i);
			System.out.println(E[i]);
		}

		//or
		//char[] E = D.toCharArray();
		//then output with forloop
		
		//input string G
		//output how many words inside string G
		String G = sc.nextLine();
		String[] g = G.split(" ");
		System.out.println(g.length);
		
		//input string H (word)
		//output the letter in ascending(alphabetical) order
		String H = sc.next();
		char[] h = H.toCharArray();
		Arrays.sort(h);
		for (int i=0; i<h.length; i++){
			System.out.print(h[i]);
		}
		
		
	}
}

