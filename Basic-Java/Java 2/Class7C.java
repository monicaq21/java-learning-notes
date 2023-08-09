package java_2_notes;

public class Class7C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String S0 = "ABCD";
		String S1 = "EFGH";
		String S2 = "IJKL";

		//Create String Array A to store s0 s1 s2
		//A is 1D array
		//according to array A, output:
		//AEI
		//BFJ
		//CGK
		//DHL
		String[] A = new String[3];
		A[0] = S0;
		A[1] = S1;
		A[2] = S2;
		//or String[] A = {S0, S1, S2};

		for (int col=0; col<4; col++){
			for (int row=0; row<3; row++){
				System.out.print(A[row].charAt(col));
			}
			System.out.println("");
		}


	}

}
