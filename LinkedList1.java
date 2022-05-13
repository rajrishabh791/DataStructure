package DataStructure;

public class LinkedList1 {
    Node head;

    public void addLast(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;
        if (head == null) {
            head = newNode;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
    }

    public void addFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;

        newNode.next = head;
        head = newNode;
    }

    public void addAt(int index, int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;

        Node n = head;
        for (int i = 0; i < index - 1; i++) {
            n = n.next;
        }
        newNode.next = n.next;
        n.next = newNode;
    }

        public void show()
        {
            Node newNode = head;
            while (newNode != null) {
                System.out.println(newNode.data);
                newNode = newNode.next;
            }
        }
    public void deleteFirst(int index) {

        if (index == 0) {
           head = head.next;
        }
        else {
            Node n = head;
            Node n1 = null;
            for (int i=0; i<index-1;i++)
            {
                n = n.next;
            }
            n1 = n.next;
            n.next = n1.next;

        }
    }
}
