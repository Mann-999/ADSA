class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        next = null;
    }
}

class queueLL{
    static ListNode rear = null;
    static ListNode frnt = null;
    static int size = 0;
    
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        for(int i : arr){
            push(i);
        }

        pop();
        pop();

        System.out.println(top());
    }

    public static void push(int x) {
        ListNode el = new ListNode(x);

        if(frnt == null) {
            frnt = rear = el;
        } else {
            rear.next = el;
            rear = el;
        }
        size++;
    }

    public static void pop() {
        ListNode xx = frnt.next;
        frnt.next = null;
        frnt = xx;

        if (frnt == null) rear = null;
        size--;
    }

    public static int top() {
        if(frnt == null) return -1;
        return frnt.val;
    }
}