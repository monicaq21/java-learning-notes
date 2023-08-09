package java_2_notes;

import java.util.Scanner;

public class Class1A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		//3 questions
		//p108ex8: Direction

		//Write the code for one test case
		//each case has one input 
		int T = sc.nextInt();
		for (int i=0; i<T; i++){
			int N = sc.nextInt();
			if (N>=0 && N<=45){
				System.out.println("N");
			} else if (N>=45 && N<=135){
				System.out.println("E");
			} else if (N>=135 && N<=225){
				System.out.println("S");
			} else if (N>=225 && N<=315){
				System.out.println("W");
			} else if (N>315){
				System.out.println("N");
			}
		}

		//p140ex3: Column of Numbers
		//Method 1
		String n = sc.next();
		for (int i=0; i<n.length(); i++){
			System.out.println(n.charAt(n.length()-i-1));
		}
		//Method 2
		for (int i=n.length()-1; i>=0; i--){
			System.out.println(n.charAt(i));
		}

		//p100ex4: Cross Country
		String c = sc.next();
		if (c.equals("MG")){
			System.out.println("midget girls");
		} else if (c.equals("MB")){
			System.out.println("midget boys");
		} else if (c.equals("JG")){
			System.out.println("junior girls");
		} else if (c.equals("JB")){
			System.out.println("junior boys");
		} else if (c.equals("SG")){
			System.out.println("senior girls");
		} else if (c.equals("SB")){
			System.out.println("senior boys");
		} else {
			System.out.println("invalid code");
		}
		
		
		
		
		
		
		
	}


}
