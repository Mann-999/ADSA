class Main {

    static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static void traverse(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(5);
        head.next = new Node(10);
        head.next.next = new Node(15);
        head.next.next.next = new Node(20);

        traverse(head);
    }
}
