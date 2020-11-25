package LinkedList;

import java.util.LinkedList;

public class InsertionSort {
    EvenOdd.Node head;

    static class ListNode {
        int val;
        ListNode next;

        public ListNode() {
        }

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static LinkedList<ListNode> insertionSortList(ListNode head) {
        LinkedList<ListNode> pseudoHead = new LinkedList<>();
        ListNode curr = head;

        while (curr != null) {
            ListNode t = curr;
            if (pseudoHead.isEmpty()) {
                pseudoHead.add(curr);
            } else {
                for (int i = 0; i < pseudoHead.size(); i++) {
                    if (pseudoHead.get(i).val > curr.val) {
                        ListNode temp = curr;
                        curr = pseudoHead.get(i);
                        pseudoHead.add(temp);
                    }
                }
            }
            curr = t.next;
        }
        return pseudoHead;
    }


    public static void main(String[] args) {
        ListNode l = new ListNode(4);
        l.next = new ListNode(2);
        l.next.next = new ListNode(1);
        l.next.next.next = new ListNode(3);
        System.out.println("Initially ");
        print(l);
        insertionSortList(l);
        System.out.println("After sorting ");
        LinkedList<ListNode> temporary = insertionSortList(l);
        for (int i = 0; i < temporary.size(); i++) {
            System.out.print(temporary.get(i).val+" ");
        }
    }

    private static void print(ListNode l) {
        while (l != null) {
            System.out.print(l.val + " ");
            l = l.next;
        }
    }
}
