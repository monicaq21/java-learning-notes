package java_1_notes;

import java.util.Scanner;

public class ClassTen3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		//Input String S
		//Use for loop to output char one by one forward
		String S = sc.nextLine();
		for (int i=0; i<S.length(); i++){
			System.out.println(S.charAt(i));
		}

		//use for loop to output char oneby one backward
		for (int i=0; i<S.length(); i++){
			System.out.println(S.charAt(S.length()-i-1));
		}


		//Practice 2
		//Input String A
		//Use for loop to output char one by one forward & backward
		String A = sc.nextLine();
		for (int i=0; i<A.length(); i++){
			System.out.println(A.charAt(i));
		}
		for (int i=0; i<A.length(); i++){
			System.out.println(A.charAt(A.length()-i-1));
		}

		boolean flag = true;


		//Palindrome: backward and forward = same
		for (int i=0; i<S.length(); i++){
			char forward = S.charAt(i);
			char backward = S.charAt(S.length( )-i-1);
			if (forward!=backward){
				flag = false;
				break;
			}
		}
		if (flag == true){
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
		
		//While loop
		//input fruits and output them
		//if input = apple, stop
		
		while (true){
			String fruit = sc.next();
			System.out.println(fruit);
			if (fruit.equals("apple")){
				break;
			}
		}

	}

}
