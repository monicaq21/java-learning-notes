package java_2_notes;

import java.util.Hashtable;

public class Class2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Hashtable:
		//key,value
		Hashtable<Integer,String> map = new Hashtable<Integer,String>();
		map.put(1, "Monica");
		map.put(2, "Roger");
		map.put(3, "Rain");
		map.put(4, "Harry");
		map.put(5, "Alan");
		map.put(6, "Frederic");
		map.put(7, "Yili");
		map.put(8, "Steven");
		map.put(9, "Evan");
		map.put(10, "Henry");
		
		System.out.println(map.get(10));
		
	}

}
