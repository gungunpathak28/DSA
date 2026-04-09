class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class LinkedListTraversal {
    Node head;
    void traverse() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedListTraversal list = new LinkedListTraversal();
        list.head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        list.head.next = second;
        second.next = third;
        list.traverse();
    }
}