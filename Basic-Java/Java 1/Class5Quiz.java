package java_1_notes;
import java.util.Scanner;

public class Class5Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//input String S
		//if S equals to 555 output YES
		//else output NO
		System.out.println("Please input a value for String S:");
		String S = sc.nextLine();
		if (S.equals("555")){
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
		
		//using for loop to output 1 5 9 13 17 21
		for (int i=1; i<22; i=i+4){
			System.out.println(i);
		}
		
		//using for loop to output "Happy Weekend" 5 times
		for (int i=0; i<5; i++){
			System.out.println("Happy Weekend");
		}
		
		//using for loop to output char inside S one by one
		for (int i=0; i<S.length(); i++){
			System.out.println(S.charAt(i));
		}
		
		//output how many "F" inside String S
		String A = S.replace("F", "");
		System.out.println(S.length()-A.length());
		
		
		
	}

}
