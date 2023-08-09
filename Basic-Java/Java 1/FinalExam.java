package java_1_notes;

import java.util.Arrays;
import java.util.Scanner;

public class FinalExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		//2017/8/25 - 30 mins
		//Task 1
		//input String S
		//if S equals to "Good" output "YES"
		//else output "NO"
		String S = sc.nextLine();
		if (S.equals("Good")){
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

		//Task 2
		//input number A
		//if number is even number, output "Even"
		//else output "Odd"
		int A = sc.nextInt();
		if (A%2==0){
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}

		sc.nextLine();

		//Task 3
		//input String C
		//using switch and case
		//if C equals to "Green" output "GO"
		//if C equals to "Yellow" output "Slow Down"
		//if C equals to "Red" output "Stop"
		//else output "This is an invalid traffic light"
		String C = sc.nextLine();
		switch (C){
		case "Green":
			System.out.println("GO");
			break;
		case "Yellow":
			System.out.println("Slow Down");
			break;
		case "Red":
			System.out.println("Stop");
			break;
		default:
			System.out.println("This is an invalid traffic light");
		}

		//Task 4
		//input String D
		//Using for loop to output char inside D forward
		//Using for loop to output char inside D backward
		String D = sc.nextLine();
		for (int i=0; i<D.length(); i++){
			System.out.println(D.charAt(i));
		}
		for (int i=0; i<D.length(); i++){
			System.out.println(D.charAt(D.length()-i-1));
		}

		//Task 5
		//input number E
		//output all the factors of E
		int E = sc.nextInt();
		for (int i=1; i<=E; i++){
			if (E%i==0){
				System.out.println(i);
			}
		}

		//Task 6
		//input 5 numbers and store into array F
		//Using for loop to output every elements of F
		//output the total of these 5 numbers
		//output the average and median
		int[] F = new int[5];
		int sum = 0;
		for (int i=0; i<5; i++){
			F[i] = sc.nextInt();
			sum = sum+F[i];
		}
		for (int i=0; i<5; i++){
			System.out.println(F[i]);
		}
		Arrays.sort(F);
		System.out.println("The sum is "+sum+".");
		System.out.println("The average is "+sum/5.0+".");
		System.out.println("The median is "+F[2]+".");

		sc.nextLine();

		//Task 7
		//input String G
		//if G is Palindrome output "Perfect"
		//else output "Not Perfect"
		String G = sc.nextLine();
		boolean p = true;
		for (int i=0; i<G.length(); i++){
			if ((G.charAt(i))!=(G.charAt(G.length()-i-1))){
				p = false;
			}
		} 
		if (p==true){
			System.out.println("Perfect");
		} else if (p==false){
			System.out.println("Not Perfect");
		}

		//Task 8
		//create Circle1 class
		//data member is radius
		//method calculateArea
		//method calculatePerimeter
		//create Circle1 object H with radius as 4
		//output area of H
		//output perimeter of H

		//Task 9
		//Felix has 5 numbers 5 6 7 8 9
		//Rain has 6 numbers 5 7 9 11 13 15
		//output all the combinations
		for (int i=5; i<10; i++){
			for (int l=5; l<16; l=l+2){
				System.out.println(i+" "+l);
			}
		}

		
		//While loop
		//input fruits and output them
		//if input = apple, stop
		
		while (true){
			String fruit = sc.next();
			System.out.println(fruit);
			if (fruit.equals("apple")){
				break;
			}
		}
		
	}

}
