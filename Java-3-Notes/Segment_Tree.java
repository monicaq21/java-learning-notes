package java_3_notes;

import java.io.*;
import java.util.*;



public class Segment_Tree {
	
	static int[] a;
	static Seg[] seg;

	public static class Seg {
		int left;
		int right;
		int gcd;
		int min;
		int num;

		public Seg(int l, int r, int g, int m, int num) {
			left = l;
			right = r;
			gcd = g;
			min = m;
			this.num = num;
		}
	}



	public static void main(String[] args) {
		//https://dmoj.ca/problem/ds3
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		a = new int[n];

		for (int i=0; i<n; i++){
			a[i]=sc.nextInt();
		}

		Build(0, n-1, 0);
		
		for (int i=0; i<m; i++){
			String s = sc.next();
			int index = sc.nextInt();
			int value = sc.nextInt();
			if (s.startsWith("C")){
				//when you try to update need to provide the beginning root and index and value
				//Change x to v
				C(0,n-1,0,index,value);
				C(0,n-1,0,index,value);
			} else if (s.startsWith("M")){
				//ouput minimum
				System.out.println(M(0,n-1,0,index,value));
			} else  if (s.startsWith("G")){
				//gcd
				System.out.println(M(0,n-1,0,index,value));
			} else  if (s.startsWith("Q")){
				//numbers equal to gcd
				System.out.println(Q(0,n-1,0,index,value));
			}
		}


	}

	public static int M(int left, int right,int index, int qleft, int qright){
		if (qright<left||qleft>right){
			return Integer.MAX_VALUE;
		} else if (qright>=right&&qleft<=left){
			return seg[index].min;
		} else {
			int mid = (left+right)/2;
			int l = M(left, mid, index*2+1, qleft, qright);
			int r = M(mid+1, right, index*2+2, qleft, qright);
			return Math.min(l,r);
		}

	}


	public static int G(int left, int right, int index, int qleft, int qright){
		if (qright<left||qleft>right){
			return Integer.MAX_VALUE;
		} else if (qright>=right&&qleft<=left){
			return seg[index].gcd;
		} else {
			int mid = (left+right)/2;
			int l = G(left, mid, index*2+1, qleft, qright);
			int r = G(mid+1, right, index*2+2, qleft, qright);
			return Math.max(l,r);
		}

	}


	public static int Q(int left, int right, int index, int qleft, int qright){
		if (qright<left||qleft>right){
			return 0;
		} else if (qright>=right&&qleft<=left){
			return seg[index].num;
		} else {
			int mid = (left+right)/2;
			int l = G(left, mid, index*2+1, qleft, qright);
			int r = G(mid+1, right, index*2+2, qleft, qright);
			return l+r;
		}

	}



	// two type of implementation of segment tree
	// 1. set the root to 0 --> index
	//    left equals to root*2+1    right root*2+2
	// 2. set the root to 1 --> index
	//    left equals to root*2      right root*2+1



	public static void C(int left, int right, int root, int x, int v) {
		seg[root] = new Seg(left, right, Integer.MAX_VALUE, Integer.MAX_VALUE, 0);
		if(left == right && left == x) {
			seg[root].min = v;
			seg[root].gcd = v;
			seg[root].num = 1;
		}
		else {
			int mid = (left+right) / 2;
			if(x <= mid) C(left, mid, 2*root+1, x, v);
			else C(mid+1, right, 2*root+2, x, v);
			seg[root].min = Math.min(seg[2 * root+1].min, seg[2 * root + 2].min);
			seg[root].gcd = GCD(seg[2*root+1].gcd, seg[2*root+2].gcd);
			if(seg[root].gcd == seg[2*root+1].gcd) seg[root].num += seg[2*root+2].num;
			if(seg[root].gcd == seg[2*root+2].gcd) seg[root].num += seg[2*root+1].num;
		}
	}



	public static void Build(int left, int right, int index){
		seg[index] = new Seg (left, right, Integer.MAX_VALUE, Integer.MAX_VALUE, 0);
		if (left==right){
			seg[index].min = a[left];
			seg[index].gcd = a[left];
			seg[index].num = 1;
		} else {
			int mid = (left+right)/2;
			Build(left, mid, index*2+1);
			Build(mid+1, right, index*2+2);
			seg[index].min = Math.min(seg[index*2+1].min, seg[index*2+2].min);
			seg[index].gcd = GCD(seg[index*2+1].gcd,seg[index*2+2].gcd);
			if(seg[index].gcd == seg[2*index].gcd){
				seg[index].num += seg[2*index].num;
			}
			if(seg[index].gcd == seg[2*index+1].gcd){
				seg[index].num += seg[2*index+1].num;
			}

		}


	}


	public static int GCD(int a, int b){
		int rem = a%b;
		if (rem==0) {
			return b;
		} else {
			return GCD(b, rem);
		}
	}
}
