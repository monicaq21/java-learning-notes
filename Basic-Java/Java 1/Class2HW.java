package java_1_notes;
import java.util.Scanner;

public class Class2HW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Homework 1
		int AA = 10;
		System.out.println(AA);
		short BB = 100;
		System.out.println(BB);
		byte CC = 111;
		System.out.println(CC);
		long DD = 11111;
		System.out.println(DD);
		double EE = 11.11;
		System.out.println(EE);
		float FF = 11.11f;
		System.out.println(FF);
		boolean GG = false;
		System.out.println(GG);
		char HH = 'a';
		System.out.println(HH);
		
		// Homework 2
		Scanner sc = new Scanner(System.in);
		System.out.println("Please type in the value for the first integer:");
		int a = sc.nextInt();
		System.out.println("Please type in the value for the second integer:");
		int b = sc.nextInt();
		System.out.println("Please type in the value for the third integer:");
		int c = sc.nextInt();
		System.out.println("The product of the three integers is " + a*b*c + ".");
		
		// Homework 3
		System.out.println("Please type in an integer value:");
		int A = sc.nextInt();
		System.out.println("The integer value is " + A + ".");
		System.out.println("Please type in a decimal value:");
		double B = sc.nextDouble();
		System.out.println("The decimal value is " + B + ".");
		System.out.println("Please type in true or false:");
		boolean C = sc.nextBoolean();
		System.out.println("You just typed in " + C + ".");
		System.out.println("Please type in an integer value:");
		long D = sc.nextLong();
		System.out.println("The integer value is " + D + ".");
		
		// Homework 4
		System.out.println("Please Enter a number:");
		int N = sc.nextInt();
		if (N==1){
			System.out.println("red");
		} else if (N==2){
			System.out.println("green");
		} else if (N==3){
			System.out.println("yellow");
		} else {
			System.out.println("wrong traffic light");
		}
		
		// Homework 5
		System.out.println("Please enter a number:");
		double number1 = sc.nextDouble();
		System.out.println("Please enter another number:");
		double number2 = sc.nextDouble();
		if (number1>number2){
			System.out.println("Good morning");
		} else if (number1<number2){
			System.out.println("Good afternoon");
		} else{
			System.out.println("Good evening");
		}
		
	}

}
