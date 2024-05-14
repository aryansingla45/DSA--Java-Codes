package Graphs;
import java.util.*;
public class P3_Dijkstra {
    // Dijkstra Algorithm
    // Bellman Ford Algorithm
    static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int s , int d , int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }
    private static void createDJK(ArrayList<Edge>[] graph){
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 3, 7));
        graph[1].add(new Edge(1, 2, 1));

        graph[2].add(new Edge(2, 4, 3));

        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));
    }

    public static class Pair implements Comparable<Pair>{
        int node;
        int dist;
        Pair(int n , int d){
            this.node = n;
            this.dist = d;
        }
        @Override
        public int compareTo(Pair p){
            return this.dist - p.dist;
        }
    }
    private static void dijkstra(ArrayList<Edge>[] graph , int src , int V){
        //O(E + E log V)
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int[] dist = new int[V];
        for (int i = 0; i < dist.length; i++) {
            if(i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }
        boolean[] visited = new boolean[V];
        pq.add(new Pair(0,0));
        while (!pq.isEmpty()){
            Pair curr = pq.remove();
            if(!visited[curr.node]){
                visited[curr.node] = true;
                for (int i = 0; i < graph[curr.node].size(); i++) {
                    Edge e = graph[curr.node].get(i);
                    int u = e.src;
                    int v = e.dest;
                    if(dist[u] + e.wt < dist[v]){
                        dist[v] = dist[u] + e.wt;
                        pq.add(new Pair(v , dist[v]));
                    }
                }
            }
        }
        for (int i = 0; i < V; i++) {
            System.out.print(dist[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createDJK(graph);
        dijkstra(graph,0, V);
        dijkstra(graph,1, V);
    }
}