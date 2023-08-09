package java_1_notes;
import java.util.Scanner;

public class Class6B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//Create an array to store all the students' names on your row
		String[] row = new String[6];
		row[0] = "Daniel";
		row[1] = "Jackie";
		row[2] = "Alexa";
		row[3] = "Hardy";
		row[4] = "Monica";
		row[5] = "Charlie";
		System.out.println(row[0]);
		System.out.println(row[1]);
		System.out.println(row[2]);
		System.out.println(row[3]);
		System.out.println(row[4]);
		System.out.println(row[5]);
		
		//Task 2
		//Use for loop to output 0 1 2 3 4 
		for (int i=0;i<5; i++){
			System.out.println(i);
		}
		
		//Use for loop to output elements in side name one by one
		for (int i=0;i<row.length; i++){
			System.out.println(row[i]);
		}
		
		
		
		
		
	}

}
