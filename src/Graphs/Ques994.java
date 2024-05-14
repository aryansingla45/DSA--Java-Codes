package Graphs;

// 175 test case passed.

import java.util.LinkedList;
import java.util.Queue;

public class Ques994 {

    private static int[][] createGraph(){
        int[][] graph = {{2,1,1},{1,1,0},{0,1,1}};
        return graph;
    }
    private static int countFresh(int[][] graph){
        int fresh = 0;
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[0].length; j++) {
                if(graph[i][j] == 1){
                    fresh++;
                }
            }
        }
        return fresh;
    }



    private static int bfs(int[][] grid , int fresh){
        int countMinute = 0;
        Queue<int[]> q = new LinkedList<>();

        // Add coordinates of existing rotten Oranges into the Queue
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 2){
                    q.add(new int[]{i,j});
                }
            }
        }


        int[][] fourDirections = {{-1,0} , {1,0} , {0,-1} , {0,1}};


        while(!q.isEmpty() && fresh > 0){

            // fetching the current element from the queue
            for (int i = 0; i < q.size(); i++) {
                int[] curr = q.remove();
                int row = curr[0];
                int col = curr[1];
                // creating the new rows and new columns to check in all 4 directions.
                for(int[] dir: fourDirections){
                    int newRow = row + dir[0];
                    int newCol = col + dir[1];
                    // Checking that the new coordinates are in the bounds and the orange stored in those
                    // coordinates is fresh.
                    if(newRow >= 0 && newRow < grid.length && newCol >= 0 && newCol < grid[0].length
                            && grid[newRow][newCol] == 1){
                        grid[newRow][newCol] = 2;
                        q.add(new  int[] {newRow , newCol});
                        fresh--;
                    }
                }
            }
            // Increasing the count after every bfs layer.
            countMinute++;
        }

        if(fresh == 0){
            return countMinute;
        }
        else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int[][] graph = createGraph();
        int fresh = countFresh(graph);
        int ans = bfs(graph,fresh);
        System.out.println(ans);

    }
}
