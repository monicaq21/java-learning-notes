package java_1_notes;
import java.util.Scanner;

public class Class4B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//forLoop
		//Three parts:
		//for (initialization; termination; increment)
		//forloop is for repeating certain things (e.g. output multiple times)
		//Repeat 5 times: System.out.println("Good");
		for (int i=0; i<5; i++){
			System.out.println("Good");
		}
		//Repeat 7 times
		for (int i=0; i<7; i++){
			System.out.println("Bad");
		}
		
		//Task 1: Output Happy Thursday 4 times
		for (int i=0; i<4; i++){
			System.out.println("Happy Thursday");
		}
		//Task 2: Output Good Morning 11 times
		for (int i=0; i<11; i++){
			System.out.println("Good Morning");
		}
		
		//The range starts with zero (initialization)
		//Termination: i<(how many times to repeat)
		//Which means repeat 5 times is 0,1,2,3,4
		//"i" is the variable and could be anything
		//initialization is creating the variable (with int), the next two are using the variable
		//'i++' means increase 'i' by 1 each time
		//'i--' means decrease 'i' by 1 each time
		//i=i+/-number is increasing by the value of the number everytime (usually if printing 'i')
		//If the condition is false, nothing will be executed.
		//decimals (e.g.double) are also doable
		
		//Task 3: Count down with variable 'i'
		for (int i=8; i>=0; i--){
			System.out.println(i);
		}
		
		//Task 4: Output 5 6 7 8 9 10
		for (int i=5; i<11; i++){
			System.out.println(i);
		}
		
		//Task 5: Output 1 3 5 7 9 11
		//Counting up by different values
		for (int i=1; i<12; i=i+2){
			System.out.println(i);
		}
		
		String S = "ABCDE";
		//Using output method
		//Output A
		//Output B
		//Output C
		//Output D
		//Output E
		System.out.println(S.charAt(0));
		System.out.println(S.charAt(1));
		System.out.println(S.charAt(2));
		System.out.println(S.charAt(3));
		System.out.println(S.charAt(4));
		
		//Using forloop to output the string:
		for (int i=0; i<S.length(); i++){
			System.out.println(S.charAt(i));
		}
		
		//input String A
		//Using for loop to output char one by one forward
		String A = sc.nextLine();
		for (int i=0; i<A.length(); i++){
			System.out.println(A.charAt(i));
		}
		
	}
}
