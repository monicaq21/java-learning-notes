package java_1_notes;
import java.util.Scanner;

public class Class6A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//Array
		//Array is a series of identical type of data stored together
		//Create 1 variable with many elements/values
		//Definition:
		//Type[] identifier
		//Type should be a data type or a strucure type
		
		//Type[] name = new Type[Size/number of data];
		String[] names = new String[5];
		names[0] = "Daniel";
		names[1] = "Jackie";
		names[2] = "Alexa";
		names[3] = "Hardy";
		names[4] = "Monica";
		
		System.out.println(names[4]);
		//System.out.println(names); does not work
		
		//Task 1
		//output the first element
		System.out.println(names[0]);
		//output the second element
		System.out.println(names[1]);
		//output the third element
		System.out.println(names[2]);
		//output the fourth element
		System.out.println(names[3]);
		//output the fifth element
		System.out.println(names[4]);
		
	}

}
