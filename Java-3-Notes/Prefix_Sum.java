package java_3_notes;

import java.util.*;

public class Prefix_Sum {

	static int[] n;
	static int[] sum;
	static int L;
	static int R;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);
		    
		    n = new int[10];
		    sum = new int[10];
		    
		    int L = 2;
		    int R = 6;
		    
		    for (int i=0; i<10; i++){
		      n[i] = sc.nextInt();
		     
		    }
		    
		    for (int i=1; i<10; i++){
		      if (i==0) {
		        sum[i] = n[i];
		      } else {
		        sum[i] = sum[i-1]+n[i];
		      }
		    }
		        
		    System.out.println(sum[R]-sum[L-1]);
		    
		    
		      
		    
		    int difference = 5 - n[0];
		    updateSum(0, difference);
		    System.out.println(sum[R]-sum[L-1]);
		    
		    updateSum(1, 7);
		    
		    
		  }
		  
		  
		  public static void buildSum() {
		    for (int i=1; i<10; i++){
		      if (i==0) {
		        sum[i] = n[i];
		      } else {
		        sum[i] = sum[i-1]+n[i];
		      }
		    }
		        
		    System.out.println(sum[R]-sum[L-1]);
		    
		  }
		  
		  public static void updateSum(int index, int difference) {
		    for (int i=index; i<10; i++){
		      sum[i] += difference;
		    }
	}

}
