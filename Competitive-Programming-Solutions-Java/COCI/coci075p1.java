import java.util.*;

public class coci075p1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
    
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (a + b == c){
			System.out.println(a + "+" + b + "=" + c);
		} else if (a == b + c){
			System.out.println(a + "=" + b + "+" + c);
		} else if (a == b - c){
			System.out.println(a + "=" + b + "-" + c);
		} else if (a * b == c){
			System.out.println(a + "*" + b + "=" + c);
		} else if (a == b * c){
			System.out.println(a + "=" + b + "*" + c);
		} else if (a - b == c){
			System.out.println(a + "-" + b + "=" + c);
		} else if (a / b == c){
			System.out.println(a + "/" + b + "=" + c);
		} else if (a == b / c){
			System.out.println(a + "=" + b + "/" + c);
		}
		
		
		
	}
}
