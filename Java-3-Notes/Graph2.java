package java_3_notes;

import java.util.Arrays;
import java.util.Hashtable;
import java_3_notes.Graph.Edge;

public class Graph2 {
	int V;
	int E;
	Edge[] edge;
	
	int[] parent; //array to find the root
	
	
	//(comparable) interface
	//interface is just a definition/template for method
	//the method is compareTo:
	//the returns are: negative is less than, zero is equal, positive is greater than
	//contains the method: gives the purpose
	//tells java how to compare/sort the array that we've created (Graph2.Edge)
	public class Edge implements Comparable<Edge>{ //type this and click on the red line and java will create the int
												   //add <Edge> to the end
		int bv;
		int ev;
		double cost;
		@Override //Override means that I do my own method of coding. It is just a symbol
		public int compareTo(Edge o) { //it is Edge o in the bracket, not object o
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
	
	
	public Graph2 (int v, int e){
		V=v;
		E=e;
		edge = new Edge[E];
		for (int i=0; i<E; i++){
			edge[i] = new Edge();
		}
		parent = new int[V]; //you can set them all to -1 to say that it is the root
		//initial value can be -1 or himself (parent[i]=i)
		for (int i=0; i<V; i++){
			parent[i]=-1;
		}
	}
	
	//disjoint set
	
	public int find(int i){
		if (parent[i]==-1){
			return i; //it is the root
		} else{ //not the root
			return find(parent[i]); //finding the root of parent[i], and go all the way up to the real root
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//practice
		//kruskal is the minimum cost for all the points to be connected
		//convert the point names to integers (A=0, B=1, C=2, etc.) with hashtable
		
		//kruskal is:
		//starting from the edge with the least weight/cost, connect the two vertices
		//if the next edge creates a loop, don't do it and go to the next one
		
		//fields in new arrays (edge) are initialized to null until values are added
		
		Hashtable <Character, Integer> ht = new Hashtable <Character, Integer>();
		ht.put('A', 0);
		ht.put('B', 1);
		ht.put('C', 2);
		ht.put('D', 3);
		System.out.println(ht.get('A'));
		

		int v = 4;
		int e = 6;
		Graph2 g = new Graph2(v,e); //four vertices and 6 edges
		g.edge[0].bv=0;
		g.edge[0].ev=1;
		g.edge[0].cost=1;
		
		g.edge[1].bv=1;
		g.edge[1].ev=3;
		g.edge[1].cost=5;
		
		g.edge[2].bv=2;
		g.edge[2].ev=3;
		g.edge[2].cost=6;
		
		g.edge[3].bv=0;
		g.edge[3].ev=2;
		g.edge[3].cost=2;
		
		g.edge[4].bv=1;
		g.edge[4].ev=2;
		g.edge[4].cost=3;
		
		g.edge[5].bv=0;
		g.edge[5].ev=3;
		g.edge[5].cost=4;
		
		Arrays.sort(g.edge);
		//giving java the method of how to compare
		
		for (int i=0; i<e; i++){
			System.out.print(g.edge[i].bv+" ");
			System.out.print(g.edge[i].ev+" ");
			System.out.print(g.edge[i].cost);
			System.out.println();
		}
		
		
		
		
		
		
		
	}

}
