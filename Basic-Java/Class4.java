package java_3_notes;

public class Class4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Swap indexes in an array
		int[] a = {1,2,3,4,5};
		swap(0,1,a);
		for (int i=0; i<a.length; i++){
			System.out.println(a[i]);
		}
		
		//create a function to swap a[]'s index 0 and 1
		//to get 2 1 3 4 5
		
		
		
		
	}
	public static void swap(int i1, int i2, int[] a){
		int temp = a[i1];
		a[i1] = a[i2];
		a[i2] = temp;
		
		//if data structures change in a class (e.g. array, linkedlist, stack), it changes in total
		//if one value changes in a class, it doesn't affect the other classes
		
	}

}
