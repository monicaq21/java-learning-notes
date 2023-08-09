package java_3_notes;

import java.util.Arrays;

public class Graph {

	//data member
	//how many vertices
	//how many edges -- E
	//E edges
	
	int V;
	int E;
	Edge[] edge;
			//array
	public class Edge{ //"public" allows the value to be accessed everywhere
		int bv; //begin vertice
		int ev; //end vertice
		int cost; //weight/cost of the edge
	}
	
	//constuctor
	//use to set data member's value
	public Graph(int v, int e){
		V=v;
		E=e;
		edge = new Edge[E];
		for (int i=0; i<E; i++){
			edge[i] = new Edge();
//			//the graph is just a form but not really setting the values
//			//fields in new arrays (edge) are initialized to null until values are added
		    //use for loop and not fill
		}
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Kruskal
		
		Graph g = new Graph(3,2); //3 vertices and 2 edges of a triangle - 2 aren't directly connected
		g.edge[0].bv=0;
		g.edge[0].ev=1;
		g.edge[0].cost=4;
		//the first edge goes from vertice 1 to 2, and cost 4 dollars
		
		g.edge[1].bv=0;
		g.edge[1].ev=2;
		g.edge[1].cost=10;
		//the second edge goes from vertice 1 to 3 (not directly connected), and cost 10 dollars
		
		for (int i=0; i<2; i++){
			System.out.println(g.edge[i].bv+" connecting to "+g.edge[i].ev+" costs "+g.edge[i].cost);
		}
		
		
		
	}

}
