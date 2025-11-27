class Main {

    static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static Node reverse(Node head){
        Node prev = null, next = null;
        while(head != null){
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    public static Node addOne(Node head){
        head = reverse(head);
        Node temp = head;
        int carry = 1;

        while(temp != null){
            int sum = temp.data + carry;
            temp.data = sum % 10;
            carry = sum / 10;

            if(carry == 0) break;
            if(temp.next == null && carry == 1){
                temp.next = new Node(1);
                carry = 0;
                break;
            }
            temp = temp.next;
        }

        return reverse(head);
    }

    public static void print(Node head){
        while(head != null){
            System.out.print(head.data);
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(9);
        head.next = new Node(9);
        head.next.next = new Node(9);

        head = addOne(head);
        print(head);
    }
}
