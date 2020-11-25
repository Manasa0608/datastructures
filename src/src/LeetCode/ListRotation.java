package LeetCode;

public class ListRotation {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        public ListNode() {

        }
    }

    public static ListNode rotateRight(ListNode head, int k) {
        int count = 1;
        ListNode current = head;
        while (count < k && current != null) {
            current = current.next;
            count++;
        }

        if (current == null)
            return null;

        ListNode kthNode = current;

        while (current.next != null)
            current = current.next;

        current.next = head;

        head = kthNode.next;
        kthNode.next = null;


        return head;
    }

    public static void print(ListNode head) {
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode one = new ListNode(2);
        ListNode two = new ListNode(3);
        ListNode three = new ListNode(4);
        ListNode four = new ListNode(5);

        head.next = one;
        one.next = two;
        two.next = three;
        three.next = four;
        System.out.println("Before rotating ");
        print(head);
        rotateRight(head, 2);
        System.out.println("After rotating ");
        print(head);
    }
}
