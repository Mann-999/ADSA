class Main {

    static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static Node insertAtPosition(Node head, int val, int pos){
        Node newNode = new Node(val);
        if(pos == 1){
            newNode.next = head;
            return newNode;
        }
        Node temp = head;
        for(int i = 1; i < pos - 1 && temp != null; i++){
            temp = temp.next;
        }
        if(temp == null) return head;
        newNode.next = temp.next;
        temp.next = newNode;
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

        head = insertAtPosition(head, 15, 2);
        traverse(head);
    }
}
