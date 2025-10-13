import java.util.*;

public class highestElement {
    public static void main(String[] args) {
        int[] arr = {3, 9, 2, 9, 5};

        int max = arr[0];
        int index = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }

        System.out.println("First highest element: " + max);
        System.out.println("Index of first highest: " + index);
    }
}
