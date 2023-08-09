package java_1_notes;

import java.util.Scanner;

public class ClassTen2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//input int N
		//use Switch and Case
		//if N equals 1 output "First Place"
		//if 2 output "Second Place"
		//if 3 output "Third Place"
		//else output "Good"
		int N = sc.nextInt();
		switch (N){
		case 1:
			System.out.println("First Place");
			break;
		case 2:
			System.out.println("Second Place");
			break;
		case 3:
			System.out.println("Third Place");
			break;
		default:
			System.out.println("Good");
		}
		
		
		
	}

}
