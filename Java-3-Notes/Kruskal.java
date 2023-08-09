package java_3_notes;

import java.util.Arrays;

public class Kruskal {
	
	int V;
	int E;
	Edge[] edge;
	int[] parent;
	public class Edge implements Comparable <Edge>{
		int bv;
		int ev;
		int cost;
		@Override
		public int compareTo(Edge o) {
			// TODO Auto-generated method stub
			if (cost-o.cost>0){
				return 1;
			} else if (cost-o.cost<0){
				return -1;
			} else{
				return 0;
			}
		}
	}
	public Kruskal(int v, int e){
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
	}
	
	public int find(int i){
		if (parent[i]==-1){
			return i;
		} else{
			return find(parent[i]);
		}
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int v = 4;
		int e = 6;
		
		
		
	}

}
