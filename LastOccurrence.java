import java.util.Scanner;

public class LastOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to find last occurrence: ");
        int key = sc.nextInt();

        int index = findLastOccurrence(arr, key);

        if (index == -1)
            System.out.println("Element not found!");
        else
            System.out.println("Last occurrence of element is at index: " + index);

        sc.close();
    }

    public static int findLastOccurrence(int[] arr, int key) {
        int lastIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                lastIndex = i;
            }
        }
        return lastIndex;
    }
}
