class Main {

    static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static Node deleteNode(Node head, int val){
        if(head == null) return null;
        if(head.data == val) return head.next;
        Node temp = head;
        while(temp.next != null && temp.next.data != val){
            temp = temp.next;
        }
        if(temp.next != null){
            temp.next = temp.next.next;
        }
        return head;
    }

    public static void traverse(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        head = deleteNode(head, 30);
        traverse(head);
    }
}
