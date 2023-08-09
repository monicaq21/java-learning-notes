package java_3_notes;

import java.util.Scanner;

import java_3_notes.Graph.Edge;

public class DFS_Practice {

	//data member
	//how many vertices
	//how many edges -- E
	//E edges
	
	int V;
	int E;
	Edge[] edge;
			//array
	class Edge{
		int bv; //begin vertice
		int ev; //end vertice
	}
	
	//constuctor
	//use to set data member's value
	public DFS_Practice(int v, int e){
		V=v;
		E=e;
		edge = new Edge[E];
		for (int i=0; i<E; i++){
			edge[i] = new Edge();
			//the graph is just a form but not really setting the values
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Kruskal
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for (int i=0; i<t; i++){
			int n = sc.nextInt();
			DFS_Practice g = new DFS_Practice(n,n-1); //3 vertices and 2 edges of a triangle - 2 aren't directly connected
			for (int l=0; l<n-1; l++){
				g.edge[l].bv=sc.nextInt();
				g.edge[l].ev=sc.nextInt();
			}
		
		}
		
		
		
		
		
	}

}
