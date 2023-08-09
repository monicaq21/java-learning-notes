package java_1_notes;
import java.util.Scanner;

public class Class5B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//input String S
		//Output the length of S
		//Count how many A inside String S
		//Output the count
		//Using two way to do so
		String S = sc.nextLine();
		System.out.println(S.length());
		
		//Method 1
		String A = S.replace("A", "");
		System.out.println((S.length())-(A.length()));
		
		//Method 2
		int countA = 0;
		for (int i=0; i<S.length(); i++){
			char a = S.charAt(i);
			if (a=='A'){
				countA++;
			}
			
		} System.out.println(countA);
		
		//Task 1
		//Input String SS
		//Use for loop to output char from SS one by one
		System.out.println("Please input a value for String SS:");
		String SS = sc.nextLine();
		for (int i=0; i<SS.length(); i++){
			System.out.println(SS.charAt(i));
		}
		
		//Task 2
		//Input int N
		//If N less than 3 output small
		//else if N between 3 and 5 (includes) output middle
		//else if N greater than 5 output big
		System.out.println("Please enter an integer:");
		int N = sc.nextInt();
		if (N<3){
			System.out.println("Small");
		} else if (N>5){
			System.out.println("Big");
		} else {
			System.out.println("middle");
		}
		
		//Task 3
		String AA = "H--A--P--P--Y  W--E--E--K--E--N--D";
		//remove all the "-" from AA
		//remove all the space from AA
		//output AA
		AA = AA.replace("-", "");
		AA = AA.replace(" ", "");
		System.out.println(AA);
		
		
	}
		
		
}
