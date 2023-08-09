package individual_lessons;

import java.io.*;
import java.util.*;

public class Prim {
	
	static int V;
	static int E;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// Prim
		// https://www.geeksforgeeks.org/greedy-algorithms-set-5-prims-minimum-spanning-tree-mst-2/
		Scanner sc = new Scanner(System.in);
		
		V = sc.nextInt(); 
		E = sc.nextInt();
		int[][] map = new int[V][V];

		for (int i=0; i<E; i++){
			int bv = sc.nextInt()-1;
			int ev = sc.nextInt()-1;
			int cost = sc.nextInt();
			map[bv][ev] = cost;
			map[ev][bv] = cost;
		}

		int[] key = new int[V];
		Arrays.fill(key,Integer.MAX_VALUE);
		key[0] = 0;
		int[] parent = new int[V];
		parent[0] = -1;
		boolean[] mstSet = new boolean[V];

		for (int i=0; i<V-1; i++) {
			int nextV = minV(mstSet, key);

			//find out all nexV's neighbor and update neighbor's key

			//should go to map array to check row nextV
			//if nextV is not equals to 0 then it has edge
			//compare key array and see if newly added nextV vertex bring
			//in a smaller edges

			//update key table by nextV
			mstSet[nextV] = true;

			for (int j=0; j<V; j++) {
				if (key[j] > map[nextV][j]) {
					parent[j] = nextV;
					key[j] = map[nextV][j];
				}
			}
		}
		// Based one step array and mstSet to find out next vertex
		// to add in

		//step value is the minimum and mstSet value is false
		//this node will be picked 

		//     0   then  you should know all 0's neighbor
		//     find out who is the smallest edges
		//     for example 0 and 1 form the smallest edges at this time
		//     we add 1 in
		//       01  12
		//       mstset  0   1    2   8

		//       07-8   17-11 23-7 25-4 
		//       not in mst yet  3 4 5 6 7


	}

	public static int minV(boolean[] mstSet, int key[]) {
		int min = Integer.MAX_VALUE;
		int index = -1;
		for (int i=0; i<V; i++){
			//only available vertices have values
			//not approachable: Integer.MAX_VALUE;
			if (mstSet[i]==false && key[i]<min){
				min = key[i];
				index = i;
			}
		}
		return index;

	}              
	// 0 1 4
	// 0 7 8
	// 1 7 11
	// 1 2 8
	// 2 8 2
	// 7 8 7
	// 7 6 1
	// 8 6 6
	// 2 5 4
	// 2 3 7
	// 3 4 9
	// 3 5 14
	// 4 5 10
	// 5 6 2
}






