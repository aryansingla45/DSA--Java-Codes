package Graphs;
import java.util.ArrayList;
import java.util.Stack;
import static Graphs.Adjancency_List.*;
public class P2 {
    // Cycle Detection and Topological Sort
    private static void createGraph1(ArrayList<Edge> graph[]) {
        // For isCycle
        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));
        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));
        graph[4].add(new Edge(4, 3));
    }
    static void createGraph2(ArrayList<Edge> graph[]) {
        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 1));
        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));
        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }


    private static void topSortUtility(ArrayList<Edge>[] graph, boolean[] visited , int curr ,
                                Stack<Integer> st){
        visited[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if(!visited[e.dest]){
                topSortUtility(graph , visited , e.dest, st);
            }
        }
        st.push(curr);
    }
    private static void topSort(ArrayList<Edge>[] graph){
        boolean[] visited = new boolean[graph.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < graph.length; i++) {
            if(!visited[i]){
                topSortUtility(graph,visited,i,stack);
            }
        }

        while (!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }

    }

    private static boolean isCycleDirectedUtility(ArrayList<Edge>[] graph,boolean[] visited , int curr , boolean[] rec){
        // Directed Graph
        visited[curr] = true;
        rec[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(rec[e.dest] == true){
                return true;
            }else if(!visited[e.dest] && isCycleDirectedUtility(graph,visited, e.dest, rec)){
                return true;
            }
        }
        rec[curr] = false;
        return false;
    }
    private static boolean isCycleDirected(ArrayList<Edge>[] graph){
        boolean[] visited = new boolean[graph.length];
        boolean[] recStack = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if(!visited[i]){
                if(isCycleDirectedUtility(graph,visited,i,recStack)){
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isCycleUndirected(ArrayList<Edge>[] graph){
        boolean[] visited = new boolean[graph.length];
        for(int i=0; i<graph.length; i++) {
            if(isCycleUndirectedUtility(graph,visited,i,-1)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isCycleUndirectedUtility(ArrayList<Edge>[] graph, boolean[] vis,int
                                                    curr , int parent){
        vis[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if(vis[e.dest] && e.dest != parent){
                return true;
            } else if (!vis[e.dest] && isCycleUndirectedUtility(graph,vis,e.dest,curr)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph2(graph);
        System.out.println(isCycleUndirected(graph));
        System.out.println(isCycleDirected(graph));
        topSort(graph);
    }
}
