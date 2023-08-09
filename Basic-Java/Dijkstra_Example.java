package java_3_notes;
import java.util.*;
import java.io.*;
public class Dijkstra_Example{

	public static class Node implements Comparable<Node>{
		int v;
		int step;
		public Node(int v,int step){
			this.v = v;
			this.step = step;
		}

		@Override 
		public int compareTo(Node o) { 
			// TODO Auto-generated method stub
			if (this.step-o.step>0){
				return 1;
			} else if (this.step-o.step<0){
				return -1;
			} else {
				return 0;
			}
		}
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		//https://dmoj.ca/problem/sssp

		int n = sc.nextInt();
		int m = sc.nextInt();
		PriorityQueue <Node> queue = new PriorityQueue <Node>();

		int[][] matrix = new int[n][n];
		int[] steps = new int[n];
		Arrays.fill(steps,Integer.MAX_VALUE);
		for (int i=0; i<m; i++){
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			int cost = sc.nextInt();
			matrix[a][b] = cost;
			matrix[b][a] = cost;
		}

		//Node mean the first vertice


		steps[0] = 0;
		//vertice  step value
		queue.add(new Node(0, steps[0]));

		while (!queue.isEmpty()){
			Node cur = queue.poll();
			int v = cur.v;
			int step = cur.step;
			for (int i=0; i<m; i++){
				if (matrix[v][i]!=0&&
						step+matrix[v][i]<steps[i]){
					steps[i] = step+matrix[v][i];
					queue.add(new Node(i,steps[i]));
				}
			}
		}
		for (int i=0; i<n; i++){
			System.out.println(steps[i]);
		}



	}
}