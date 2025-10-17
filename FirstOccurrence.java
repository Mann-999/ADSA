import java.util.Scanner;

public class FirstOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to find first occurrence: ");
        int key = sc.nextInt();

        int index = findFirstOccurrence(arr, key);

        if (index == -1)
            System.out.println("Element not found!");
        else
            System.out.println("First occurrence of element is at index: " + index);

        sc.close();
    }

    public static int findFirstOccurrence(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key)
                return i;
        }
        return -1;
    }
}
