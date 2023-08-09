package java_2_notes;

import java.util.Scanner;

public class Class3A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		//9/25
		//Solution for change (money) is in p109ex10
		//e.g. 7/4 cuts off the decimal part so it would be 1 not 2
		System.out.println(7/4);

		//base conversion
		//to convert, do the equation 
		//digit.value*(base^digit.place-1)
		//e.g. 444 is base 6 number
		//4*(6^2)+4*(6^1)+4*(6^0)
		//in java use valueOf:
		//type name = type.valueOf("number",base);
		//[!!]If it doesn't work change the String base to (sc.next)
		
		Long base10 = Long.valueOf("222",3);
		System.out.println(base10);
		
		//777 base 8
		int base3 = Integer.valueOf("777",8);
		System.out.println(base3);
		
		//777 base 3
		int base4 = Integer.valueOf("777",3);
		System.out.println(base4);
		
		//Bases
		//in math no digits could reach 10 (max=9)
		//in java base 8 means max=7, so 8-->10
		
		//base10	base8
		//(math)	(java)
		//1			1
		//2			2
		//3			3
		//4			4
		//5			5
		//6			6
		//7			7
		//8			10
		//9			11
		//10		12
		//16		20
		
		
		
	}

}
