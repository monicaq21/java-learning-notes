package java_1_notes;

import java.util.Scanner;

public class Class8Quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		//joy 1 2 3 4 5
		//steven 5 6 7
		//output all the combinations
		for (int j=1; j<6; j++){
			for (int s=5; s<8; s++){
				System.out.println(j+" "+s);
			}
		}

		//output only the combinations joy+steven=8
		for (int j=1; j<6; j++){
			for (int s=5; s<8; s++){
				if (j+s==8){
					System.out.println(j+" "+s);
				}
			}
		}

		//output the amount of combinations joy+steven=10
		//with no repeats and no reverses
		int count = 0;
		for (int j=1; j<6; j++){
			for (int s=5; s<8; s++){
				if (j+s==10 && j<=s){
					count++;
				}
			}
		} System.out.println(count);



	}

}
