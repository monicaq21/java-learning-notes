package java_1_notes;

import java.util.Scanner;

public class Class8C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		//outputs count of combinations of an input number with two hands
		//there are no repeats/reverses in the combinations
		int N = sc.nextInt();
		int count = 0;
		for (int l=0; l<6; l++){
			for (int r=0; r<6; r++){
				if (l+r==N && l<=r){
					count++;
				}

			}
		}
		System.out.println(count);





	}

}
