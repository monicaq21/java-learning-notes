package java_1_notes;
import java.util.Scanner;

public class Class6Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		//input String S, if S equals to Monday output YES
		//else output NO
		String S = sc.nextLine();
		if (S.equals("Monday")){
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

		//input int N, if N between 5~10 (includes) output YES
		//else output NO
		int N = sc.nextInt();
		if (N>4 && N<11){
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

		sc.nextLine();

		//input String A, using for loop to output char inside A one by one
		System.out.println("Please input a string:");
		String A = sc.nextLine();
		for (int i=0; i<A.length(); i++){
			System.out.println(A.charAt(i));
		}

		//output A's length
		System.out.println(A.length());

		//if A contains "Monday" output "YES", else output "NO"
		String A1 = A.replace("Monday", "");
		if (A.length()>A1.length()){
			System.out.println("YES");
		} else if (A.length()==A1.length()){
			System.out.println("NO");
		}
		//or use "contains"
		if (A.contains("Monday")){
			System.out.println("YES");
		} else if (A.length()==A1.length()){
			System.out.println("NO");
		}

		//using two ways to output how many "Z" inside String A
		//output the counts
		//Method 1
		String AZ = A.replace("Z", "");
		System.out.println(A.length()-AZ.length());
		//Method 2
		int countZ = 0;
		for (int i=0; i<A.length(); i++){
			char z = A.charAt(i);
			if (z=='Z'){
				countZ++;
			}
		} System.out.println(countZ);

	}

}
