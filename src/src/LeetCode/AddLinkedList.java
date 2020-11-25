package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class AddLinkedList {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        public ListNode() {

        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        List<Integer> num1 = new ArrayList<>(), num2 = new ArrayList<>();
        int size1 = 0;
        int size2 = 0;
        while (l1 != null) {
            //num1.add(l1.val);
            l1 = l1.next;
            size1++;
        }
        while (l2 != null) {
            //num2.add(l2.val);
            l2 = l2.next;
            size2++;
        }
        if (size1 > size2) {
            while (size1 - size2 != 0) {
                num1.add(0);
                size1--;
            }
        } else {
            while (size2 - size1 != 0) {
                num2.add(0);
                size2--;
            }
        }
        while (l1 != null) {
            num1.add(l1.val);
            l1 = l1.next;
            //size1++;
        }
        while (l2 != null) {
            num2.add(l2.val);
            l2 = l2.next;
            //size2++;
        }
        ListNode tmp = new ListNode();
        int addOn = 0;
        for (int i = num1.size(); i >= 0; i--) {
            int sum = 0;
            if (num1.get(i) + num2.get(i) + addOn < 10) {
                sum = addOn + num1.get(i) + num2.get(i);
                addOn = 0;
            } else {
                addOn = (num1.get(i) + num2.get(i));
                sum = (num1.get(i) + num2.get(i) % 10);
            }
            tmp.val = sum;
            ListNode n = new ListNode(0);
            n.next = tmp;
            tmp = n;
        }

        return tmp.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(7);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(8);
        l1.next.next.next = new ListNode(3);

        System.out.println("\nL1 ");
        print(l1);


        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        System.out.println("\nL2 ");
        print(l2);

        ListNode ans = addTwoNumbers(l1, l2);
        System.out.println("\n");
        print(ans);

    }

    private static void print(ListNode ans) {
        while (ans != null) {

            System.out.print(ans.val + " ");
            ans = ans.next;
        }
    }
}
