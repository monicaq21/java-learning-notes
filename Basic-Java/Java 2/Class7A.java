package java_2_notes;

public class Class7A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String S = "ABCDE";
		//split S into charArray A
		//Use for loop to output every elements inside array A one by one
		char[] A = S.toCharArray();
		for (int i=0; i<A.length; i++){
			System.out.println(A[i]);
		}
		
		//or
		
		char[] A1 = new char[S.length()];
		for (int i=0; i<S.length(); i++){
			A1[i] = S.charAt(i);
			System.out.println(A1[i]);
		}

		//Create a 2D array and output each letters from A to L
		char[][] B = {{'A','B','C','D'},
				{'E','F','G','H'},
				{'I','J','K','L'}
		};
		for (int i=0; i<3; i++){
			for (int l=0; l<4; l++){
				System.out.print(B[i][l]+" ");
			}
		}
		System.out.println("");

		//output B vertically
		for (int i=0; i<4; i++){
			for (int l=0; l<3; l++){
				System.out.print(B[l][i]+" ");
			}
		}



	}

}
