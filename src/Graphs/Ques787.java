package Graphs;

/*There are n cities connected by some number of flights. You are given an array flights
 where flights[i] = [fromi, toi, pricei] indicates that there is a flight from city fromi to city
  toi with cost pricei.

You are also given three integers src, dst, and k, return the cheapest price from src to dst with at
 most k stops. If there is no such route, return -1.*/

import java.util.ArrayList;

import java.util.PriorityQueue;


public class Ques787 {
    private static class Edge{
        int source;
        int dest;
        int wt;
        public Edge(int s , int d , int w){
            this.source = s;
            this.dest = d;
            this.wt = w;
        }
    }

    private static class Pair implements Comparable<Pair>{
        int node;
        int price;
        Pair(int node , int price){
            this.node = node;
            this.price = price;
        }

        @Override
        public int compareTo(Pair p){
            return this.price - p.price;
        }
    }
    public static int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {

        ArrayList<Edge>[] graph = new ArrayList[n];
        for(int i = 0; i < n; i++){
            graph[i] = new ArrayList<>();
        }
        for(int[] fl : flights){
            int source = fl[0];
            int dest = fl[1];
            int price = fl[2];
            graph[source].add(new Edge(source , dest , price));
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int[] dist = new int[n];
        for(int i = 0; i < n; i++){
            dist[i] = i == src ? 0 : Integer.MAX_VALUE;
        }

        boolean[] visited = new boolean[n];
        pq.add(new Pair(src , 0));

        while(!pq.isEmpty()){
            Pair curr = pq.remove();
            if(curr.node == dst){
                return curr.price;
            }
            if(visited[curr.node] || curr.price> dist[curr.node] || k < 0){
                continue;
            }
            visited[curr.node] = true;
            for(Edge e : graph[curr.node]){
                pq.add(new Pair(e.dest , curr.price + e.wt));
            }
            k--;
        }
        return -1;
    }

    public static void main(String[] args) {
        int n = 4;
        int[][] flights = {{0,1,1},{0,2,5},{1,2,1},{2,3,1}};
        System.out.println(findCheapestPrice(n,flights,0,3,1));
    }
}
