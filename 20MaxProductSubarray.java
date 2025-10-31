class MaxProductSubarray {
    public static void main(String[] args) {
        int[] arr = { -2, 0, -1, -3, 4, -1, 2, 1 };
        long maxProd = maxProduct(arr);
        System.out.println("Maximum product subarray: " + maxProd);
    }

    public int maxProduct(int[] nums) {
        int maxM = Integer.MIN_VALUE;
        int prefix = 1;
        int suffix= 1;
        for (int i = 0; i < nums.length; i++) {

            if (prefix == 0) {
                prefix = 1;
            }
            if (suffix == 0) {
                suffix = 1;
            }

            prefix *= nums[i];
            suffix *= nums[nums.length-i-1];

            maxM = Math.max(maxM,Math.max(prefix, suffix));
        }
        return maxM;
    }
}