package LinkedList;

import java.util.List;

public class PracLL {
    ListNode head;

    // https://leetcode.com/problems/palindrome-linked-list/
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode prev = slow;
        ListNode curr = slow.next;
        ListNode next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        slow.next = null;

        ListNode dummyHead = head;
        ListNode end = slow;

        while (dummyHead != end) {
            if (dummyHead.val != slow.val) {
                return false;
            }
            dummyHead = dummyHead.next;
            slow = slow.next;
        }

        return true;
    }

    // https://leetcode.com/problems/reorder-list/
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }

        ListNode mid = midNode(head);
        ListNode second = mid.next;
        mid.next = null;
        ListNode lastNodeAfterReverse = reverseList(second);

        ListNode first = head;
        ListNode nextfromFront;
        ListNode nextfromLast;

        while (lastNodeAfterReverse != null) {
            nextfromFront = first.next;
            nextfromLast = lastNodeAfterReverse.next;

            first.next = lastNodeAfterReverse;
            lastNodeAfterReverse.next = nextfromFront;

            first = nextfromFront;
            lastNodeAfterReverse = nextfromLast;
        }
    }

    private ListNode midNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }

    private ListNode reverseList(ListNode node) {
        if (node == null)
            return node;

        ListNode curr = node;
        ListNode next;
        ListNode prev = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    // https://leetcode.com/problems/reverse-nodes-in-k-group
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || head.next == null || k == 1) {
            return head;
        }

        int size = length(head);
        int op = size / k;

        ListNode curr = head;
        ListNode prev = null;

        while (op-- > 0) {
            ListNode last = prev;
            ListNode newEnd = curr;

            ListNode next;
            int len = k;
            while (len-- > 0) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }

            newEnd.next = curr;
            if (last == null) {
                head = prev;
            } else {
                last.next = prev;
            }

            prev = newEnd;
        }

        return head;
    }

    private int length(ListNode head) {
        int size = 0;
        while (head != null) {
            size++;
            head = head.next;
        }

        return size;
    }

    // https://www.interviewbit.com/problems/reverse-alternate-k-nodes/
    public ListNode reverseAlternateKGroup(ListNode A, int k) {
        if (head == null || head.next == null || k == 1) {
            return head;
        }


        ListNode curr = head;
        ListNode prev = null;

        while (curr != null) {
            ListNode last = prev;
            ListNode newEnd = curr;

            ListNode next;
            int len = k;
            while (len-- > 0) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }

            newEnd.next = curr;
            if (last == null) {
                head = prev;
            } else {
                last.next = prev;
            }

            // skip the k node
            for(int i=0; curr != null & i<k; i++) {
                prev = curr;
                curr = curr.next;
            }
        }

        return head;
    }



    // https://leetcode.com/problems/rotate-list/?envType=problem-list-v2&envId=linked-list
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0) {
            return head;
        }

        int len = 1;
        ListNode last = head;
        while(last.next != null) {
            len++;
            last = last.next;
        }

        last.next = head;

        int rotation = k % len;

        ListNode newEnd = head;
        for(int i=1; i<len-rotation; i++) {
            newEnd = newEnd.next;
        }

        head = newEnd.next;
        newEnd.next = null;

        return head;
    }




    public static void main(String[] args) {
        PracLL ll = new PracLL();
        ll.insertAtFirst(1);
        ll.insertAtFirst(2);
        ll.insertAtFirst(3);
        ll.insertAtFirst(2);
        ll.insertAtFirst(1);

        ll.printLL(ll.head);
        System.out.println(ll.isPalindrome(ll.head));
        ll.printLL(ll.head);

    }

    public void printLL(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void insertAtFirst(int val) {
        ListNode node = new ListNode(val);
        node.next = head;
        head = node;
    }

    public class ListNode {
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
}
