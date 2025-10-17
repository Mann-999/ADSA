import java.util.Scanner;

public class TotalOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to count occurrences: ");
        int key = sc.nextInt();

        int count = countOccurrences(arr, key);

        if (count == 0)
            System.out.println("Element not found!");
        else
            System.out.println("Total occurrences of element: " + count);

        sc.close();
    }

    public static int countOccurrences(int[] arr, int key) {
        int count = 0;
        for (int num : arr) {
            if (num == key)
                count++;
        }
        return count;
    }
}
