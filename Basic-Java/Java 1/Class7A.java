package java_1_notes;
import java.util.Scanner;

public class Class7A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//input int s
		//output one star
		//output s spaces
		//output one star
		//output s spaces
		//output one star
		int s = sc.nextInt();
		System.out.print("*");
		for (int i=0; i<s; i++){
			System.out.print(" ");
		}
		System.out.print("*");
		for (int i=0; i<s; i++){
			System.out.print(" ");
		}
		System.out.print("*");
		
		
	}

}
