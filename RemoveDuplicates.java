import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 1, 5, 3};

        Set<Integer> uniqueSet = new LinkedHashSet<>();
        for (int num : arr) {
            uniqueSet.add(num);
        }

        int[] result = new int[uniqueSet.size()];
        int i = 0;
        for (int num : uniqueSet) {
            result[i++] = num;
        }

        System.out.println("Array after removing duplicates: " + Arrays.toString(result));
    }
}
