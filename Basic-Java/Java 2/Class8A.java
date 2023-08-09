package java_2_notes;

public class Class8A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//output YES if a is arithmetic sequence String
		//increase by the same amount for every numbers
		//'sth' every character on the keyboard is assigned to a number
		String A = "1234567"; //YES
		String B = "123666"; //NO
		//50+49
		boolean flag = true;
		for (int i=0; i<A.length()-1; i++){
			int firstd = A.charAt(1)-A.charAt(0);
			if (A.charAt(i+1) - A.charAt(i) !=firstd){
				flag = false;
				break;
			}
			
		}
		if (flag=true){
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}



	}

}
