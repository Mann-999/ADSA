class SquareRoot {
    public static void main(String[] args) {
        int num = 40;
        int sqrt = findSqrt(num);
        System.out.println("Square root (floor): " + sqrt);
    }

    static int findSqrt(int n) {
        if (n == 0 || n == 1) return n;
        int left = 1, right = n, ans = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid * mid == n) return mid;
            if (mid * mid < n) {
                left = mid + 1;
                ans = mid;
            } else right = mid - 1;
        }
        return ans;
    }
}
