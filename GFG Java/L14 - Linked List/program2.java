
class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

class LinkedList {
    Node head;
    Node tail;
    int size = 0;

    int search(int target) {
        if (head == null)
            return -1;
        Node temp = head;
        int idx = 0;
        while (temp != null) {
            if (temp.val == target)
                return idx;
            temp = temp.next;
            idx++;
        }
        return -1;
    }

    void addAtTail(int val) {
        Node curr = new Node(val);
        size++;
        if (tail == null) {
            head = tail = curr;
            return;
        }
        tail.next = curr;
        tail = curr;
    }

    void addAtHead(int val) {
        Node curr = new Node(val);
        size++;
        if (head == null) {
            head = tail = curr;
            return;
        }
        curr.next = head;
        head = curr;
    }

    void deleteAtHead() {
        if (head == null)
            return; 
        
        size--;
        if (head.next == null) {
            head = tail = null;
            return;
        }

        head = head.next;
    }

    void display() {
        if (head == null)
            return;
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void insert(int idx, int val) {
        if (idx > size || idx < 0) {
            System.out.println("Invalid index.");
            return;
        }
        if (idx == 0) {
            addAtHead(val);
            return;
        }
        if (idx == size) {
            addAtTail(val);
            return;
        }
        Node temp = head;
        Node curr = new Node(val);
        for (int i = 1; i < idx; i++) {
            temp = temp.next;
        }
        curr.next = temp.next;
        temp.next = curr;
        size++;
    }

    int get(int idx) {
        if (idx >= size)
            return -1;
        Node temp = head;
        for (int i = 1; i <= idx; i++) {
            temp = temp.next;
        }
        return temp.val;
    }

    void deleteAtTail() {
        Node temp = head;
        for (int i = 1; i < size - 1; i++) {
            temp = temp.next;
        }
        tail = temp;
        temp.next = null;
        size--;
    }

    void delete(int idx) {
        if (idx >= size || idx < 0) {
            System.out.println("Invalid Index");
            return;
        }
        if (idx == 0) {
            deleteAtHead();
            return;
        }
        if (idx == size - 1) {
            deleteAtTail();
            return;
        }
        Node temp = head;
        for (int i = 1; i < idx; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }

}

class program2 {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        // ll.addAtTail(10);
        // ll.addAtTail(20);
        // ll.addAtTail(30);
        // ll.addAtHead(40);
        // ll.addAtTail(50);
        // ll.addAtHead(60);
        // ll.display();
        // System.out.println(ll.size);
        // ll.deleteAtHead();
        // ll.display();
        // System.out.println(ll.size);
        // System.out.println(ll.search(16));
        // System.out.println(ll.search(40));
        // ll.deleteAtHead();
        // ll.addAtTail(10); // 0
        // ll.addAtTail(20); // 1
        // ll.addAtTail(30); // 2
        // ll.addAtTail(40); // 3
        // ll.addAtTail(50); // 4
        // ll.display();
        // System.out.println(ll.size);
        // ll.insert(1, 100);
        // ll.display();
        // System.out.println(ll.size);
        ll.insert(0, 10);
        ll.insert(1, 20);
        ll.insert(2, 30);
        ll.insert(3, 40);
        ll.display();
        System.out.println(ll.get(4));
        ll.deleteAtTail();
        ll.display();
        ll.delete(1);
        ll.display();
        

    }
}
