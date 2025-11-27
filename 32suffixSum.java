import java.util.*;

class Main {

    public static int[] suffixSum(int[] arr) {
        int[] res = new int[arr.length];
        res[arr.length - 1] = arr[arr.length - 1];
        for(int i = arr.length - 2; i >= 0; i--){
            res[i] = res[i + 1] + arr[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 3, 7};
        int[] result = suffixSum(arr);
        System.out.println(Arrays.toString(result));
    }
}
