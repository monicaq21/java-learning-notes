package java_1_notes;

import java.util.Scanner;

public class Class9B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		//Class Competition
		//dice1 has m sides
		//dice2 has n sides
		//dice3 has o sides
		//output the number of ways 'dice1 + dice2 + dice3' is even
		int m = sc.nextInt();
		int n = sc.nextInt();
		int o = sc.nextInt();
		int count =0;
		for (int i=0; i<m; i++){
			for (int k=0; k<n; k++){
				for (int l=0; l<o; l++){
					if ((i+k+l)%2==0){
						count++;
					}
				}
			}
		}
		System.out.println(count);

		//input int N
		//output all the factors of N

		int N = sc.nextInt();
		int countN = 0;
		for (int i=1; i<=N; i++){
			if (N%i==0){
				countN++;
				System.out.println("One of the factors is "+i+".");
			}
		}
		System.out.println("The total number of factors is "+countN+".");
		
		
//		Teaching & Learning
//		Java Program
//		4 Key Concepts:
//		-Class
//			Class is a template/blueprint to create objects
//			When you create a class you need to create data and method
//			E.g. A person
//			Data is what a person has (name, hair color, etc)
//			Method is what a person can do
//		-Object
//			An object is an instance of a class
//			It is a concrete representation of class
//			A class shows the name of data but object shows concrete date info
//			E.g. class is speed and object is 10 mph
//		-Methods 
//			A method is a behavior
//			E.g. A dog has behaviors - wagging, barking, eating, running, biting, etc
//			A class can contain many methods
//			It is in methods where logics are written
//			Data is manipulated and all the actions are executed
//		-Instance variables
//			Aka Data member: each object has uique set of data member
//			It stores information -- object's state
//			E.g. A dog has color, name, breed, size
		
		
		
		
		
		
	}

}
