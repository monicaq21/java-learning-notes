package java_3_notes;

public class Binary_Search {

	public static int find(int[] a, int start, int stop, int n){
		int mid = (start+stop)/2;
		if (a[mid]==n){
			return mid;
		} else if (a[mid]>n){
			return find(a,start,mid,n);
		} else {
			return find(a,mid,stop,n);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,6,8,9,10,14,17,23,24,28,35,56,57,59,72,73};
		int n = 8;
		System.out.println(find(a,0,a.length-1,n));

		//instead of looking at elements one by one,
		//it compares with the middle one,
		//and gets rid of half.
		//should be 3

	}

}
