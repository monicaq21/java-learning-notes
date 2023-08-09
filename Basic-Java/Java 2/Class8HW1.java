package java_2_notes;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Class8HW1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);


		//	Task 1:
		//	input String S 
		//	if S is palindrome output YES, else output NO
		String S = sc.nextLine();
		boolean flag = true;
		for (int i=0; i<S.length(); i++){
			if (S.charAt(i)!=S.charAt(S.length()-i-1)){
				flag = false;
			}
		}
		if (flag==true){
			System.out.println("YES");
		} else{
			System.out.println("NO");
		}
		//
		//	Task 2:
		//	input String A
		//	if A is a arithmetic sequence String, output YES, else output NO
		String A = sc.nextLine();
		boolean flag2 = true;
		int difference = A.charAt(1)-A.charAt(0);
		for (int i=0; i<A.length()-1; i++){
			if (A.charAt(i+1)-A.charAt(i)!=difference){
				flag2=false;
			}
		}
		if (flag2==true){
			System.out.println("YES");
		} else{
			System.out.println("NO");
		}
		//
		//			Task 3:
		String S0 = "LMNOP";
		String S1 = "QRSTV";
		String S2 = "WXYZA";
		//	Store S0, S1, S2 into String array B
		//	Using for loop to output the String vertically
		//	output should be:
		//	LQW
		//	MRX
		//	WSY
		//	OTZ
		//	PVA
		String[] B = {S0,S1,S2};
		for (int i=0; i<5; i++){
			for (int l=0; l<3; l++){
				System.out.print(B[l].charAt(i));
			}
			System.out.println();
		}


		//	Task 4:
		//	input String C
		//	convert C into char array
		//	sort array C
		//	Using for loop to output C's elements one by one
		String C = sc.nextLine();
		char[] c = C.toCharArray();
		Arrays.sort(c);
		for (int i=0; i<c.length; i++){
			System.out.println(c[i]);
		}


		//	Task 5:
		//	Create Integer LinkedList D
		//	Add 20 into D
		//	Add 35 into D
		//	Add 56 into D
		//	Add 78 into D
		//	Using for loop to output D's element one by one
		LinkedList <Integer> D = new LinkedList <Integer>();
		D.add(20);
		D.add(35);
		D.add(56);
		D.add(78);
		for (int i=0; i<D.size(); i++){
			System.out.println(D.get(i));
		}

		//	Task 6:
		//	Create Hashtable<Character,String> mapping
		//	store mapping 'A', "Apple"
		//	store mapping 'B', "Banana"
		//	store mapping 'C', "Carrot"
		//	store mapping 'D', "DragonFruit"
		//	into Hashtable
		//	output 'C' 's mapping value
		Hashtable<Character,String> map = new Hashtable<Character,String>();
		map.put('A', "Apple");
		map.put('B', "Banana");
		map.put('C', "Carrot");
		map.put('D', "DragonFruit");
		System.out.println(map.get('C'));


		//	Task 7:
		String E = "12 13 14 15 16 17";
		//	Using E.split to parse String E into integer array F
		//	F will have value {12,13,14,15,16,17};
		String[] e = E.split(" ");
		int[] F = new int[e.length];
		for (int i=0; i<e.length; i++){
			F[i] = Integer.parseInt(e[i]);
		}

		//	Task 8:
		String G = "MOM DAD Child1 Child2";
		//	Using StringTokenizer to parse G into 4 Strings
		StringTokenizer st = new StringTokenizer(G," ");
		int size = st.countTokens();
		String [] g = new String[4];
		for (int i=0; i<size; i++){
			System.out.println(st.nextToken());
		}


		//	Task 9:
		//	input 12 numbers and store it into 3*4 2D integer array
		//	Using nested for loop to output row elements one by one
		//	Using nested for loop to output col elements one by one
		int[][] H = new int[3][4];
		for (int col=0; col<3; col++){
			for (int row=0; row<4; row++){
				H[col][row] = sc.nextInt();
			}
		}

		for (int col=0; col<3; col++){
			for (int row=0; row<4; row++){
				System.out.println(H[col][row]);
			}
		}

		for (int row=0; row<4; row++){
			for (int col=0; col<3; col++){
				System.out.println(H[col][row]);
			}
		}

		//	Task 10:
		//	output 'D''s index position of String U 
		String U = "ABCDEFGH";
		System.out.println(U.indexOf('D'));



	}

}
