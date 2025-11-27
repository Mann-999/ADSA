class Main {

    static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static boolean isCircular(Node head){
        if(head == null) return false;
        Node slow = head, fast = head.next;
        while(fast != null && fast.next != null){
            if(slow == fast) return true;
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = head;

        System.out.println(isCircular(head));
    }
}
