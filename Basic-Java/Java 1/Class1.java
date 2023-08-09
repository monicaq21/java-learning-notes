package java_1_notes;

public class Class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello Monica");
		System.out.println("Monica");
		System.out.println("tennis");
		System.out.println("Monica "+"Shawn");
		System.out.println("ABCDEFG\nHIGKLMN");
		System.out.println("  *\n ***\n*****");
		System.out.println("Monica"+" 2002/10/12");
		System.out.println("Favourite song");
		System.out.println("Tennis &"+" Badminton &"+" Table Tennis");
		//Single line comment start with double slash
		/*
		 * 13254574389247326389132032
		 * 32543623741283980425372913
		 */
		//Type name/identifier = value;
		int M = 7;
		System.out.println(M);
		
		short Cat123 = 23;
		System.out.println(Cat123);
		
//		byte is 8 bites
//		short is 16 bits, good for apps
//	    integer is 32 bits
//		long is 64 bits
//		double is 64 bits with decimals
//		float is 32 bit with decimals with f after number
		
		int a = 100000;
		int b = -200000;
		short s =10000;
		short r = -20000;
		byte A = 100;
		byte B =-50;
		long a_ = 100000;
		long b_ = -200000;
		double d1 = 123.4;
		float f1 = 234.5f;
		System.out.println(f1);
		
		int Ant = 11;
		int Bird = 21;
		System.out.println(Ant+Bird);

		
//		boolean is either true or false, 1 bit
		boolean one = true;
		System.out.println(one);
//		char is a 16 bit unicode character (Equal to any single characters)
//		char is 0~65,535, or '\u0000'~'\uffff'
//		Single quotation marks
		char letterA='A';
		char QuestionMark = '?';
		
//		'Type name = value;' is creating a variable
//		Assign different value doesn't need the type
//		The value belongs to the latest assigned value
//		Specify type weh creating, and don't need to when assigning
//		Assigning is changing the value while able to repeat variable
		
		b=8;
		a=b;
		System.out.println(a+b);
		int x = 5;
		System.out.println("The value of x is: " + x);
	
		int ant = 7;
		int bird = 9;
		int cat = 10;
		System.out.println("ant="+ant+" bird="+bird+" cat="+cat);
		bird = 12;
		cat = bird;
		System.out.println(cat);
		char Questions = '?';
		System.out.println(Questions);
		double no = 3.2;
		System.out.println(no);
		
		int xy = 3;
		int xyz = 5;
		int yz = xy*xyz;
		System.out.println(yz);
		
		
	}

}
