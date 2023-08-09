package java_2_notes;

import java.util.Arrays;
import java.util.Scanner;

public class Class1B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//Task 1
		//input String S
		//if S equals to "Good" output "YES"
		//else output "NO"
		String S = sc.nextLine();
		if (S.equals("Good")){
			System.out.println("YES");
		} else {
			System.out.println("NO");


			sc.nextInt();
			//Task 2
			//input number A
			//if number is even number, output "Even"
			//else output "Odd"
			int A = sc.nextInt();
			if (A%2==0){
				System.out.println("Even");
			} else if (A%2==1){
				System.out.println("Odd");
			}

			//Task 3
			//input String C
			//using switch and case
			//if C equals to "Green" output "GO"
			//if C equals to "Yellow" output "Slow Down"
			//if C equals to "Red" output "Stop"
			//else output "This is an invalid traffic light"
			sc.nextLine();
			String C = sc.nextLine();
			switch(C){
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
				sum = sum+i;
			}
			for (int i=0; i<5; i++){
				System.out.println(F[i]);
			}
			System.out.println("The total is "+sum+".");
			System.out.println("The average is "+sum/5.0+".");
			Arrays.sort(F);
			System.out.println("The median is "+F[2]+".");

			sc.nextLine();
			//Task 7
			//input String G
			//if G is Palindrome output "Perfect"
			//else output "Not Perfect"
			String G = sc.nextLine();
			boolean g = true;
			for (int i=0; i<G.length(); i++){
				char a = G.charAt(i);
				char b = G.charAt(G.length()-i-1);
				if (a!=b){
					g = false;
				}
			} System.out.println(g);

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


			//Task 10
			//Using while loop to input fruits
			//each time you input the fruit, you output it
			//if you input "apple", then stop the program
			while (true){
				String fruit = sc.nextLine();
				System.out.println(fruit);
				if (fruit.equals("apple")){
					break;
				}

			}


		}
	}

}

