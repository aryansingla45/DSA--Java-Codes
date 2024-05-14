package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Adjancency_List {
    static class Edge{
        int src;
        int dest;
        Edge(int src , int dest){
            this.src = src;
            this.dest = dest;
        }
    }
// Undirected Unweighted Graph
    public static void createGraph(ArrayList<Edge>[] graph){
        for (int i = 0; i < graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));

        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,5));

        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,5));

        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,4));
        graph[5].add(new Edge(5,6));

        graph[6].add(new Edge(6,5));
    }

    //Undirected Weighted Graph
    // We just have to add a new variable weight in our Edge class.
//    public static void createGraph2(ArrayList<Edge>[] graph){
//
//    }

    public static void BreadthFirstSearch(ArrayList<Edge>[] graph , int V , boolean[] visited , int start){
        // Go to immediate neighbour first.
        //O(V+E)
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        while (!q.isEmpty()){
            int curr = q.remove();
            if(!visited[curr]){
                System.out.print(curr + " ");
                visited[curr] = true;
                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    public static void depthFirstSearch(ArrayList<Edge>[] graph , int curr , boolean[] visited){
        // keep going to the 1st neighbour.
        System.out.print(curr + " ");
        visited[curr] = true;
        for (int i = 0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!visited[e.dest]){
                depthFirstSearch(graph , e.dest , visited);
            }
        }
    }
    public static void main(String[] args) {
        int V = 7;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        boolean[] visited = new boolean[V];
//        for (int i = 0; i < V; i++) {
//            if(visited[i] == false){
//                BreadthFirstSearch(graph,V , visited , i);
//            }
//        }
        depthFirstSearch(graph,0,visited);
    }
}