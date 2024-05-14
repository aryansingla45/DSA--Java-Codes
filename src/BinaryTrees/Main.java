package BinaryTrees;
import java.util.LinkedList;
import java.util.Queue;
public class Main {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    public static class BinaryTree{
        static int idx = -1;
        public Node BuildTree(int[] nodes){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node temp = new Node(nodes[idx]);
            temp.left = BuildTree(nodes);
            temp.right = BuildTree(nodes);
            return temp;
        }
        public void preOrder(Node root){
            if(root == null){
                return;
            }
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
        public void inOrder(Node root){
            if(root == null){
                return;
            }
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
        public void postOrder(Node root){
            if(root == null){
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
        public void levelOrder(Node root){
            if(root == null){
                return;
            }
            int height = 0;
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
                Node current = q.poll();
                if(current == null){
                    System.out.println();
                    height++;
                    if(!q.isEmpty()){
                        q.add(current);
                    }
                }
                else{
                    System.out.print(current.data + " ");
                    if(current.left != null){
                        q.add(current.left);
                    }
                    if(current.right != null){
                        q.add(current.right);
                    }
                }
            }
        }
        public int countNodes(Node root){
            if(root == null) return 0;
            int leftNode = countNodes(root.left);
            int rightNode = countNodes(root.right);
            return leftNode+rightNode+1;
        }

        public int sumNodes(Node root){
            if(root == null) return 0;
            int leftSum = sumNodes(root.left);
            int rightSum = sumNodes(root.right);
            return leftSum + rightSum + root.data;
        }
        public int height(Node root){
            return 0;

        }
    }
    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree bt = new BinaryTree();
        Node root = bt.BuildTree(nodes);
//        bt.preOrder(root);
//        System.out.println();
//        bt.inOrder(root);
//        System.out.println();
//        bt.postOrder(root);
//        System.out.println();
//        bt.levelOrder(root);
        System.out.println(bt.countNodes(root));
        System.out.println(bt.sumNodes(root));
        System.out.println(bt);
    }
}
