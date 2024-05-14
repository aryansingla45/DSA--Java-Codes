package LinkedList;

public class Ques141_142 {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }

    public static boolean hasCycle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null){
            if(slow == null) return false;
            slow = slow.next;
            if(fast.next == null) return false;
            fast = fast.next.next;
            if(slow == fast){return true;}
        }
        return false;
    }

    public static ListNode detectCycle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                break;
            }
        }
        ListNode temp = head;
        while (temp != null){
            temp = temp.next;
            slow = slow.next;
            if(temp == slow){
                return slow;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        // Solved
        
    }
}
