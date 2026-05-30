/* Node of a Linked List */

class Node {
    Node(int val) {
        this.val = val;
    }
    int val;
    Node next;
}


class program1 {
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        display(a);
        System.out.println();
        displayRec(a);
        System.out.println();
        System.out.println(get(a, 4));
    }

    // Traversing using loops
    public static void display(Node head) {
        Node pointer = head;
        while (pointer != null) {
            System.out.print(pointer.val + " ");
            pointer = pointer.next;
        }
    }

    // Using recursion
    public static void displayRec(Node head) {
        if (head == null)
            return;
        System.out.print(head.val + " ");
        displayRec(head.next);
    }

    public static int get(Node head, int idx) {
        Node temp = head;
        for (int i = 1; i <= idx; i++) {
            temp = temp.next;
        }
        return temp.val;
    }
}
