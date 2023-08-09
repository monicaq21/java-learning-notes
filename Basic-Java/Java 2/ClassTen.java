package java_2_notes;

public class ClassTen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//midterm exam (in another project)
		String S = "ABC";
		//the first char shift to right by 5
		//the second char shift to right by 8
		//the third char shift to right by 11
		
		char[] a = S.toCharArray();
		a[0]=(char) (Character.valueOf('A')+5);
		a[1]=(char) (Character.valueOf('B')+8);
		a[2]=(char) (Character.valueOf('C')+11);
		System.out.print(a[0]);
		System.out.print(a[1]);
		System.out.println(a[2]);
		
		//other easier method
		//simply do:
		System.out.print((char)('A'+5));
		System.out.print((char)('B'+8));
		System.out.println((char)('C'+11));
		
		//based on the index table, we put the type in the first bracket
		//then we give the value and it will convert to the value of that type
		//index table could be found online
		
		
		
		
	}

}
