package java_1_notes;
import java.util.Scanner;

public class Class3A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Class2 Reviews
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input the value of A");
		int A = sc.nextInt();
		System.out.println("Please input the value of B");
		int B = sc.nextInt();
		System.out.println("The value of A times B is " + A*B + ".");
		
		System.out.println("Please input the value of C");
		double C = sc.nextDouble();
		System.out.println("Please input the value of D");
		float D = sc.nextFloat();
		System.out.println("The value of C times D is " + C*D + ".");
		
		System.out.println("Please input the value of N");
		int N = sc.nextInt();
		if (N>0){
			System.out.println("Positive");
		} else if (N<0){
			System.out.println("Negative");
		} else {
			System.out.println("Zero");
		}
		

		
		//String:   0123456789 -- Matching Each of them using 'charAt()'
		String S = "ABCDEFGHIJ";
		System.out.println(S);
		//reference data type: Scanner, String
		//String name must start with upper case S
		//output "A" from S
		System.out.println(S.charAt(0));
		System.out.println(S.charAt(1));
		//Output D from S
		System.out.println(S.charAt(3));
		//Output E from S
		System.out.println(S.charAt(4));
		
		//S.substring is a part of the string
		//Beginning index includes the number
		//Ending index excludes the number
		//E.g. position 3~5 would be (3,6)
		//Output DEF
		System.out.println(S.substring(3, 6));
		//Output EFGH
		System.out.println(S.substring(4, 8));
		//Output CDEFG
		System.out.println(S.substring(2, 7));
		
		//S.length outputs how many letters are in String S
		System.out.println(S.length());
		//how to input String
		//Conflict between nextInt and nextLine, so they can't be done together
		//There has to be a "sc.nextLine();" in between of the two lines
		System.out.println("Please insert a string:");
		String S1 = sc.nextLine();
		System.out.println(S1);
		
		//Difference between sc.next and sc.nextLine
		//nextline shows everything but next ignores characters after space
		//No space for next
		String AB = sc.next();
		System.out.println(AB);
		
		//Correct Version:
		int M = sc.nextInt();
		System.out.println(M);
		
		sc.nextLine();
		
		String Q = sc.nextLine();
		System.out.println(Q);
		//sc.nextLine(); has to be on a separate doc otherwise everything else doesn't work
	}

}
