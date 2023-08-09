package java_3_notes;

import java.util.LinkedList;
import java.util.Scanner;

public class BFS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		int t = sc.nextInt();
		
		for (int i=0; i<t; i++){
			boolean yes = false;
			int count = 0;
			int n = sc.nextInt();
			int m = sc.nextInt();
			LinkedList <Integer> x = new LinkedList <Integer>();
			LinkedList <Integer> y = new LinkedList <Integer>();
			boolean[][] a = new boolean[n][m];
			boolean[][] been = new boolean[n][m];
			for (int l=0; l<n; l++){
				for (int q=0; q<m; q++){
					int p = sc.nextInt();
					if (p==0){
						a[l][q]=false;
					} else{
						a[l][q]=true;
						x.add(l);
						y.add(q);
					}
					
				}
			}
			for (int k=0; k<x.size()-1; k++){
				x.remove(x.size()-1-k);
				y.remove(x.size()-1-k);
			}
			while (!x.isEmpty()){
				int xx=x.poll();
				int yy=y.poll();
				been[xx][yy]=true;
				
				//in bound, not been, is 1
				if (xx+1<n){
					if (!been[xx+1][yy] && a[xx+1][yy]){
						been[xx+1][yy]=true;
						x.add(xx+1);
						y.add(yy+1);
						yes=true;
					}
				}
				
			}
		}
		
		
		
		
		
		
	}

}
