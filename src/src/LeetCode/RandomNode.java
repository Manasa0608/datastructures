package LeetCode;

import java.util.ArrayList;

public class RandomNode {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    class Solution {
        ArrayList<ListNode> arr = new ArrayList<>();

        public Solution(ListNode head) {
           while(head !=null){
               arr.add(head);
               head= head.next;
           }
        }


        public int getRandom(int maximum) {
           int index =  (int)(Math.random() * arr.size());
           return arr.get(index).val;
        }
    }
}
