import java.util.*;

class Main {

    public static int[] prefixSum(int[] arr) {
        int[] res = new int[arr.length];
        res[0] = arr[0];
        for(int i = 1; i < arr.length; i++){
            res[i] = res[i-1] + arr[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 3, 7};
        int[] result = prefixSum(arr);
        System.out.println(Arrays.toString(result));
    }
}
