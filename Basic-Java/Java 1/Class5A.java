package java_1_notes;
import java.util.Scanner;

public class Class5A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
				
		//ccc13j2: Rotating Letters
		System.out.println("Please enter a word:");
		String word = sc.nextLine();
		String I = word.replace("I", "");
		String O = I.replace("O", "");
		String S = O.replace("S", "");
		String H = S.replace("H", "");
		String Z = H.replace("Z", "");
		String X = Z.replace("X", "");
		String N = X.replace("N", "");
		if (N.length()>0){
			System.out.println("NO");
		} else if (N.length()==0){
			System.out.println("YES");
		}
		
		
		//Practice 1
		String St = "AB:-):-(:-(";
		//COUNT HAPPY FACE
		//COUNT SAD FACE
		//if happy more than sad output "happy"
		//if sad more than happy output "sad"
		//else output "tie"
		String H1 = St.replace(":-(", "");
		String S1 = St.replace(":-)", "");
		if (S1.length()>H1.length()){
			System.out.println("sad");
		} else if (S1.length()<H1.length()){
			System.out.println("happy");
		} else {
			System.out.println("tie");
		}
		
		//Practice 2
		String S0 = "AEIOUAAEEIIOOUU";
		//remove A from S
		//then e
		//then i
		//then o
		//then u
		S0 = S0.replace("A", "");
		S0 = S0.replace("E","");
		S0 = S0.replace("I", "");
		S0 = S0.replace("O", "");
		S0 = S0.replace("U", "");
		
		//Practice 3
		String A0 = "AABBCCDDD";
		//output count of A from string A0
		//output b
		//output c
		//output d
		String A01 = A0.replace("A", "");
		System.out.println(A0.length()-A01.length());
		String A02 = A0.replace("B", "");
		System.out.println(A0.length()-A02.length());
		String A03 = A0.replace("C", "");
		System.out.println(A0.length()-A03.length());
		String A04 = A0.replace("D", "");
		System.out.println(A0.length()-A04.length());
		
		//The other method
		String S9 = "AAAAABB";
		//using for loop to count A
		int countA = 0;
		for (int i=0; i<S9.length(); i++){
			char c = S9.charAt(i);
			if (c=='A'){
				countA++;
			}
		}
		System.out.println(countA);
		
		
		//using for loop to count B
		int countB = 0;
		for (int i=0; i<S9.length(); i++){
			char k = S9.charAt(i);
			if (k=='B'){
				countB++;
			}
					
		}
		System.out.println(countB);
		
	}

}
