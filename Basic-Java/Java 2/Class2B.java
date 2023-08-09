package java_2_notes;

import java.util.Scanner;

public class Class2B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		//input single digit positive numbers
		//when input=-1, stop
		//output counts of 1 to 9
		int[] count = new int[9];
		while (true){
			int A = sc.nextInt();
			for (int i=0; i<9; i++){
				if (A==i+1){
					count[i]++;
				}
			}
			if (A==-1){
				break;
			}
		}
		for (int i=0; i<9; i++){
			System.out.println(count[i]);
		}
		
		
		//LinkedList:
		//LinkedList is a dynamic array
		//array has fixed size but linkedlist have flexible size
		//LinkedList <type> name = new LinkedList<type>();
		//primitive 	Reference
		//byte      	Byte
		//short			Short
		//int			Integer
		//long			Long
		//char			Character
		//boolean		Boolean
		//double		Double
		//float			Float
		//look at ccc05j3 for more info

	}

}
