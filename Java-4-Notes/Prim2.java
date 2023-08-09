package individual_lessons;

import java.util.*;
import java.lang.*;
import java.io.*;
 
class Solution
{
    // Number of vertices in the graph
    private static final int V=5;
 
    // A utility function to find the vertex with minimum key
    // value, from the set of vertices not yet included in MST
    int minKey(int key[], boolean mstSet[])
    {
        // Initialize min value
        int min = Integer.MAX_VALUE, min_index=-1;
 
        for (int v = 0; v < V; v++)
            if (mstSet[v] == false && key[v] < min)
            {
                min = key[v];
                min_index = v;
            }
 
        return min_index;
    }
 
    // A utility function to print the constructed MST stored in
    // parent[]
    void printMST(int parent[], int graph[][])
    {
        System.out.println("Edge   Weight");
        for (int i = 1; i < V; i++)
            System.out.println(parent[i]+" - "+ i+"    "+
                               graph[i][parent[i]]);
    }
 
    // Function to construct and print MST for a graph represented
    //  using adjacency matrix representation
    void primMST(int graph[][])
    {
        // Array to store constructed MST
        // key
        // parent
        // mstSet
      
// Edge   Weight
// 0 - 1    2
// 1 - 2    3
// 0 - 3    6
// 1 - 4    5
      int[] parent = new int[V];
      boolean[] mstSet = new boolean[V];
      int[] key = new int[V];
      Arrays.fill(key,Integer.MAX_VALUE);
      key[0] = 0;
      parent[0] = -1;
      
      for (int i=0; i<V-1; i++){
        //choose min from all neighbors
        int k = minKey(key,mstSet);
        mstSet[k] = true;
        
        for (int l=0; l<V; l++){
          if (graph[k][l]!=0&&!mstSet[l]&&key[l]>graph[k][l]){
            parent[l] = k;
            
            //already change all neighbors' values.
            key[l] = graph[k][l];
          }
          
        }
        
      }
      printMST(parent,graph);
      
    }
 
    public static void main (String[] args)
    {
        /* Let us create the following graph
           2    3
        (0)--(1)--(2)
        |    / \   |
        6| 8/   \5 |7
        | /      \ |
        (3)-------(4)
             9          */
        Solution t = new Solution();
        int graph[][] = new int[][] {{0, 2, 0, 6, 0},
                                    {2, 0, 3, 8, 5},
                                    {0, 3, 0, 0, 7},
                                    {6, 8, 0, 0, 9},
                                    {0, 5, 7, 9, 0},
                                   };
 
        // Print the solution
        t.primMST(graph);
    }
}