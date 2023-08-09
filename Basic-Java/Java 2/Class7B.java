package java_2_notes;

public class Class7B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String S = "ABC#BC#YYYY#a#b#c";

		//DELIMITER:
		//use # as delimiter --> Separator
		//split s into String Array A
		//ABC BC YYYY a b c
		String[] A = S.split("#");
		for (int i=0; i<A.length; i++){
			System.out.println(A[i]);
		}

	}

}
