/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class BFS_DFS {
    
    static void BFS(int[][] mat){
        int n=mat.length;
        int visited[]=new int[n];
        Queue<Integer> q=new LinkedList<>();
        q.offer(0);
        visited[0]=1;
        while(!q.isEmpty()){
            int vertex=q.poll();
            System.out.print(vertex+" ");
            for(int col=0;col<n;col++){
                if(mat[vertex][col]==1 && visited[col]==0){
                    q.offer(col);
                    visited[col]=1;
                }
            }
        }
    }
    
    static void DFS(int[][] mat,int source,int[] visited){
        visited[source]=1;
        System.out.print(source+" ");
        for(int i=0;i<mat.length;i++){
            if(mat[source][i]==1 && visited[i]==0)
                DFS(mat,i,visited);
        }
    }
    
	public static void main (String[] args) {
		int mat[][]={
		    {0,1,1,1,0,0},
		    {1,0,1,0,1,0},
		    {1,1,0,0,1,1},
		    {1,0,0,0,1,1},
		    {0,1,1,1,0,0},
		    {0,0,1,1,0,0}
		};
		System.out.println("BFS");
		BFS(mat);
		System.out.println();
		System.out.println("DFS");
		int visited[]=new int[6];
		DFS(mat,0,visited);
	}
}
