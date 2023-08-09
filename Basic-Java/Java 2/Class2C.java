package java_2_notes;

import java.util.LinkedList;
import java.util.Scanner;

public class Class2C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		//input numbers and store into linkedlist
		//if number=-1 program stop
		//output the sum of all numbers
		LinkedList<Integer> A = new LinkedList<Integer>();
		int sum = 0;
		while (true){
			int s = sc.nextInt();
			if (s==-1){
				break;
			}
			A.add(s);
		}
		for (int i=0; i<A.size(); i++){
			sum = sum + A.get(i);
		}
		
		System.out.println(sum);

	}

}
