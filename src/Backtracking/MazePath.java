package Backtracking;

public class MazePath {
    public static void main(String[] args) {
        int rows = 3;
        int col = 3;
        int count = 0;
        count = maze(1,1,rows,col);
        System.out.println(count);
        print(1,1,rows,col , " ");

    }

    private static int maze(int sr, int sc, int er, int ec) {
        if(sr > er || sc > ec) return 0;
        if(sr == er && sc == ec) return 1;
        int downWay = maze(sr+1 , sc , er , ec);
        int rightWay = maze(sr , sc+1 , er , ec);
        return downWay + rightWay;
    }

    private static void print(int sr, int sc, int er, int ec , String s) {
        if(sr > er || sc > ec) return;
        if(sr == er && sc == ec){
            System.out.println(s);
            return;
        }
        print(sr+1 , sc , er , ec , s+"D");
        print(sr , sc+1 , er , ec , s +"R");
    }
}
