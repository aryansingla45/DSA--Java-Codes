package Graphs;

/*There are a total of numCourses courses you have to take, labeled from 0 to numCourses - 1.
You are given an array prerequisites where prerequisites[i] = [ai, bi] indicates that you must take
course bi first if you want to take course ai.
For example, the pair [0, 1], indicates that to take course 0 you have to first take course 1.
Return true if you can finish all courses. Otherwise, return false.*/

import java.util.ArrayList;

public class Ques207 {
    private static boolean canFinish(int numCourses , int[][] prerequisites){
        ArrayList<Integer>[] graph = new ArrayList[numCourses];
        for(int i = 0; i < numCourses; i++){
            graph[i] = new ArrayList<>();
        }
        for(int[] pre : prerequisites){
            int course = pre[0];
            int prereq = pre[1];
            graph[course].add(prereq);
        }
        boolean[] visited = new boolean[numCourses];
        boolean[] stack = new boolean[numCourses];
        for(int i = 0; i < numCourses; i++){
            if(!visited[i]){
                if(dfs(graph , visited , stack , i)){
                    return false; // Cycle Detected
                }
            }
        }
        return true;
    }
    private static boolean dfs(ArrayList<Integer>[] graph,boolean[] visited,boolean[] stack,
                        int curr){
        visited[curr] = true;
        stack[curr] = true;
        for(int i = 0; i < graph[curr].size();i++){
            int e = graph[curr].get(i);
            if(stack[e]){
                return true;
            } else if(!visited[e] && dfs(graph , visited , stack , e)){
                return true;
            }
        }
        stack[curr] = false;
        return false;
    }
    public static void main(String[] args) {
        int[][] testcase = {{0,1},{1,0}};
        int courses = 2;
        System.out.println(canFinish(courses,testcase));
    }
}
