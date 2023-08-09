package java_2_notes;

import java.util.LinkedList;
import java.util.Scanner;

public class Class2HW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//9/21 Homework 2
		
//		input numbers 
//		if input -1 we stop
//		output the sum of all the numbers
		int sum=0;
		while (true){
			int A = sc.nextInt();
			sum = sum+A;
			if (A==-1){
				break;
			}
		}
		System.out.println(sum+1);

//		input numbers
//		if input -1 we stop
//		output the max number of all the numbers (don' use Arrays.sort)
		int max = 0;
		while (true){
			int A = sc.nextInt();
			if (A>max){
				max = A;
			}
			if (A==-1){
				break;
			}
		}
		System.out.println(max);

//		input foods
//		if food equals to "banana" we stop
//		output the foods
		LinkedList <String> l = new LinkedList <String>();
		while (true){
			String food = sc.nextLine();
			if (food.equals("banana")){
				break;
			}
			l.add(food);
			
		}
		System.out.println(l);
		
	}

}
