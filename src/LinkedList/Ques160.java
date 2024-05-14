package LinkedList;
/*Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect.
If the two linked lists have no intersection at all, return null.*/

public class Ques160 {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){this.val = val;}
    }
    public static void display(ListNode head){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static ListNode intersect(ListNode headA , ListNode headB){
        int m = 0;
        int n = 0;
        ListNode tempA = headA;
        ListNode tempB = headB;
        while(tempA != null) {m++; tempA = tempA.next;}
        while (tempB != null){n++; tempB = tempB.next;}
        tempA = headA;
        tempB = headB;
        if(m>n){
            for (int i = 1; i <= m-n; i++) {
                tempA = tempA.next;
            }
        }else{
            for (int i = 1; i <= n-m; i++) {
                tempB = tempB.next;
            }
        }
        while(tempA != null && tempB != null){
            if(tempA.val == tempB.val){
                return tempA;
            }
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return null;
    }
    public static void main(String[] args) {
        ListNode n1 = new ListNode(5);
        ListNode n2 = new ListNode(6);
        ListNode n3 = new ListNode(7);
        ListNode n4 = new ListNode(8);
        ListNode n5 = new ListNode(9);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        display(n1);
        ListNode n6 = new ListNode(1);
        ListNode n7 = new ListNode(2);
        ListNode n8 = new ListNode(3);
        ListNode n9 = new ListNode(10);
        ListNode n10 = new ListNode(4);
        ListNode n11 = new ListNode(11);
        n6.next = n7;
        n7.next = n8;
        n8.next = n9;
        n9.next = n10;
        n10.next = n11;
        display(n6);
        ListNode ans = intersect(n1 , n6);
        display(ans);
        if (ans == null) throw new AssertionError();
        System.out.println(ans.val);

        //follow up complete.
    }
}
