package LinkedList;

public class Questions {
    private Node head;
    private Node tail;

    private int size;

    public Questions() {
        this.size = 0;
    }

    // https://leetcode.com/problems/happy-number/description/
    public static boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        while(slow != 1 && fast != 1) {
            slow = digitSquare(slow);

            fast = digitSquare(digitSquare(fast));

            if(slow == fast) {
                break;
            }
        }

        if(slow == 1 || fast == 1) {
            return true;
        }

        return false;
    }

    private static int digitSquare(int n) {
        int ans = 0;
        while(n != 0) {
            int ld = n % 10;
            ans += (ld * ld);
            n /= 10;
        }

        return ans;
    }

    private class Node {
        private int value;
        private Node next;

        public Node() {}

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        System.out.println(isHappy(10));
    }
}
