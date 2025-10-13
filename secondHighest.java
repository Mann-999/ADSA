public class secondHighest {
    public static void main(String[] args) {
        int[] arr = {3, 9, 2, 9, 5};

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num < first) {
                second = num;
            }
        }

        if (second == Integer.MIN_VALUE) {
            System.out.println("No second highest element");
        } else {
            System.out.println("Second highest element: " + second);
        }
    }
}
