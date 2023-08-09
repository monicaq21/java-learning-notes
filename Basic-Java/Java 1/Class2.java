package java_1_notes;
import java.util.Scanner;

public class Class2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Applicable for all types except for char
//		Reference data type: Scanner is input, upper case
		System.out.println("Please type in a value for A");
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		byte B = sc.nextByte();

		
		System.out.println("The value of A is:"+A);
		
		System.out.println("What is your age?");
		int age = sc.nextInt();
		if (age<3){
			System.out.println("Free ticket");
		} else if (age>=3 && age <= 18){
			System.out.println("$10 ticket");
		} else if (age>18 && age <65){
			System.out.println("$15 ticket");
		} else {
			System.out.println("$10 ticket");
		}
		
//		Practice Questions
		System.out.println("Please enter a number:");
		int number = sc.nextInt();
		if (number<0){
			System.out.println("You have entered a negative number");
		} else if (number==0){
			System.out.println("You have entered 0");
		} else{
			System.out.println("You have entered a positive number");
		}
		
		System.out.println("Please input a decimal number");
		double decimal = sc.nextDouble();
		System.out.println("Please input another decimal number");
		double decimal2 = sc.nextDouble();
		if (decimal - decimal2<0.5 && (decimal - decimal2)>-0.5){
			System.out.println("BANANAS");
		} else {
			System.out.println("");
		}
		
		//Problem Solving
		System.out.println("What is the speed limit?");
		int speedlimit = sc.nextInt();
		System.out.println("What is the recorded speed of your car?");
		int carspeed = sc.nextInt();
		if (carspeed <= speedlimit){
			System.out.println("Congratulations, you are within the speed limit!");
		} else if (carspeed - speedlimit < 21){
			System.out.println("You are speeding and your fine is $100.");
		} else if (carspeed - speedlimit < 31){
			System.out.println("You are speeding and your fine is $270.");
		} else {
			System.out.println("You are speeding and your fine is $500.");
		}
	}

}
