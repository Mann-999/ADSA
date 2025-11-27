class Main {

    static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static Node reverse(Node head){
        Node prev = null;
        Node current = head;
        Node next;

        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public static void print(Node head){
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        head = reverse(head);
        print(head);
    }
}
