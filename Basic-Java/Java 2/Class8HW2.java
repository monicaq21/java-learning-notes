package java_2_notes;

public class Class8HW2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Output every minutes starting from 9:00 for 3 hours
		int hour = 9;
		int minute = 0;
		
		while (true){
			if (hour==12 && minute==0){
				break;
			}
			System.out.printf("%02d:%02d",hour,minute);
			System.out.println();
			minute++;
			if (minute==60){
				hour++;
				minute=0;
			}
		}
		
		
		
	}

}
