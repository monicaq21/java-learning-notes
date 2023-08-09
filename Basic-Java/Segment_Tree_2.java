package java_3_notes;

import java.util.*;
import java.io.*;

public class Segment_Tree_2 {
	
	static int[] a;
	static int[] min;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int q = sc.nextInt();
		
		a = new int[n];
		int height = (int)Math.ceil(Math.log(n)/Math.log(2));
		int size = (int)Math.pow(2, height+1)-1;
		min = new int[size];
		
		for (int i=0; i<n; i++){
			a[i] = sc.nextInt();
		}
		
		Build(0,n-1,0);
		
		for (int i=0; i<q; i++){
			String s = sc.next();
			int b = sc.nextInt()-1;
			int c = sc.nextInt()-1;
			if (s.equals("q")){
				System.out.println(findMin(0,n-1,b,c,0));
			} else {
				a[b]=c;
				UpdateMin(0,n-1,b,c,0);
			}
		}
	}
	
	public static void UpdateMin(int left, int right, int diffIndex, int value, int index){
		if (left==right){
			min[index] = a[left];
		} else {
			int mid = (left+right)/2;
			if (diffIndex<=mid){
				UpdateMin(left,mid,diffIndex,value,index*2+1);
				if (value<min[index]){
					min[index] = value;
				}
			} else if (diffIndex<mid){
				UpdateMin(mid+1,right,diffIndex,value,index*2+2);
				if (value<min[index]){
					min[index] = value;
				}
			}
		}
	}
	
	public static int findMin(int left, int right, int qleft, int qright, int index){
		if (qright<left||qleft>right){
			return Integer.MAX_VALUE;
		} else if (qright>=right&&qleft<=left){
			return min[index];
		} else {
			int mid = (left+right)/2;
			return Math.min(findMin(left,mid,qleft,qright,index*2+1), 
					findMin(mid+1,right,qleft,qright,index*2+2));
		}
	}
	
	public static void Build(int left, int right, int index){
		if (left==right){
			min[index] = a[left];
		} else {
			int mid = (left+right)/2;
			Build(left,mid,index*2+1);
			Build(mid+1,right,index*2+2);
			min[index] = Math.min(min[index*2+1], min[index*2+2]);
		}
	}
}
