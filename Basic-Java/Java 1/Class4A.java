package java_1_notes;
import java.util.Scanner;

public class Class4A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		//Reviews for last class
		//Task 1
		//input String season
		//if season = "Summer" output "Hot"
		//spring --> warm
		//winter --> cold
		//fall --> cool
		System.out.println("What is the season?");
		String S = sc.nextLine();
		if (S.equals("summer")){
			System.out.println("hot");
		} else if (S.equals("spring")){
			System.out.println("warm");
		} else if (S.equals("winter")){
			System.out.println("cold");
		} else if (S.equals("fall")){
			System.out.println("cool");
		}
		
		//Task 2
		//input int A
		//input int B
		//if A+B is greater than 100 output "Good"
		//else output "Bad"
		System.out.println("Please enter an integer:");
		int A = sc.nextInt();
		System.out.println("Please enter another integer:");
		int B = sc.nextInt();
		if ((A+B)>100){
			System.out.println("Good");
		} else {
			System.out.println("Bad");
		}
		
		//Task 3
		String St = "I am going to wonderland";
		//using substring to output wonderland
		//output St's length
		System.out.println(St.substring(14, 24));
		System.out.println(St.length());
		
	}

}
