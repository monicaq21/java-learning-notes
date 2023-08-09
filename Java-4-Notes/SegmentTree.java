package individual_lessons;

import java.util.*;

public class SegmentTree {

	static int[] a;
	static int[] st;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();


		int height = (int)Math.ceil(Math.log(n)/Math.log(2));
		int size = (int)Math.pow(2, height+1)-1;
		System.out.println(size);
		a = new int[n];
		st = new int[size];

		for (int i=0; i<n; i++){
			a[i]=sc.nextInt();
		}
		StoreData(0,n-1,0);

		//		for (int i=0; i<size; i++){
		//			System.out.println(st[i]);
		//		}

		sc.nextLine();
		for (int i=0; i<m; i++){
			String s = sc.nextLine();
			if (s.startsWith("Q ")){
				//find min
				int start = Integer.parseInt(s.charAt(2)+"");
				int end = Integer.parseInt(s.charAt(4)+"");
				System.out.println(FindMin(0, n-1, start, end, 0));
				
			} else if (s.startsWith("M ")){
				//update
				int bf = Integer.parseInt(s.charAt(2)+"");
				int af = Integer.parseInt(s.charAt(4)+"");
				a[bf] = af;
				UpdateData(0,n-1,bf,af,0);
			}
//			for (int w=0; w<st.length; w++){
//				System.out.print(st[w]+" ");
//			}
//			System.out.println();
		}
		
	}

	public static int StoreData(int left, int right, int index){
		//index is index in the st array
		if (left==right){
			st[index] = a[left];
			return st[index];
		} else {
			int mid = (left+right)/2;
			int L = StoreData(left,mid,2*index+1);
			int R = StoreData(mid+1,right,2*index+2);
			if (L<R){
				st[index] = L;
				return st[index];
			} else {
				st[index] = R;
				return st[index];
			}
		}

	}

	public static int UpdateData(int left, int right, int diffIndex, int value, int index){
		if (left==right){
			st[index] = value;
			return value;
		} else {
			int mid = (left+right)/2;
			if (diffIndex<=mid){
				int t = UpdateData(left,mid,diffIndex,value,index*2+1);
				if (t<st[index]){
					st[index] = t;
				}
				return value;
			} else {
				int t = UpdateData(mid+1,right,diffIndex,value,index*2+2);
				if (t<st[index]){
					st[index] = value;
				}
				return value;
			}
			
		}

	}

	public static int FindMin(int left, int right, int qleft, int qright, int index){
		if (left>qright||right<qleft){
			return Integer.MAX_VALUE;
		} else if (left>=qleft&&right<=qright){
			return st[index];
		} else {
			int mid = (left+right)/2;
			int l = FindMin(left,mid,qleft,qright,index*2+1);
			int r = FindMin(mid+1,right,qleft,qright,index*2+2);
			if (l<r){
				return l;
			} else {
				return r;
			}


		}
	}

}
