package java_2_notes;

import java.util.Scanner;
import java.util.Stack;

public class ClassZ11C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//infix: 3 + 4
		//postfix: 3 4 +
		//prefix: + 3 4
		
		//postfix:::
		//operator controls the previous two datas, so it is not in order
		//Therefore, "3 4 7 * +" is 31, not 19
		
		//data: put into stack
		Stack <Integer> s = new Stack <Integer>();
		for (int i=0; i<7; i++){
			char c = sc.next().charAt(0);
			if (c>='0'&&c<='9'){
				s.push(c-'0');
			} else {
				int n2 = s.pop();
				int n1 = s.pop();
				if (c=='+'){
					s.push(n1+n2);
				} else if (c=='-'){
					s.push(n1-n2);
				} else if (c=='*'){
					s.push(n1*n2);
				} else if (c=='/'){
					s.push(n1/n2);
				} 
				break;
			}
		}
		System.out.println(s.pop());
		
	}

}
