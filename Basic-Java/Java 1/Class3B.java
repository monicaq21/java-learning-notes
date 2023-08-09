package java_1_notes;
import java.util.Scanner;

public class Class3B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String S = "Monday";
		//if S equals to Monday output "Good"
		//else output "Bad"
		if (S=="Monday"){
			System.out.println("Good");
		} else {
			System.out.println("Bad");
		}
		
		//To input a string, use S.equals
		String S1 = sc.nextLine();
		if (S1.equals("Monday")){
			System.out.println("Good");
		} else {
			System.out.println("Bad");
		}
		
		//input color as String
		//if color equals to Red output Stop
		//if color equals to Yellow output Be Careful
		//if color equals to Green output Go Fast
		System.out.println("What is the Traffic Light Color?");
		String S2 = sc.nextLine();
		if (S2.equals("Red")){
			System.out.println("Stop!");
		} else if (S2.equals("Yellow")){
			System.out.println("Be Careful!");
		} else if (S2.equals("Green")){
			System.out.println("Go Fast!");
		} else {
			System.out.println("There is no such Traffic light!");
		}
		
		//Counting
		//Count haw many 'o's
		//Bracket: Replace o with space
		String S4 = "I am going to the zoo.";
		String A = S4.replace("o","");
		System.out.println((S4.length())-(A.length()));
	}

}
