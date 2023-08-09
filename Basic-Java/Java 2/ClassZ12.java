package java_2_notes;

import java.util.Scanner;

public class ClassZ12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
//		input 9 numbers and store into 3*3 2D array
//		locate 50's row and col value
//		if there is no 50, output no 50
		int k=0;
		
		int[][] a = new int[3][3];
		for (int col=0; col<3; col++){
			for (int row=0; row<3; row++){
				a[col][row]=sc.nextInt();
			}
		}
		
		for (int col=0; col<3; col++){
			for (int row=0; row<3; row++){
				if (a[col][row]==50){
					System.out.println(col+1+" "+row+1);
					break;
				}
				if (a[col][row]!=50){
					k++;
					if (k==9){
					System.out.println("No 50");
					}
				}
			}
		}
		
		
		//or create a flag
		//start with false
		//if ==50, it is true
	}

}
