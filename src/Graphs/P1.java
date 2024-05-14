package Graphs;
import java.util.ArrayList;

import static Graphs.Adjancency_List.*;

public class P1 {
    // Basics
    // BFS
    // DFS
    // Source to Destination

    public static void srcToDest(ArrayList<Edge>[] graph,int curr,boolean[] visited,String path,int tgt){
        // Modified DFS
        if(curr == (tgt)){
            System.out.println(path + " ");
            return;
        }
        visited[curr] = true;
        for (Edge e : graph[curr]){
            if(!visited[e.dest]){
                srcToDest(graph , e.dest, visited,path+ " " + e.dest , tgt);
            }
        }
    }

    public static void srcToDestBackTrack(ArrayList<Edge>[] graph,int curr,
                                          boolean[] visited,String path,int target){
        //O(V^V)
        if(curr == target){
            System.out.println(path + " ");
            return;
        }
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if(!visited[e.dest]){
                visited[curr] = true;
                srcToDestBackTrack(graph , e.dest,visited,path + " " + e.dest,target);
                visited[curr] = false;
            }
        }
    }
    public static void main(String[] args) {
        int V = 7;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        boolean[] visited = new boolean[V];
        String path = "0";
        srcToDestBackTrack(graph , 0 , visited ,path, 5);
    }
}
