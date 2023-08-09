package java_3_notes;

import java.util.Arrays;
import java.util.Scanner;

public class graph3 {
	
	int V;
	int E;
	Edge[] edge;
	int[] parent;
	Edge[] mst;
	
	public class Edge implements Comparable <Edge>{
		int bv;
		int ev;
		int cost;
		@Override
		public int compareTo(Edge o) {
			// TODO Auto-generated method stub
			if (this.cost-o.cost>0){
				return 1;
			} else if (this.cost-o.cost==0){
				return 0;
			} else {
				return -1;
			}
			//the if else statement is only if it is double. cannot use 0.01 or something
			//if it is integer, simply do: <return this.cost-o.cost;>
		}
	}
	
	public graph3 (int v, int e){
		V=v;
		E=e;
		edge = new Edge[E];
		for (int i=0; i<E; i++){
			edge[i]=new Edge();
		}
		parent = new int[V];
		for (int i=0; i<V; i++){
			parent[i]=-1;
		}
		mst = new Edge[V-1];
		for (int i=0; i<V-1; i++){
			mst[i]=new Edge();
		}
	}
	
	public int find(int i){
		if (parent[i]==-1){
			return i;
		} else {
			return find(parent[i]);
		}
	}
	
	public void union(int bp, int ep){
		parent[bp] = ep;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		
		graph3 graph = new graph3(4,6); 
		
		//sort the class by the cost and output
		for (int i=0; i<6; i++){
			graph.edge[i].bv=sc.nextInt();
			graph.edge[i].ev=sc.nextInt();
			graph.edge[i].cost=sc.nextInt();
		}
		
		Arrays.sort(graph.edge);
		
		for (int i=0; i<6; i++){
			System.out.print(graph.edge[i].bv+" ");
			System.out.print(graph.edge[i].ev+" ");
			System.out.println(graph.edge[i].cost);
		}
		
//		1 5 6
//		1 4 5
//		5 4 7
//		1 3 3
//		3 4 4
//		1 2 1
//		2 3 2
		
		
		//find the bv and ev of mst
		int j = 0;
		for (int i=0; i<6; i++){
			int bv = graph.edge[i].bv;
			int ev = graph.edge[i].ev;
			int cost = graph.edge[i].cost;
			
			int bp = graph.find(bv);
			int ep = graph.find(ev);
			if (bp!=ep){
				graph.mst[j].bv = bp;
				graph.mst[j].ev = ep;
				j++;
				graph.union(bp, ep);
			}
		}
		
		for (int i=0; i<j; i++){
			System.out.print(graph.mst[i].bv+" ");
			System.out.println(graph.mst[i].ev+" ");
		}
	}

}
