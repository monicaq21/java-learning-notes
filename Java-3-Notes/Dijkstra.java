package java_3_notes;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Dijkstra {
	
	int V;
	int E;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int v = 8;
		int e = 9;
		int[][] matrix = new int[e][e];
		int[] distances = new int[v];
//		boolean[] been = new int[v];
		Arrays.fill(distances, Integer.MAX_VALUE);
		distances[1] = 0;
		
		PriorityQueue <Integer> queue = new PriorityQueue <Integer>();
		for (int i=0; i<e; i++){
			Arrays.fill(matrix[i], Integer.MAX_VALUE);
			matrix[i][i]=0;
		}
		for (int i=0; i<e; i++){
			int bv = sc.nextInt()-1;
			int ev = sc.nextInt()-1;
			int weight = sc.nextInt();
			matrix[bv][ev]=weight;
			matrix[ev][bv]=weight;
			if (bv==1){
				queue.add(ev);
			} else if (ev==1){
				queue.add(bv);
			}
		}
		
		
		while (!queue.isEmpty()){
			
		}
		
		System.out.println(distances[6]);
		
		//input:
		//v=8, e=9
		//2 1 4
		//3 4 3
		//4 6 1
		//2 3 5
		//6 3 6
		//6 8 2
		//6 5 1
		//7 8 4
		//2 7 150
		//find shortest path from 2 to 7
		//should be 17
		 
		
		//shortest path
		//similar to BFS (with weights on the edges)
		//the value of the neighbor is the current point's value plus the weight to that neighbor
		//in a queue, we use the priority queue because we find the one with the least weight first
		//shortest path is same as min cost to a destination
		//because it's not necessarily the shortest path, but is the least weighted path
		//kruskal is a tree, dijkstra is a path
		
		
		
	}

}
