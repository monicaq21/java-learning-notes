package java_3_notes;

import java.util.LinkedList;
import java.util.Scanner;

public class mst {

	int V;
	int E;
	Edge[] edge;
	int[] parent;

	public class Edge {
		int bv;
		int ev;
	}

	public mst(int v, int e) {
		V = v;
		E = e;
		edge = new Edge[E];
		for (int i = 0; i < E; i++) {
			edge[i] = new Edge();
		}
		parent = new int[V];
		for (int i = 0; i < V; i++) {
			parent[i] = -1;
		}
	}

	// use function find to find out v's parent
	public int find(int v) {
		if (parent[v] == -1) {
			return v;
		} else {
			return parent[v]=find(parent[v]);
		}
	}

	public void union(int pb, int pe) {
		parent[pb] = pe;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Store all the edges into edge array
		// sort the edge array from least cost to greatest cost
		// choose edge one by one from edge array
		// if the edge you add into the minTree the
		// bv and ev has the different parent
		// add that edge in
		// otherwise discard that edge
		Scanner sc = new Scanner(System.in);
		int V = sc.nextInt();
		int E = sc.nextInt();
		mst graph = new mst(V, E);
		LinkedList<Integer> minTree = new LinkedList<Integer>();
		int count = 0;
		for (int i = 0; i < E; i++) {
			int bv = graph.edge[i].bv = sc.nextInt()-1;
			int ev = graph.edge[i].ev = sc.nextInt()-1;
			int pb = graph.find(bv);// (find out the parent of bv)
			int pe = graph.find(ev);
			// get bv and ev from edge
			// find out parent of bv and ev
			if (pb != pe) {
				minTree.add(i + 1);
				graph.union(pb, pe);
				count++;
				if (count == V - 1) {
					break;
				}
			}
			// if parent is not the same add into minTree
			// otherwise discard the edge
		}
		
		if (count == V - 1) {
			while (!minTree.isEmpty()) {
				System.out.println(minTree.pop());
			}
		} else {
			System.out.println("Disconnected Graph");
		}

	}

}