package java_1_notes;
import java.util.Scanner;

public class Class5HW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//Assignment Task
		//Input String S
		//use for loop to output char inside S one by one
		String S = sc.nextLine();
		for (int i=0; i<S.length(); i++){
			System.out.println(S.charAt(i));
		}
		
		//Input String A1
		//output how many "B" inside String A1
		String A1 = sc.nextLine();
		String A2 = A1.replace("B", "");
		System.out.println(A1.length()-A2.length());
		
		//input String B
		//Output the length of String B
		//if B contains A output YES else NO
		String B = sc.nextLine();
		System.out.println(B.length());
		String B1 = B.replace("A", "");
		if (B.length()==B1.length()){
			System.out.println("NO");
		} else {
			System.out.println("YES");
		}
		
		//input String C
		//if C equals to ABC output YES else NO
		String C = sc.nextLine();
		if (C.equals("ABC")){
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
		//input int D
		//if D between 25 to 100 (includes) output YES else NO
		int D = sc.nextInt();
		if (D>24 && D<101) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
		
		//use for loop output 5 10 15 20 25
		//use for loop output 6 8 10 12 14 16 18
		//use for loop output Happy Weekend 100 times
		for (int i=5; i<26; i=i+5){
			System.out.println(i);
		}
		for (int i=6; i<19; i=i+2){
			System.out.println(i);
		}
		for (int i=0; i<100; i++){
			System.out.println("Happy Weekend");
		}
		
	}

}
