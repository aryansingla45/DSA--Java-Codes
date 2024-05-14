package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class revision {

    private static class Edge{
        int src;
        int dest;
        Edge(int src , int dest){
            this.src = src;
            this.dest = dest;
        }
    }

    private static void createG(ArrayList<Edge>[] graph){
        for(int i = 0; i < graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));
        graph[0].add(new Edge(0,3));
        graph[1].add(new Edge(1,1));
        graph[1].add(new Edge(1,4));
        graph[1].add(new Edge(1,6));
        graph[2].add(new Edge(2,3));
        graph[2].add(new Edge(2,5));
        graph[2].add(new Edge(2,6));
        graph[3].add(new Edge(3,5));
        graph[3].add(new Edge(3,1));
        graph[4].add(new Edge(4,6));
        graph[4].add(new Edge(4,3));
    }

    private static void bfs(ArrayList<Edge>[] graph , boolean[] visited , int start){
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        while(!q.isEmpty()){
            int curr = q.remove();
            if(!visited[curr]){
                System.out.print(curr + " ");
                visited[curr] = true;
                for (int i = 0; i < graph[curr].size(); i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
             }
        }
    }

    private static void dfs(ArrayList<Edge>[] graph , boolean[] visited , int start){
        System.out.print(start + " ");
        visited[start] = true;
        for (int i = 0; i < graph[start].size(); i++){
            Edge e = graph[start].get(i);
            if(!visited[e.dest]){
                dfs(graph,visited, e.dest);
            }
        }
    }
    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createG(graph);

    }
}
