class MaxInRotatedArray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int max = findMax(arr);
        System.out.println("Maximum element: " + max);
    }

    static int findMax(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] > arr[right]) left = mid;
            else right = mid - 1;
            if (left == right - 1 && arr[left] > arr[right]) return arr[left];
            if (left == right - 1 && arr[right] > arr[left]) return arr[right];
        }
        return arr[left];
    }
}
