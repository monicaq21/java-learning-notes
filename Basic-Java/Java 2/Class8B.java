package java_2_notes;

import java.util.Scanner;

public class Class8B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//input string s "hh:mm"
		//split into hour and minute
		//output from that hour every single minutes for 2 hours
		String s = sc.nextLine();
		String[] S = s.split(":");

		int hour = Integer.parseInt(S[0]);
		int minute = Integer.parseInt(S[1]);
		int count = 0;

		for (int i=0; i<119; i++){

			if (minute==59){
				minute=0;
				hour++;
			} else {
				minute++;
			}
			if (hour>12){
				hour = hour-12;
			}
			String k = "";
			if (minute>9) {
				k = k + hour + minute;
			} else {
				k = k + hour + "0" + minute;
			}
			if (isA(s)) {
				count++;
			}

			System.out.printf("%02d:%02d",hour,minute);
			System.out.println();

		}
		//printf is a print format
		//2d - 2 digits   hour minute
		//System.out.printf("%02d:%02d", hour,minute);


	}

	public static boolean isA(String S) {
		int firstD = S.charAt(1) - S.charAt(0);
		for (int i=0; i<S.length()-1; i++) {
			if (S.charAt(i+1)-S.charAt(i)!=firstD) {
				return false;
			}
		}
		return true;
	}
}
