package java_1_notes;
import java.util.Scanner;

public class Class4Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		//Task 1
		//input String S
		//output how many "E" inside String S
		String S = sc.nextLine();
		String A = S.replace("E", "");
		System.out.println((S.length())-(A.length()));
		
		//Task 2
		//Using for loop to output "Mother's day" 10 times
		for (int i=0; i<10; i++){
			System.out.println("Mother's day");
		}
		
		//Task 3
		//input String B
		//Output char one by one from B forward
		String B = sc.nextLine();
		for (int i=0; i<B.length(); i++){
			System.out.println(B.charAt(i));
		}
		
		//Task 4
		//Using for loop to output
		//1 4 7 10 13 16
		for (int i=1; i<17; i=i+3){
			System.out.println(i);
		}
		
		
		
	}

}
