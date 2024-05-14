package BinaryTrees;

import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

public class try2 {

    static class Node{
        int val;
        Node left;
        Node right;

        Node(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    static class TreeInfo{
        int ht;
        int diam;
        TreeInfo(int ht , int diam){
            this.ht =ht;
            this.diam = diam;
        }
    }

    public static class BTree{
        static int idx = -1;
        public static Node buildTree(int[] nodes){
            idx++;
            if(nodes[idx] == -1) return null;
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }

        public static void levelOrder(Node root){
            Queue<Node> visited = new LinkedList<>();
            if(root == null) return;

            visited.add(root);
            visited.add(null);

            while(!visited.isEmpty()){
                Node curr = visited.remove();
                if(curr == null){
                    System.out.println();
                    if(visited.isEmpty()) break;
                    else visited.add(null);
                } else {
                    System.out.print(curr.val+ " ");
                    if (curr.left != null) visited.add(curr.left);
                    if (curr.right != null) visited.add(curr.right);
                }
            }

        }

        public static int levelOrderSum(Node root , int level){
            Queue<Node> visited = new LinkedList<>();
            if(root == null) return 0;
            visited.add(root);
            visited.add(null);
            int l = 1;
            int sum = 0; 
            while(!visited.isEmpty()){
                Node curr = visited.remove();
                if(curr == null){
                    l++;
                    if(visited.isEmpty()) break;
                    else visited.add(null);
                } else {
                    if (l == level){
                        sum += curr.val;
                    }
                    if (curr.left != null) visited.add(curr.left);
                    if (curr.right != null) visited.add(curr.right);
                }
            }
            return sum;

        }

        public static void preOrder(Node root){
            if(root == null) return;
            System.out.println(root.val);
            preOrder(root.left);
            preOrder(root.right);
        }

        public static void inOrder(Node root){
            if(root == null) return;
            inOrder(root.left);
            System.out.println(root.val);
            inOrder(root.right);
        }

        public static int nodeCount(Node root){
            if(root == null) return 0;
            int x = nodeCount(root.left);
            int y = nodeCount(root.right);
            return x+y+1;
        }

        public static int height(Node root){
            if(root == null) return  0;
            int x = height(root.left);
            int y = height(root.right);
            return Math.max(x+1,y+1);
        }

        public static int diameter(Node root){
            if (root == null) return  0;
            int leftD = diameter(root.left);
            int rightD = diameter(root.right);
            int diaTRoot = height(root.left) + height(root.right) + 1;
            return  Math.max(diaTRoot , Math.max(leftD , rightD));
        }

        public static TreeInfo dia2(Node root){
            if(root == null){
                return  new TreeInfo(0,0);
            }

            TreeInfo left  = dia2(root.left);
            TreeInfo right = dia2(root.right);

            int myHt = Math.max(left.ht+1 , right.ht+1);

            int dia1 = left.diam;
            int dia2 = right.diam;
            int dia3 = left.ht + right.ht + 1;

            int myDia = Math.max(dia1 , Math.max(dia3 , dia2));

            TreeInfo myInfo = new TreeInfo(myHt,myDia);
            return myInfo;

        }



    }
    public static void main(String[] args) {

        int[] nodes = {5,1,4,-1,-1,3,6};
        BTree bt = new BTree();
        Node root = bt.buildTree(nodes);
        bt.inOrder(root);
        System.out.println(BTree.levelOrderSum(root,4));
        List<List<Integer>> result = new ArrayList<>();
        int idx = 1;
        




    }
}
